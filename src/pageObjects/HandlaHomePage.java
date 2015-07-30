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

public class HandlaHomePage extends MasterPage {

	
	public HandlaHomePage(PageObjects repository)
	{
	super(repository);
	}
	
	public static  LocatorObject Matkassen_Link = new LocatorObject("(//a[contains(text(),'Matkassen')])[2]","Handla Home Page>Menu bar> Matkassen Link",LocatorObject.XPATH);
		
	  public HandlaHomePage atHandlaHomePage(){
			
				return this;
			}
	  
	
	// <summary>
//   Navigate to login page
//</summary>
//<revision>
//    Author:	Nidhish Jain
//    Date:	07/22/2015		Action: Created
//</revision>
public HandlaHomePage NavigateToMatkassen() 
{
	//Action.waitt(Login_Link);
	Action.Click(Matkassen_Link);
	
	return this;
}
//<summary>
//Navigate to Mitt ICA
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/22/2015		Action: Created
//</revision>
public HandlaHomePage NavigateToMittICA()
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
public HandlaHomePage VerifyStoreCache()
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
