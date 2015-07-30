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

public class MatkassenPage extends MasterPage {

	
	public MatkassenPage(PageObjects repository)
	{
	super(repository);
	}
	
	public static  LocatorObject Matkassen_ZipcodeSearch_Textbox = new LocatorObject("(//input[@type='search'])[2]","Matkassen Page> ZipCode search field",LocatorObject.XPATH);
	public static  LocatorObject Matkassen_ZipcodeSeach_Button = new LocatorObject("(//button[@type='submit'])[2]","Matkassen Page> ZipCode search field",LocatorObject.XPATH);
	
	public static  LocatorObject Matkassen_Search_Store_Name_Link = new LocatorObject("//div[@id='content']/article/section/div/ul/li[[*]]/header/a[2]","Matkassen Page> ZipCode search field",LocatorObject.XPATH);
	public static  LocatorObject Matkassen_Bestall_Button = new LocatorObject("Beställ","Matkassen Page> ZipCode search field",LocatorObject.LINKTEXT);
	
	public static  LocatorObject Matkassen_EmailID_Textbox = new LocatorObject("email","Matkassen Page> Email address",LocatorObject.ID);
	public static  LocatorObject Matkassen_Email_Confirmation_Textbox = new LocatorObject("email2","Matkassen Page> ZipCode search field",LocatorObject.NAME);
	public static  LocatorObject Matkassen_Mobile_Textbox = new LocatorObject("mobile","Matkassen Page> ZipCode search field",LocatorObject.NAME);
	
	public static  LocatorObject Matkassen_Next_Button = new LocatorObject("Nästa","Matkassen Page> Nästa",LocatorObject.LINKTEXT);
	public static  LocatorObject Matkassen_TermsCondition_Chkbox = new LocatorObject("approveTermsAndConditions","Matkassen Page> approveTermsAndConditions",LocatorObject.ID);
		
	
	
	  public MatkassenPage atMatkassenPage(){
			
				return this;
			}
	  
	
	// <summary>
//   Navigate to login page
//</summary>
//<revision>
//    Author:	Nidhish Jain
//    Date:	07/22/2015		Action: Created
//</revision>

public MatkassenPage SearchZipcode(String zipcode)
{
	Action.ActionLog("Enter the zip code"+zipcode);
	Action.enterText(Matkassen_ZipcodeSearch_Textbox, zipcode);
	Action.ActionLog("Click on search button");
	Action.Click(Matkassen_ZipcodeSeach_Button);
	Action.ActionLog("Select the store");
	Action.Click(Matkassen_Search_Store_Name_Link.Replace("1"));
	Action.Click(Matkassen_Bestall_Button);
	Action.enterTextWithClear(Matkassen_EmailID_Textbox, "nids@gmail.com");
	Action.enterTextWithClear(Matkassen_Email_Confirmation_Textbox, "nids@gmail.com");
	Action.enterTextWithClear(Matkassen_Mobile_Textbox, "111111111");
	Action.Click(Matkassen_Next_Button);
	Action.WaitForPageLoad();
	Action.Click(Matkassen_TermsCondition_Chkbox);
	Action.Click(Matkassen_Next_Button);
	return this;
}



}
