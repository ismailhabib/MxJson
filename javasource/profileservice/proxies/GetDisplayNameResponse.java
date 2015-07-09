// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package profileservice.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class GetDisplayNameResponse
{
	private final IMendixObject getDisplayNameResponseMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "ProfileService.GetDisplayNameResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Result("Result");

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

	public GetDisplayNameResponse(IContext context)
	{
		this(context, Core.instantiate(context, "ProfileService.GetDisplayNameResponse"));
	}

	protected GetDisplayNameResponse(IContext context, IMendixObject getDisplayNameResponseMendixObject)
	{
		if (getDisplayNameResponseMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("ProfileService.GetDisplayNameResponse", getDisplayNameResponseMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a ProfileService.GetDisplayNameResponse");

		this.getDisplayNameResponseMendixObject = getDisplayNameResponseMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GetDisplayNameResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static profileservice.proxies.GetDisplayNameResponse initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return profileservice.proxies.GetDisplayNameResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static profileservice.proxies.GetDisplayNameResponse initialize(IContext context, IMendixObject mendixObject)
	{
		return new profileservice.proxies.GetDisplayNameResponse(context, mendixObject);
	}

	public static profileservice.proxies.GetDisplayNameResponse load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return profileservice.proxies.GetDisplayNameResponse.initialize(context, mendixObject);
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
	 * @return value of Result
	 */
	public final String getResult()
	{
		return getResult(getContext());
	}

	/**
	 * @param context
	 * @return value of Result
	 */
	public final String getResult(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Result.toString());
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final void setResult(String result)
	{
		setResult(getContext(), result);
	}

	/**
	 * Set value of Result
	 * @param context
	 * @param result
	 */
	public final void setResult(IContext context, String result)
	{
		getMendixObject().setValue(context, MemberNames.Result.toString(), result);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return getDisplayNameResponseMendixObject;
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
			final profileservice.proxies.GetDisplayNameResponse that = (profileservice.proxies.GetDisplayNameResponse) obj;
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
		return "ProfileService.GetDisplayNameResponse";
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
