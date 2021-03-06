// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package appcloudservices.actions;

import appcloudservices.OpenIDHandler;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class StartSignOnServlet extends CustomJavaAction<Boolean>
{
	public StartSignOnServlet(IContext context)
	{
		super(context);
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Core.addRequestHandler(OpenIDHandler.OPENID_CLIENTSERVLET_LOCATION, new OpenIDHandler());
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "StartSignOnServlet";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
