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
	
	public static  LocatorObject ZipcodeSearch_Textbox = new LocatorObject("(//input[@type='search'])[2]","Matkassen Page> ZipCode search field",LocatorObject.XPATH);
	public static  LocatorObject ZipcodeSeach_Button = new LocatorObject("(//button[@type='submit'])[2]","Matkassen Page> ZipCode search field",LocatorObject.XPATH);
	
	public static  LocatorObject Search_Store_Name_Link = new LocatorObject("//div[@id='content']/article/section/div/ul/li[[*]]/header/a[2]","Matkassen Page> ZipCode search field",LocatorObject.XPATH);
	public static  LocatorObject Bestall_Button = new LocatorObject("Beställ","Matkassen Page> ZipCode search field",LocatorObject.LINKTEXT);
	
	public static  LocatorObject EmailID_Textbox = new LocatorObject("emai","Matkassen Page> ZipCode search field",LocatorObject.ID);
	public static  LocatorObject Email_Confirmation_Textbox = new LocatorObject("email2","Matkassen Page> ZipCode search field",LocatorObject.NAME);
		
	
	public static  LocatorObject Next_Button = new LocatorObject("Nästa","Matkassen Page> Nästa",LocatorObject.LINKTEXT);
	public static  LocatorObject TermsCondition_Textbox = new LocatorObject("approveTermsAndConditions","Matkassen Page> approveTermsAndConditions",LocatorObject.ID);
		
	
	
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
	Action.enterText(ZipcodeSearch_Textbox, zipcode);
	Action.Click(ZipcodeSeach_Button);
	Action.Click(Search_Store_Name_Link.Replace("1"));
	Action.Click(Bestall_Button);
	return this;
}



}
