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
public class DataServiceDefinition
{
	private final IMendixObject dataServiceDefinitionMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "RestServices.DataServiceDefinition";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		SourceEntity("SourceEntity"),
		SourceKeyAttribute("SourceKeyAttribute"),
		SourceConstraint("SourceConstraint"),
		OnPublishMicroflow("OnPublishMicroflow"),
		OnUpdateMicroflow("OnUpdateMicroflow"),
		OnDeleteMicroflow("OnDeleteMicroflow"),
		EnableListing("EnableListing"),
		EnableGet("EnableGet"),
		EnableUpdate("EnableUpdate"),
		EnableCreate("EnableCreate"),
		EnableDelete("EnableDelete"),
		EnableChangeLog("EnableChangeLog"),
		UseStrictVersioning("UseStrictVersioning"),
		AccessRole("AccessRole");

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

	public DataServiceDefinition(IContext context)
	{
		this(context, Core.instantiate(context, "RestServices.DataServiceDefinition"));
	}

	protected DataServiceDefinition(IContext context, IMendixObject dataServiceDefinitionMendixObject)
	{
		if (dataServiceDefinitionMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("RestServices.DataServiceDefinition", dataServiceDefinitionMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a RestServices.DataServiceDefinition");

		this.dataServiceDefinitionMendixObject = dataServiceDefinitionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DataServiceDefinition.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.DataServiceDefinition initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return restservices.proxies.DataServiceDefinition.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.DataServiceDefinition initialize(IContext context, IMendixObject mendixObject)
	{
		return new restservices.proxies.DataServiceDefinition(context, mendixObject);
	}

	public static restservices.proxies.DataServiceDefinition load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.DataServiceDefinition.initialize(context, mendixObject);
	}

	public static java.util.List<restservices.proxies.DataServiceDefinition> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<restservices.proxies.DataServiceDefinition> result = new java.util.ArrayList<restservices.proxies.DataServiceDefinition>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//RestServices.DataServiceDefinition" + xpathConstraint))
			result.add(restservices.proxies.DataServiceDefinition.initialize(context, obj));
		return result;
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
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final String getDescription(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(IContext context, String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of SourceEntity
	 */
	public final String getSourceEntity()
	{
		return getSourceEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceEntity
	 */
	public final String getSourceEntity(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SourceEntity.toString());
	}

	/**
	 * Set value of SourceEntity
	 * @param sourceentity
	 */
	public final void setSourceEntity(String sourceentity)
	{
		setSourceEntity(getContext(), sourceentity);
	}

	/**
	 * Set value of SourceEntity
	 * @param context
	 * @param sourceentity
	 */
	public final void setSourceEntity(IContext context, String sourceentity)
	{
		getMendixObject().setValue(context, MemberNames.SourceEntity.toString(), sourceentity);
	}

	/**
	 * @return value of SourceKeyAttribute
	 */
	public final String getSourceKeyAttribute()
	{
		return getSourceKeyAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceKeyAttribute
	 */
	public final String getSourceKeyAttribute(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SourceKeyAttribute.toString());
	}

	/**
	 * Set value of SourceKeyAttribute
	 * @param sourcekeyattribute
	 */
	public final void setSourceKeyAttribute(String sourcekeyattribute)
	{
		setSourceKeyAttribute(getContext(), sourcekeyattribute);
	}

	/**
	 * Set value of SourceKeyAttribute
	 * @param context
	 * @param sourcekeyattribute
	 */
	public final void setSourceKeyAttribute(IContext context, String sourcekeyattribute)
	{
		getMendixObject().setValue(context, MemberNames.SourceKeyAttribute.toString(), sourcekeyattribute);
	}

	/**
	 * @return value of SourceConstraint
	 */
	public final String getSourceConstraint()
	{
		return getSourceConstraint(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceConstraint
	 */
	public final String getSourceConstraint(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SourceConstraint.toString());
	}

	/**
	 * Set value of SourceConstraint
	 * @param sourceconstraint
	 */
	public final void setSourceConstraint(String sourceconstraint)
	{
		setSourceConstraint(getContext(), sourceconstraint);
	}

	/**
	 * Set value of SourceConstraint
	 * @param context
	 * @param sourceconstraint
	 */
	public final void setSourceConstraint(IContext context, String sourceconstraint)
	{
		getMendixObject().setValue(context, MemberNames.SourceConstraint.toString(), sourceconstraint);
	}

	/**
	 * @return value of OnPublishMicroflow
	 */
	public final String getOnPublishMicroflow()
	{
		return getOnPublishMicroflow(getContext());
	}

	/**
	 * @param context
	 * @return value of OnPublishMicroflow
	 */
	public final String getOnPublishMicroflow(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.OnPublishMicroflow.toString());
	}

	/**
	 * Set value of OnPublishMicroflow
	 * @param onpublishmicroflow
	 */
	public final void setOnPublishMicroflow(String onpublishmicroflow)
	{
		setOnPublishMicroflow(getContext(), onpublishmicroflow);
	}

	/**
	 * Set value of OnPublishMicroflow
	 * @param context
	 * @param onpublishmicroflow
	 */
	public final void setOnPublishMicroflow(IContext context, String onpublishmicroflow)
	{
		getMendixObject().setValue(context, MemberNames.OnPublishMicroflow.toString(), onpublishmicroflow);
	}

	/**
	 * @return value of OnUpdateMicroflow
	 */
	public final String getOnUpdateMicroflow()
	{
		return getOnUpdateMicroflow(getContext());
	}

	/**
	 * @param context
	 * @return value of OnUpdateMicroflow
	 */
	public final String getOnUpdateMicroflow(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.OnUpdateMicroflow.toString());
	}

	/**
	 * Set value of OnUpdateMicroflow
	 * @param onupdatemicroflow
	 */
	public final void setOnUpdateMicroflow(String onupdatemicroflow)
	{
		setOnUpdateMicroflow(getContext(), onupdatemicroflow);
	}

	/**
	 * Set value of OnUpdateMicroflow
	 * @param context
	 * @param onupdatemicroflow
	 */
	public final void setOnUpdateMicroflow(IContext context, String onupdatemicroflow)
	{
		getMendixObject().setValue(context, MemberNames.OnUpdateMicroflow.toString(), onupdatemicroflow);
	}

	/**
	 * @return value of OnDeleteMicroflow
	 */
	public final String getOnDeleteMicroflow()
	{
		return getOnDeleteMicroflow(getContext());
	}

	/**
	 * @param context
	 * @return value of OnDeleteMicroflow
	 */
	public final String getOnDeleteMicroflow(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.OnDeleteMicroflow.toString());
	}

	/**
	 * Set value of OnDeleteMicroflow
	 * @param ondeletemicroflow
	 */
	public final void setOnDeleteMicroflow(String ondeletemicroflow)
	{
		setOnDeleteMicroflow(getContext(), ondeletemicroflow);
	}

	/**
	 * Set value of OnDeleteMicroflow
	 * @param context
	 * @param ondeletemicroflow
	 */
	public final void setOnDeleteMicroflow(IContext context, String ondeletemicroflow)
	{
		getMendixObject().setValue(context, MemberNames.OnDeleteMicroflow.toString(), ondeletemicroflow);
	}

	/**
	 * @return value of EnableListing
	 */
	public final Boolean getEnableListing()
	{
		return getEnableListing(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableListing
	 */
	public final Boolean getEnableListing(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.EnableListing.toString());
	}

	/**
	 * Set value of EnableListing
	 * @param enablelisting
	 */
	public final void setEnableListing(Boolean enablelisting)
	{
		setEnableListing(getContext(), enablelisting);
	}

	/**
	 * Set value of EnableListing
	 * @param context
	 * @param enablelisting
	 */
	public final void setEnableListing(IContext context, Boolean enablelisting)
	{
		getMendixObject().setValue(context, MemberNames.EnableListing.toString(), enablelisting);
	}

	/**
	 * @return value of EnableGet
	 */
	public final Boolean getEnableGet()
	{
		return getEnableGet(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableGet
	 */
	public final Boolean getEnableGet(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.EnableGet.toString());
	}

	/**
	 * Set value of EnableGet
	 * @param enableget
	 */
	public final void setEnableGet(Boolean enableget)
	{
		setEnableGet(getContext(), enableget);
	}

	/**
	 * Set value of EnableGet
	 * @param context
	 * @param enableget
	 */
	public final void setEnableGet(IContext context, Boolean enableget)
	{
		getMendixObject().setValue(context, MemberNames.EnableGet.toString(), enableget);
	}

	/**
	 * @return value of EnableUpdate
	 */
	public final Boolean getEnableUpdate()
	{
		return getEnableUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableUpdate
	 */
	public final Boolean getEnableUpdate(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.EnableUpdate.toString());
	}

	/**
	 * Set value of EnableUpdate
	 * @param enableupdate
	 */
	public final void setEnableUpdate(Boolean enableupdate)
	{
		setEnableUpdate(getContext(), enableupdate);
	}

	/**
	 * Set value of EnableUpdate
	 * @param context
	 * @param enableupdate
	 */
	public final void setEnableUpdate(IContext context, Boolean enableupdate)
	{
		getMendixObject().setValue(context, MemberNames.EnableUpdate.toString(), enableupdate);
	}

	/**
	 * @return value of EnableCreate
	 */
	public final Boolean getEnableCreate()
	{
		return getEnableCreate(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableCreate
	 */
	public final Boolean getEnableCreate(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.EnableCreate.toString());
	}

	/**
	 * Set value of EnableCreate
	 * @param enablecreate
	 */
	public final void setEnableCreate(Boolean enablecreate)
	{
		setEnableCreate(getContext(), enablecreate);
	}

	/**
	 * Set value of EnableCreate
	 * @param context
	 * @param enablecreate
	 */
	public final void setEnableCreate(IContext context, Boolean enablecreate)
	{
		getMendixObject().setValue(context, MemberNames.EnableCreate.toString(), enablecreate);
	}

	/**
	 * @return value of EnableDelete
	 */
	public final Boolean getEnableDelete()
	{
		return getEnableDelete(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableDelete
	 */
	public final Boolean getEnableDelete(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.EnableDelete.toString());
	}

	/**
	 * Set value of EnableDelete
	 * @param enabledelete
	 */
	public final void setEnableDelete(Boolean enabledelete)
	{
		setEnableDelete(getContext(), enabledelete);
	}

	/**
	 * Set value of EnableDelete
	 * @param context
	 * @param enabledelete
	 */
	public final void setEnableDelete(IContext context, Boolean enabledelete)
	{
		getMendixObject().setValue(context, MemberNames.EnableDelete.toString(), enabledelete);
	}

	/**
	 * @return value of EnableChangeLog
	 */
	public final Boolean getEnableChangeLog()
	{
		return getEnableChangeLog(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableChangeLog
	 */
	public final Boolean getEnableChangeLog(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.EnableChangeLog.toString());
	}

	/**
	 * Set value of EnableChangeLog
	 * @param enablechangelog
	 */
	public final void setEnableChangeLog(Boolean enablechangelog)
	{
		setEnableChangeLog(getContext(), enablechangelog);
	}

	/**
	 * Set value of EnableChangeLog
	 * @param context
	 * @param enablechangelog
	 */
	public final void setEnableChangeLog(IContext context, Boolean enablechangelog)
	{
		getMendixObject().setValue(context, MemberNames.EnableChangeLog.toString(), enablechangelog);
	}

	/**
	 * @return value of UseStrictVersioning
	 */
	public final Boolean getUseStrictVersioning()
	{
		return getUseStrictVersioning(getContext());
	}

	/**
	 * @param context
	 * @return value of UseStrictVersioning
	 */
	public final Boolean getUseStrictVersioning(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.UseStrictVersioning.toString());
	}

	/**
	 * Set value of UseStrictVersioning
	 * @param usestrictversioning
	 */
	public final void setUseStrictVersioning(Boolean usestrictversioning)
	{
		setUseStrictVersioning(getContext(), usestrictversioning);
	}

	/**
	 * Set value of UseStrictVersioning
	 * @param context
	 * @param usestrictversioning
	 */
	public final void setUseStrictVersioning(IContext context, Boolean usestrictversioning)
	{
		getMendixObject().setValue(context, MemberNames.UseStrictVersioning.toString(), usestrictversioning);
	}

	/**
	 * @return value of AccessRole
	 */
	public final String getAccessRole()
	{
		return getAccessRole(getContext());
	}

	/**
	 * @param context
	 * @return value of AccessRole
	 */
	public final String getAccessRole(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.AccessRole.toString());
	}

	/**
	 * Set value of AccessRole
	 * @param accessrole
	 */
	public final void setAccessRole(String accessrole)
	{
		setAccessRole(getContext(), accessrole);
	}

	/**
	 * Set value of AccessRole
	 * @param context
	 * @param accessrole
	 */
	public final void setAccessRole(IContext context, String accessrole)
	{
		getMendixObject().setValue(context, MemberNames.AccessRole.toString(), accessrole);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return dataServiceDefinitionMendixObject;
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
			final restservices.proxies.DataServiceDefinition that = (restservices.proxies.DataServiceDefinition) obj;
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
		return "RestServices.DataServiceDefinition";
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
