// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package permissionsapi.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class AppRole
{
	private final IMendixObject appRoleMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PermissionsAPI.AppRole";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UUID("UUID"),
		DisplayName("DisplayName");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public AppRole(IContext context)
	{
		this(context, Core.instantiate(context, "PermissionsAPI.AppRole"));
	}

	protected AppRole(IContext context, IMendixObject appRoleMendixObject)
	{
		if (appRoleMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("PermissionsAPI.AppRole", appRoleMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PermissionsAPI.AppRole");

		this.appRoleMendixObject = appRoleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AppRole.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static permissionsapi.proxies.AppRole initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return permissionsapi.proxies.AppRole.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static permissionsapi.proxies.AppRole initialize(IContext context, IMendixObject mendixObject)
	{
		return new permissionsapi.proxies.AppRole(context, mendixObject);
	}

	public static permissionsapi.proxies.AppRole load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return permissionsapi.proxies.AppRole.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of UUID
	 */
	public final String getUUID()
	{
		return getUUID(getContext());
	}

	/**
	 * @param context
	 * @return value of UUID
	 */
	public final String getUUID(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.UUID.toString());
	}

	/**
	 * Set value of UUID
	 * @param uuid
	 */
	public final void setUUID(String uuid)
	{
		setUUID(getContext(), uuid);
	}

	/**
	 * Set value of UUID
	 * @param context
	 * @param uuid
	 */
	public final void setUUID(IContext context, String uuid)
	{
		getMendixObject().setValue(context, MemberNames.UUID.toString(), uuid);
	}

	/**
	 * @return value of DisplayName
	 */
	public final String getDisplayName()
	{
		return getDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayName
	 */
	public final String getDisplayName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.DisplayName.toString());
	}

	/**
	 * Set value of DisplayName
	 * @param displayname
	 */
	public final void setDisplayName(String displayname)
	{
		setDisplayName(getContext(), displayname);
	}

	/**
	 * Set value of DisplayName
	 * @param context
	 * @param displayname
	 */
	public final void setDisplayName(IContext context, String displayname)
	{
		getMendixObject().setValue(context, MemberNames.DisplayName.toString(), displayname);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return appRoleMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final permissionsapi.proxies.AppRole that = (permissionsapi.proxies.AppRole) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "PermissionsAPI.AppRole";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
