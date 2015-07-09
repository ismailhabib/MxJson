// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.util.Utils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * makes sure the input url ends with '/' if this is not already the case
 */
public class appendSlashToUrl extends CustomJavaAction<String>
{
	private String url;

	public appendSlashToUrl(IContext context, String url)
	{
		super(context);
		this.url = url;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Utils.appendSlashToUrl(url);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "appendSlashToUrl";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
