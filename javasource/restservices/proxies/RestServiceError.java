// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class RestServiceError
{
	private final IMendixObject restServiceErrorMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "RestServices.RestServiceError";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		errorMessage("errorMessage"),
		errorCode("errorCode");

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

	public RestServiceError(IContext context)
	{
		this(context, Core.instantiate(context, "RestServices.RestServiceError"));
	}

	protected RestServiceError(IContext context, IMendixObject restServiceErrorMendixObject)
	{
		if (restServiceErrorMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("RestServices.RestServiceError", restServiceErrorMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a RestServices.RestServiceError");

		this.restServiceErrorMendixObject = restServiceErrorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RestServiceError.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.RestServiceError initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return restservices.proxies.RestServiceError.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.RestServiceError initialize(IContext context, IMendixObject mendixObject)
	{
		return new restservices.proxies.RestServiceError(context, mendixObject);
	}

	public static restservices.proxies.RestServiceError load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.RestServiceError.initialize(context, mendixObject);
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
	 * @return value of errorMessage
	 */
	public final String geterrorMessage()
	{
		return geterrorMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of errorMessage
	 */
	public final String geterrorMessage(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.errorMessage.toString());
	}

	/**
	 * Set value of errorMessage
	 * @param errormessage
	 */
	public final void seterrorMessage(String errormessage)
	{
		seterrorMessage(getContext(), errormessage);
	}

	/**
	 * Set value of errorMessage
	 * @param context
	 * @param errormessage
	 */
	public final void seterrorMessage(IContext context, String errormessage)
	{
		getMendixObject().setValue(context, MemberNames.errorMessage.toString(), errormessage);
	}

	/**
	 * @return value of errorCode
	 */
	public final String geterrorCode()
	{
		return geterrorCode(getContext());
	}

	/**
	 * @param context
	 * @return value of errorCode
	 */
	public final String geterrorCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.errorCode.toString());
	}

	/**
	 * Set value of errorCode
	 * @param errorcode
	 */
	public final void seterrorCode(String errorcode)
	{
		seterrorCode(getContext(), errorcode);
	}

	/**
	 * Set value of errorCode
	 * @param context
	 * @param errorcode
	 */
	public final void seterrorCode(IContext context, String errorcode)
	{
		getMendixObject().setValue(context, MemberNames.errorCode.toString(), errorcode);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return restServiceErrorMendixObject;
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
			final restservices.proxies.RestServiceError that = (restservices.proxies.RestServiceError) obj;
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
		return "RestServices.RestServiceError";
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
