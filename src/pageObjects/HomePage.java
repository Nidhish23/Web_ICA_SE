// <summary>
//     Home Page Class 
// </summary>
// <revision>
//     Author:	Nidhish Jain
//     Date:	07/14/2015		Action: Created
// </revision>

package pageObjects;
import Utility.Configuration;
import test.Core.*;
import Utility.*;

public class HomePage extends MasterPage {

	
	public HomePage(PageObjects repository)
	{
	super(repository);
	}
	
		
	  public HomePage getHomePage(){
			
				return this;
			}
	  
	  public HomePage GotoHomePage()
	{
		// ActionLog("Login to home page" +  configuration.ServerName());
		System.out.println(configuration.ServerName());
		Action.OpenURl(configuration.ServerName());
		return this;
	}
	// <summary>
//   Navigate to login page
//</summary>
//<revision>
//    Author:	Nidhish Jain
//    Date:	07/22/2015		Action: Created
//</revision>
public HomePage NavigateToLoginpage() 
{
	//Action.waitt(Login_Link);
	Action.Click(Login_Link);
	
	return this;
}
//<summary>
//Navigate to Mitt ICA
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/22/2015		Action: Created
//</revision>
public HomePage NavigateToMittICA()
{
	Action.Click(Mitt_ICA_Link);
	return this;
}

//<summary>
//Store Cache functionality 
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/22/2015		Action: Created
//</revision>
public HomePage VerifyStoreCache()
{
	Action.ActionLog("verify store cache URl "+Configuration.StoreCache());
	Action.ActionLog(" Expected Result :Store Cache functionality should run successfully");
	Action.OpenURl(Configuration.StoreCache());
	Action.ActionLog(Configuration.StoreCache());
	Action.VerifyTextPresent("ok");
	Action.ActionLog("Store Cache functionality verified successfully");
return this;
}
}
