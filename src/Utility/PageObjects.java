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
	
	public HandlaHomePage GetHandlaHomePage()
	{
 return new HandlaHomePage(this);
		
	}
	
	public MatkassenPage GetMatkassenPage()
	{
 return new MatkassenPage(this);
		
	}
	
	public ShoppingListPage GetShoppingListPage()
	{
 return new ShoppingListPage(this);
		
	}
	public DashBoardPage GetDashBoardPage()
	{
 return new DashBoardPage(this);
		
	}
	
	public MittICASettingsPage GetMittICASettingsPage()
	{
 return new MittICASettingsPage(this);
		
	}
	
	public RecipePage GetRecipePage()
	{
 return new RecipePage(this);
		
	}
	
}