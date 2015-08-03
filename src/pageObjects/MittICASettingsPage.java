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

public class MittICASettingsPage extends MasterPage {

	
	public MittICASettingsPage(PageObjects repository)
	{
	super(repository);
	}
	
	public static  LocatorObject SettingsKontohantering_Link = new LocatorObject("header.summary > h2.title","Setings> Click account management in settings",LocatorObject.CSS);
	public static  LocatorObject SettingsNewCardReq_Link = new LocatorObject("orderCodeSendRWD","Settings> New card request",LocatorObject.ID);
	public static  LocatorObject ICABankcard_Link = new LocatorObject("Spärra eller beställ ICA-kort","Settings> ICA Bank Card Link",LocatorObject.LINKTEXT);
	public static  LocatorObject ICAStudent_Link = new LocatorObject("#student > header.summary > h2.title","Settings> ICA Student Tab",LocatorObject.CSS);
	  public MittICASettingsPage atMittICASettingsPage(){
			
				return this;
			}
	  
	  
	    public MittICASettingsPage VerifyICABankCustomer()
	    {
	    Action.ActionLog("Expected Result:New Card Request button is present");
	    Action.Click(SettingsKontohantering_Link);
	    Action.driverwait(5);
	    Action.verifyElementPresent(SettingsNewCardReq_Link);
	    Action.ActionLog("Actual Result :New Card Request button is present");
	    return this;
	    }
	    public MittICASettingsPage VerifyICACardCustomer()
	    {
	    Action.ActionLog("Expected Result:ICA bank card details should not be there");
	    Action.Click(SettingsKontohantering_Link);
	    Action.driverwait(5);
	    if (Action.IsVisible(ICABankcard_Link))
	    {
	    Action.ActionLog("Actual Result :ICA bank card details are there:Failed");
	    }
	    else
	    { 
	    Action.ActionLog("Actual Result :ICA bank card details not there:Passed");
	    }
	    return this;
	    }
	    public MittICASettingsPage VerifyStudentCustomer()
	    {
	    Action.ActionLog("Expected Result:Student tab should be there");
	    if (Action.IsElementPresent(ICAStudent_Link))
	    {
	    Action.ActionLog("Actual Result :ICA Student tab is present");
	    }
	    else
	    { 
	    Action.ActionLog("Actual Result :ICA Student tab is not present");
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
public MittICASettingsPage NavigateToMittICA()
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
