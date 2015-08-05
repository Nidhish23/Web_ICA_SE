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
	public static  LocatorObject Matkassen_TermsCondition_Chkbox = new LocatorObject("//div[@id='reviewView']/div/fieldset/ol/li/label[2]","Matkassen Page> approveTermsAndConditions",LocatorObject.XPATH);
		
	public static  LocatorObject Matkassen_PayexOption_RadioButton = new LocatorObject("//div[@id='availablePaymentOptions']/div[2]/ol/li/label/span","Matkassen Page>>Payex>Radio Button",LocatorObject.XPATH);
	public static  LocatorObject Matkassen_Payex_CardNumber_Textbox = new LocatorObject("ctl00_BodyContentPlaceHolder_PaymentControl_txtCardNumber","Matkassen Page> Payex>Credit Card Number",LocatorObject.ID);
	
	public static  LocatorObject Matkassen_Payex_CardNumber_Holder_Textbox = new LocatorObject("ctl00_BodyContentPlaceHolder_PaymentControl_txtCardHolderName","Matkassen Page> Payex>Credit Card Holder",LocatorObject.ID);
	public static  LocatorObject Matkassen_Payex_ExpireMonth_DropDown = new LocatorObject("ctl00_BodyContentPlaceHolder_PaymentControl_ddExpireMonth","Matkassen Page> Payex>Exp Month",LocatorObject.ID);
	public static  LocatorObject Matkassen_Payex_ExpireYear_DropDown = new LocatorObject("ctl00_BodyContentPlaceHolder_PaymentControl_ddExpireYear","Matkassen Page> Payex>Exp Year",LocatorObject.ID);
	
	public static  LocatorObject Matkassen_Payex_CVV_Textbox = new LocatorObject("ctl00_BodyContentPlaceHolder_PaymentControl_txtCVCCode","Matkassen Page> Payex>CVV code",LocatorObject.ID);
	public static  LocatorObject Matkassen_Payex_Pay_Button = new LocatorObject("ctl00_BodyContentPlaceHolder_PaymentControl_btnPay","Matkassen Page> Payex>Pay button",LocatorObject.ID);
	
	
	//ctl00_BodyContentPlaceHolder_PaymentControl_txtCVCCode
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
	return this;
}
// <summary>
//Navigate to login page
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/28/2015		Action: Created
//</revision>
public MatkassenPage SelectDefaultStore()
{
	Action.ActionLog("Select the store");
	Action.Click(Matkassen_Search_Store_Name_Link.Replace("1"));
	return this;
}
// <summary>
//Navigate to login page
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/28/2015		Action: Created
//</revision>
public MatkassenPage SelectDefaultBag()
{	Action.ActionLog("Select the Bag");
	Action.Click(Matkassen_Bestall_Button);
	return this;
}
// <summary>
//Navigate to login page
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/28/2015		Action: Created
//</revision>

public MatkassenPage FillInformation(String strEmail,String strMobile)
{
	Action.ActionLog("Fill personal information");
	Action.enterTextWithClear(Matkassen_EmailID_Textbox, strEmail);
	Action.enterTextWithClear(Matkassen_Email_Confirmation_Textbox, strEmail);
	Action.enterTextWithClear(Matkassen_Mobile_Textbox, strMobile);
	Action.Click(Matkassen_Next_Button);
	Action.WaitForPageLoad();
	Action.SelectRadio(Matkassen_TermsCondition_Chkbox);
	Action.Click(Matkassen_Next_Button);
	return this;
}

// <summary>
//Navigate to login page
//</summary>
//<revision>
//Author:	Nidhish Jain
//Date:	07/28/2015		Action: Created
//</revision>
public MatkassenPage PayWithPayex()
{
	Action.ActionLog("Complete the Order with Payex Payment");
	Action.ActionLog("Select Payex Payment Option ");
	Action.Click(Matkassen_PayexOption_RadioButton);
	Action.Click(Matkassen_Next_Button);
	Action.WaitForPageLoad();
	Action.enterText(Matkassen_Payex_CardNumber_Textbox, "4581090329655682");
	Action.enterText(Matkassen_Payex_CardNumber_Holder_Textbox, "Text user");
	Action.ActionLog("Select CVV number ");
	Action.enterText(Matkassen_Payex_CVV_Textbox, "216");
	Action.ActionLog("Enter Credit Card Expire Date");
	Action.SelectdropdrownValueByVisibleText(Matkassen_Payex_ExpireMonth_DropDown, "11");
	Action.SelectdropdrownValueByVisibleText(Matkassen_Payex_ExpireYear_DropDown, "21");
	Action.Click(Matkassen_Payex_Pay_Button);
		
	return this;
}
}
