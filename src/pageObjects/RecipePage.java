package pageObjects;
import org.openqa.selenium.WebElement;

import Utility.Configuration;
import Utility.PageObjects;
import test.Core.*;
import Utility.*;



public class RecipePage extends MasterPage {
	
	//Parametrized constructor to call the super class constuctor 
	public RecipePage(PageObjects repository) {
		super(repository);
		
	}
	
	//Locator Object
	public static  LocatorObject RecipeSearch_Textbox = new LocatorObject("search2","Recipe page> Enter searchterm",LocatorObject.ID);
	public static  LocatorObject RecipeSearch_Button = new LocatorObject("(//button[@type='submit'])[2]","Recipe Page> Recipe Search Button",LocatorObject.XPATH);
	//public static  LocatorObject RecipeSave_Button = new LocatorObject("Spara","Recipe page> Recipe Save",LocatorObject.LINKTEXT);
	public static  LocatorObject RecipeGridview_Button = new LocatorObject("Tumnaglar","Recipe page> Recipe Gridview",LocatorObject.LINKTEXT);
	public static  LocatorObject RecipeListview_Button = new LocatorObject("Lista","Recipe page> Recipe Listview",LocatorObject.LINKTEXT);
	public static  LocatorObject RecipeViewmore_Button = new LocatorObject("//div[@id='recipes']/div[2]/div/a/span","Recipe Page> View More Button",LocatorObject.XPATH);
	public static  LocatorObject RecipeBacktotop_Button = new LocatorObject("Till toppen","Recipe page> Recipe Backtotop",LocatorObject.LINKTEXT);
	public static  LocatorObject Recipe_Link = new LocatorObject("//div[@id='recipes']/article[*]/div[2]/header/h2/a","Recipe page> Recipe Link",LocatorObject.XPATH);
   //Local Variables 
    public RecipePage atRecipePage(){
		
		return this;
	}
    
    public RecipePage RecipeSarch(String Searchterm){
    	Action.ActionLog("Expected Result : User should be able to search recipes");
    	Action.enterText(RecipeSearch_Textbox,Searchterm); 
    	Action.Click(RecipeSearch_Button);
    	if(Action.IsVisible(RecipeViewmore_Button))
    	{
    		Action.Click(RecipeViewmore_Button);
    		Action.Click(RecipeBacktotop_Button);
    		
    	}
    	Action.ActionLog("Actual Result : Recipe Search Successfully finished");
    	return this;
    }
    public RecipePage VerifySearch(String Searchterm){
        Action.ActionLog("Expected Result : Search word matches with recipe");
    	Action.VerifyTextPresentInElements(Recipe_Link, Searchterm);
        Action.ActionLog("Actual Result : Search word matches with recipe"); 
        return this;
}

}   
