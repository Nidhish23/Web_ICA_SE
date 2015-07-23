package pageObjects;


import Utility.Configuration;
import Utility.PageObjects;
import test.Core.*;
public class MasterPage {

protected PageObjects repository;
static Action Action =new Action();
Configuration configuration = new Configuration();
	public MasterPage(PageObjects repository)
	{
		this.repository=repository;
	}
	
	public  LoginPage GoToLoginPage()
	{
		return repository.GetLoginPage();
	}
	
	public  HomePage GoToHomePage()
	{
       return repository.GetHomePage();
		
	}
	
	
	//Master Page Locator Object inherited by all the child pages 
	public static  LocatorObject Logout_Link = new LocatorObject("(//a[contains(text(),'Logga ut')])[2]","Home page> Click Logout",LocatorObject.XPATH);
	public static  LocatorObject Home_Button = new LocatorObject("span.logo-image.sprite2","Home> ICA Home Button",LocatorObject.CSS);
	public static  LocatorObject Butiker_Button = new LocatorObject("Butiker","Home Page> Butiker",LocatorObject.LINKTEXT);
	public static  LocatorObject Recipe_Button = new LocatorObject("//a[contains(text(),'Recept')])[2]","Home page> Recept",LocatorObject.XPATH);
	public static  LocatorObject Halsa_Button = new LocatorObject("Hälsa","Home Page> Halsa",LocatorObject.LINKTEXT);
	public static  LocatorObject Buffe_Button = new LocatorObject("Buffé","Home Page> Buffe",LocatorObject.LINKTEXT);
	public static  LocatorObject Handla_Button = new LocatorObject("Handla","Home Page> Handla",LocatorObject.LINKTEXT);
	public static  LocatorObject RecipeSearch_Textbox = new LocatorObject("search2","Recipe page> Enter searchterm",LocatorObject.ID);
	public static  LocatorObject RecipeSearch_Button = new LocatorObject("//button[@type='submit'])[2]","Recipe Page> Recipe Search Button",LocatorObject.XPATH);
	public static  LocatorObject RecipeSave_Button = new LocatorObject("Spara","Recipe page> Recipe Save",LocatorObject.LINKTEXT);
	public static  LocatorObject Mitt_ICA_Link = new LocatorObject("Mitt ICA","Master> Click on Mitt ICA project",LocatorObject.LINKTEXT);
	public static  LocatorObject Login_Link = new LocatorObject("Logga in","Master> Login Link",LocatorObject.LINKTEXT);
	public static  LocatorObject Stang_Link = new LocatorObject("Stäng","Master> stang",LocatorObject.LINKTEXT);       
	public static  LocatorObject Skip_3digit_Link = new LocatorObject("Jag vill välja lösenord senare","Master> Jag vill välja lösenord senare",LocatorObject.LINKTEXT);
	
}
