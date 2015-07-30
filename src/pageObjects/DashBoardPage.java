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

public class DashBoardPage extends MasterPage {

	
	public DashBoardPage(PageObjects repository)
	{
	super(repository);
	}
	
	public static  LocatorObject Dashboard_Summary_Link = new LocatorObject("span.user-name","Dashboard> Click Nameof The User In Dashboard",LocatorObject.CSS);
	public static  LocatorObject Dashboard_Settings_Link = new LocatorObject("Inställningar","Dashboard> Settings",LocatorObject.LINKTEXT);
	public static  LocatorObject Dashboard_Account_Link = new LocatorObject("Konto & saldo","Dashboard> Account",LocatorObject.LINKTEXT);
	public static  LocatorObject Dashboard_Bonus_Link = new LocatorObject("Bonus","Dashboard> Bonus",LocatorObject.LINKTEXT);
	public static  LocatorObject Dashboard_OldBase_Link = new LocatorObject("Ansök om ICA-kort","Dashboard> Bonus",LocatorObject.LINKTEXT);
		
	  public DashBoardPage atDashBoardPage(){
			
				return this;
			}
	  
	  
	  
	  public DashBoardPage VerifyDashboardBaseCustomer()
	    {
	    Action.ActionLog("Expected Result:The customer is an old base customer");
	    Action.Click(Dashboard_Summary_Link);
	    Action.driverwait(5);
	    Action.Click(Dashboard_Account_Link);
	    Action.verifyElementPresent(Dashboard_OldBase_Link);
	    Action.ActionLog("Actual Result :The customer is an old base customer");
	    return this;
	    }
	
//<summary>
//Navigate to Mitt ICA
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/22/2015		Action: Created
//</revision>
public DashBoardPage NavigateToMittICA()
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

}
