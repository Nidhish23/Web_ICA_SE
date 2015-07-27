package pageObjects;

import Utility.PageObjects;
import test.Core.*;
import Utility.*;



public class ShoppingListPage extends MasterPage {
	
	//Parametrized constructor to call the super class constuctor 
	public ShoppingListPage(PageObjects repository) {
		super(repository);
		
	}
	
	//Locator Object
	public static  LocatorObject ShoppingList_SearchItem_Textbox = new LocatorObject("//input[@type='text']","Shopping List> Search Item",LocatorObject.XPATH);
	public static  LocatorObject ShoppingList_Search_Button = new LocatorObject("//div[@id='inkopslistor']/section/fieldset/button","Shopping List page> Search button",LocatorObject.XPATH);
	public static  LocatorObject ShoppingList_Item_Label = new LocatorObject("//div[@id='inkopslistor']/section[2]/ul/li[[*]]/span[2]/span","Shopping List page> Item label",LocatorObject.XPATH);
	public static  LocatorObject ShoppingList_Change_Item_Link = new LocatorObject("//div[@id='inkopslistor']/section[2]/ul/li[[*]]/span[3]","Shopping List page> ShoppingList_Change_Item_Link",LocatorObject.LINKTEXT);
	public static  LocatorObject Login_Button = new LocatorObject("btnLogin","Login page> Login Button",LocatorObject.ID);
	public static  LocatorObject ShoppingList_Remove_Item_Button = new LocatorObject("//div[@id='inkopslistor']/section[2]/ul/li[2]/div/span","Login page>Keep me login ",LocatorObject.XPATH);
	public static  LocatorObject ShoppingList_Edit_Item_Button = new LocatorObject("//div[@id='inkopslistor']/section[2]/ul/li[2]/span[3]","Login page>Keep me login ",LocatorObject.XPATH);
   //Local Variables  //div[@id='inkopslistor']/section[2]/ul/li[2]/span[3]
	//method to get page object
    public ShoppingListPage atShoppingListPage(){
		
		return this;
	}
   	
   	//Added a only one item in list
    public ShoppingListPage AddItemToShoopingList(String itemName)
    {
    	Action.ActionLog("Expected Result : user should be able ot add item to shopping list");
    	Action.enterText(ShoppingList_SearchItem_Textbox, itemName); 
    	Action.Click(ShoppingList_Search_Button);
    	Action.ActionLog("Item added successfully to shopping list"+itemName);
    	
    	return this;
    }
    
    public ShoppingListPage VerifyItemInShoppingList(String itemName)
    {
    	int flag=0;
    	Action.ActionLog("Verify the item present in the shopping list");
     
    	for(int i=2;i<10;i++)
    	{
    		if(Action.IsVisible(ShoppingList_Item_Label.Replace(String.valueOf(i))))
    		{
    			if (Action.IsTextPresentInElement(ShoppingList_Item_Label.Replace(String.valueOf(i)), itemName))
    			{
    				flag =1;
    				break;
    			}
    		}
    		else{
    			Action.AssertFail("Shopping list:"+ShoppingList_Item_Label.Replace(String.valueOf(i))+"Not found");
    		}
    	
    	}
    	if (flag==1)
    	{
    		Action.ActionLog(itemName+" :Verify successfully in shopping list");
    	}
    	else
    	{
    		Action.AssertFail(itemName+" :Item not present in the shopping list");
    	}
    	   	
    	
    	return this;
    }

    public ShoppingListPage ClearAllItemsFromShoppingList()
    {
    	
    	Action.ActionLog("Verify the item present in the shopping list");
     
    	for(int i=1;i<10;i++)
    	{
    		if(Action.IsVisible(ShoppingList_Edit_Item_Button))
    		{
    			Action.Click(ShoppingList_Edit_Item_Button);
    			Action.driverwait(3);
    			Action.Click(ShoppingList_Remove_Item_Button);
    		}
    		else{
    			Action.ActionLog("No Item present to remove");
    			break;
    		}
    	
    	}
    	
    	return this;
    }
    
	
}   


