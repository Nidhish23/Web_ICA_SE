package Utility;

import pageObjects.*;


public class PageObjects {
	
	public  LoginPage GetLoginPage()
	{
		return new LoginPage(this);
	}
	
	public HomePage GetHomePage()
	{
 return new HomePage(this);
		
	}
		
	
}