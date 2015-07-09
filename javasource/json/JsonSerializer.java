package json;

import com.mendix.core.Core;
import com.mendix.core.objectmanagement.member.MendixObjectReference;
import com.mendix.core.objectmanagement.member.MendixObjectReferenceSet;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

/**
 * Created by imu on 7/8/2015.
 */
public class JsonSerializer {

	private static final ILogNode LOGGER = Core.getLogger(JsonSerializer.class.getName());

	private static String getTargetMemberName(IContext context,
											  IMendixObject view, String sourceAttr) {
		String name = restservices.util.Utils.getShortMemberName(sourceAttr);
		if (view.hasMember(name + "_jsonkey"))
			name = (String) view.getValue(context, name + "_jsonkey");
		if (name == null || name.trim().isEmpty())
			throw new IllegalStateException("During JSON serialization: Object of type '" + view.getType() + "', member '" + sourceAttr + "' has a corresponding '_jsonkey' attribute, but its value is empty.");

		return name;
	}

	private static Object identifierToJSON(IContext context, IMendixIdentifier id) throws Exception {
		if (id == null)
			return null;

		/* Write the object itself */
		IMendixObject obj = Core.retrieveId(context, id); //Optimize: for refset use retrieve ids
		if (obj == null) {
			LOGGER.warn("Failed to retrieve identifier: " + id + ", does the object still exist?");
			return null;
		}
		else
			return writeMendixObjectToJson(context, obj);
	}

	private static void serializeMember(IContext context, JSONObject target, String targetMemberName,
										IMendixObjectMember<?> member, IMetaObject viewType) throws Exception {
		if (context == null)
			throw new IllegalStateException("Context is null");

		Object value = member.getValue(context);
		String memberName = member.getName();

		if (Utils.isSystemAttribute(memberName)) {
			//skip
		}
		//Primitive?
		else if (!(member instanceof MendixObjectReference) && !(member instanceof MendixObjectReferenceSet)) {

			switch(viewType.getMetaPrimitive(member.getName()).getType()) {
				case AutoNumber:
				case Long:
				case Boolean:
				case Currency:
				case Float:
				case Integer:
					//Numbers or bools should never be null!
					if (value == null)
						throw new IllegalStateException("Primitive member " + member.getName() + " should not be null!");

					target.put(targetMemberName, value);
					break;
				case Enum:
					//fall trough intentional
				case HashString:
				case String:
					if (value == null)
						target.put(targetMemberName, JSONObject.NULL);
					else
						target.put(targetMemberName, value);
					break;
				case Decimal:
					if (value == null)
						target.put(targetMemberName, JSONObject.NULL);
					else
						target.put(targetMemberName, value.toString());
					break;
				case DateTime:
					if (value == null)
						target.put(targetMemberName, JSONObject.NULL);
					else
						target.put(targetMemberName, (((Date)value).getTime()));
					break;
				case Binary:
					break;
				default:
					throw new IllegalStateException("Not supported Mendix Membertype for member " + memberName);
			}
		}

		/**
		 * Reference
		 */
		else if (member instanceof MendixObjectReference){
			if (value != null)
				value = identifierToJSON(context, (IMendixIdentifier) value);

			if (value == null)
				target.put(targetMemberName, JSONObject.NULL);
			else
				target.put(targetMemberName, value);
		}

		/**
		 * Referenceset
		 */
		else if (member instanceof MendixObjectReferenceSet){
			JSONArray ar = new JSONArray();
			if (value != null) {
				@SuppressWarnings("unchecked")
				List<IMendixIdentifier> ids = (List<IMendixIdentifier>) value;
				Utils.sortIdList(ids);
				for(IMendixIdentifier id : ids) if (id != null) {
					Object url = identifierToJSON(context, id);
					if (url != null)
						ar.put(url);
				}
			}
			target.put(targetMemberName, ar);
		}

		else
			throw new IllegalStateException("Unimplemented membertype " + member.getClass().getSimpleName());
	}

	public static JSONObject writeMendixObjectToJson(IContext context, IMendixObject view) throws Exception {
		if (view == null)
			throw new IllegalArgumentException("Mendix to JSON conversion expects an object");

		if (!Utils.hasDataAccess(view.getMetaObject(), context))
			throw new IllegalStateException("During JSON serialization: Object of type '" + view.getType() + "' has no readable members for users with role(s) " + context.getSession().getUserRolesNames() + ". Please check the security rules");

		JSONObject res = new JSONObject();

		Map<String, ? extends IMendixObjectMember<?>> members = view.getMembers(context);
		for(java.util.Map.Entry<String, ? extends IMendixObjectMember<?>> e : members.entrySet())
			serializeMember(context, res, getTargetMemberName(context, view, e.getKey()), e.getValue(), view.getMetaObject());

		return res;
	}
}
