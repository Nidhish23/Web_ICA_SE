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
	
	public  LoginPage GetLoginPage()
	{
		return repository.GetLoginPage();
	}
	
	public  HomePage GetHomePage()
	{
       return repository.GetHomePage();
		
	}
	
	public  HandlaHomePage GetHandlaHomePage()
	{
       return repository.GetHandlaHomePage();
		
	}
	
	public  MatkassenPage GetMatkassenPage()
	{
       return repository.GetMatkassenPage();
		
	}
	public  ShoppingListPage GetShoppingListPage()
	{
       return repository.GetShoppingListPage();
		
	}
	public  DashBoardPage GetDashBoardPage()
	{
       return repository.GetDashBoardPage();
		
	}
	public  MittICASettingsPage GetMittICASettingsPage()
	{
       return repository.GetMittICASettingsPage();
		
	}
	
	public  RecipePage GetRecipePage()
	{
       return repository.GetRecipePage();
		
	}
	
	//Master Page Locator Object inherited by all the child pages 
	public static  LocatorObject Master_Logout_Link = new LocatorObject("(//a[contains(text(),'Logga ut')])[2]","Home page> Click Logout",LocatorObject.XPATH);
	public static  LocatorObject Master_Home_Button = new LocatorObject("span.logo-image.sprite2","Home> ICA Home Button",LocatorObject.CSS);
	public static  LocatorObject Master_Butiker_Button = new LocatorObject("Butiker","Home Page> Butiker",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_Recipe_Button = new LocatorObject("//a[contains(text(),'Recept')])[2]","Home page> Recept",LocatorObject.XPATH);
	public static  LocatorObject Master_Halsa_Button = new LocatorObject("Hälsa","Home Page> Halsa",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_Buffe_Button = new LocatorObject("Buffé","Home Page> Buffe",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_Handla_Button = new LocatorObject("Handla","Home Page> Handla",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_RecipeSearch_Textbox = new LocatorObject("search2","Recipe page> Enter searchterm",LocatorObject.ID);
	public static  LocatorObject Master_RecipeSearch_Button = new LocatorObject("//button[@type='submit'])[2]","Recipe Page> Recipe Search Button",LocatorObject.XPATH);
	public static  LocatorObject Master_RecipeSave_Button = new LocatorObject("Spara","Recipe page> Recipe Save",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_Guest_Mitt_ICA_Link = new LocatorObject("Mitt ICA","Master> Click on Mitt ICA project",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_Login_Link = new LocatorObject("Logga in","Master> Login Link",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_Stang_Link = new LocatorObject("Stäng","Master> stang",LocatorObject.LINKTEXT);       
	public static  LocatorObject Master_Skip_3digit_Link = new LocatorObject("Jag vill välja lösenord senare","Master> Jag vill välja lösenord senare",LocatorObject.LINKTEXT);
	public static  LocatorObject Master_SignIN_Mitt_ICA_Link = new LocatorObject("//nav[@id='globalnav']/section/ul/li/a","Master> Click on Mitt ICA  after Sign IN ",LocatorObject.XPATH);
	public static  LocatorObject Master_DashboardSummary_Link = new LocatorObject("span.user-name","Dashboard> Click Nameof The User In Dashboard",LocatorObject.CSS);
	public static  LocatorObject Master_DashboardSettings_Link = new LocatorObject("Inställningar","Dashboard> Settings",LocatorObject.LINKTEXT);

	
	//Phone and Ipad
	public static  LocatorObject Master_Mobile_Recipe_Button = new LocatorObject("(//a[contains(text(),'Recept')])[3]","Mobile >Home page> Recept",LocatorObject.XPATH);
	public static  LocatorObject Master_Mobile_Halsa_Button = new LocatorObject("(//a[contains(text(),'Hälsa')])[2]","Mobile >Home Page> Halsa",LocatorObject.XPATH);
	public static  LocatorObject Master_Mobile_Buffe_Button = new LocatorObject("(//a[contains(text(),'Buffé')])[2]","Mobile >Home Page > Buffe",LocatorObject.XPATH);
	public static  LocatorObject Master_Mobile_Handla_Button = new LocatorObject("(//a[contains(text(),'Handla')])[2]","Mobile >Home Page> Handla",LocatorObject.XPATH);
	public static  LocatorObject Master_Mobile_Mer_Button = new LocatorObject("Mer…","Mobile >Home Page> Handla",LocatorObject.LINKTEXT);
	//nav[@id='globalnav']/section/ul/li/a
}
