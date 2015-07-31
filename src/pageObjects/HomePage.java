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
	
		
	  public HomePage atHomePage(){
			
				return this;
			}
	  
	  public HomePage GotoHomePage()
	{
		// ActionLog("Login to home page" +  configuration.ServerName());
		System.out.println(Configuration.ServerName());
		Action.OpenURl(Configuration.ServerName());
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
	Action.Click(Master_Login_Link);
	
	return this;
}

public HomePage NavigateToHandlaHomePage() 
{
	if(Action.IsVisible(Master_Mobile_Mer_Button))
	{
	 Action.Click(Master_Mobile_Mer_Button);
	 Action.Click(Master_Mobile_Handla_Button);
	}
	else
	{
	Action.Click(Master_Handla_Button);
	}
	
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
	if(Action.IsVisible(Master_Guest_Mitt_ICA_Link))
		Action.Click(Master_Guest_Mitt_ICA_Link);
		else
			Action.Click(Master_SignIN_Mitt_ICA_Link);
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

public HomePage NavigateToDashboardPage()
{
            NavigateToMittICA();
            Action.Click(Master_DashboardSummary_Link);
            return this;
}
public HomePage NavigateToMittICASettingsPage()
{
            NavigateToMittICA();
            Action.Click(Master_DashboardSummary_Link);
            Action.Click(Master_DashboardSettings_Link);
            return this;
}
}
