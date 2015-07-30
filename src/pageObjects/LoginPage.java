package pageObjects;

import Utility.PageObjects;
import test.Core.*;
import Utility.*;



public class LoginPage extends MasterPage {
	
	//Parametrized constructor to call the super class constuctor 
	public LoginPage(PageObjects repository) {
		super(repository);
		
	}
	
	//Locator Object
	public static  LocatorObject UserName_Textbox = new LocatorObject("ctl00_ctl00_Content_cphOutsidePageWrapper_txtUsername","Login page> Enter Username",LocatorObject.ID);
	public static  LocatorObject Password_Textbox = new LocatorObject("ctl00_ctl00_Content_cphOutsidePageWrapper_txtPassword","Login page> Enter Password",LocatorObject.ID);
	public static  LocatorObject ForgetPassword_Link = new LocatorObject("exact:Behöver du hjälp?","Login page> Forget Password",LocatorObject.LINKTEXT);
	public static  LocatorObject CreateAccount_Link = new LocatorObject("Skapa användarkonto","Login page> Create Account",LocatorObject.LINKTEXT);
	public static  LocatorObject Login_Button = new LocatorObject("btnLogin","Login page> Login Button",LocatorObject.ID);
	
	public static  LocatorObject Keep_Me_Login_Chkbox = new LocatorObject("ctl00_ctl00_Content_cphOutsidePageWrapper_Label1","Login page>Keep me login ",LocatorObject.ID);
   //Local Variables 
	//method to get page object
    public LoginPage atLoginPage(){
		
		return this;
	}
   	
   	//login to ICA.se home side  
    public LoginPage Login(String UserName,String Password)
    {
    	Action.ActionLog("Expected Result : User should be able to login with credentials");
    	Action.enterText(UserName_Textbox,UserName); 
    	Action.enterText(Password_Textbox, Password.toString());
    	Action.Click(Keep_Me_Login_Chkbox);
    	Action.Click(Login_Button);
    	Action.driverwait(3);
    	if(Action.IsVisible(Master_Skip_3digit_Link))
    	{
    		Action.Click(Master_Skip_3digit_Link);
    		
    	}
    	else if(Action.IsVisible(Master_Stang_Link))
    	{
    		Action.Click(Master_Stang_Link);
    	}
    	Action.verifyElementPresent(Master_Logout_Link);
		Action.ActionLog("Actual Result : User Loggedin Successfully");
    	return this;
    }
}   


