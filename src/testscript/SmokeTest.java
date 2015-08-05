// <summary>
//     Smoke Test 
// </summary>
// <revision>
//     Author:	Nidhish Jain
//     Date:	07/14/2015		Action: Created
// </revision>

package testscript;
import org.testng.annotations.Test;

import test.Core.*;

import org.testng.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import Utility.StoreData;

import Utility.Begin;
import Utility.User;


public class SmokeTest extends TestBase  {
	
	 
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify the login functionality with 3 digit pin(old customer)")
public static void Verify_Login_Functionality_With_3Digit() {
	
		User user=  User.Initialize("3digit");
		Begin begin =new Begin();
        
		begin
	       .GoToHomePage()
	       .atHomePage()
	       .GotoHomePage()
	       .NavigateToLoginpage()
	       .GetLoginPage()
	       .atLoginPage()
	       .Login(user.strUsername,user.strPassword);
	      
	
  }
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify the login functionality with 6 digit pin(New customer)")
public static void Verify_Login_Functionality_With_6Digit() {
	
	User user=  User.Initialize("6digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(user.strUsername,user.strPassword);
     
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify the login functionality with 4 digit pin(Bank Customer)")
public static void Verify_Login_Functionality_With_4Digit() {
	
	User user=  User.Initialize("4digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(user.strUsername,user.strPassword);
     
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify StoreCache Functionality With Login")
public static void Verify_StoreCache_Functionality_With_Login() {
	
	User user=  User.Initialize("6digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(user.strUsername,user.strPassword)
       .GetHomePage()
       .atHomePage()
       .VerifyStoreCache();
     
}

//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Wrong Credentials")
public static void Verify_Wrong_Credentials() {
	
	User user=  User.Initialize("Wrongdigit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(user.strUsername,user.strPassword);
       
       
     
}
 
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Matkassen Order with Default bank with Payex payment Type")
public static void Verify_Matkassen_Order_Flow() {
	
	User user=  User.Initialize("4digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(user.strUsername,user.strPassword)
       .GetHomePage()
       .atHomePage()
       .NavigateToHandlaHomePage()
       .GetHandlaHomePage()
       .NavigateToMatkassen()
       .GetMatkassenPage()
       .atMatkassenPage()
       .SearchZipcode("11720")
       .SelectDefaultStore()
       .SelectDefaultBag()
       .FillInformation(user.strEmail,user.strPhoneNumber)
       .PayWithPayex();
     
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify_Add_Item_To_Shopping_List")
public static void Verify_Add_Item_To_Shopping_List() {
	
	User user=  User.Initialize("4digit");
	Begin begin =new Begin();
    
	begin
	.GoToHomePage()
    .atHomePage()
    .GotoHomePage()
    .NavigateToLoginpage()
    .GetLoginPage()
    .atLoginPage()
    .Login(user.strUsername,user.strPassword)
    .GetHomePage()
    .atHomePage()
    .NavigateToMittICA()
    .GetShoppingListPage()
    .atShoppingListPage()
     .ClearAllItemsFromShoppingList()
    .AddItemToShoopingList("Egg")
    .AddItemToShoopingList("Butter")
    .VerifyItemInShoppingList("Egg")
    .VerifyItemInShoppingList("Butter")
    .ClearAllItemsFromShoppingList();
	  
     
}

@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Old base customer type", enabled = true)
public static void Verify_AccountAndBalance_With_Old_Base_Customer() {
          User user=  User.Initialize("Oldbase");
          Begin begin =new Begin();

          begin
         .GoToHomePage()
  .atHomePage()
  .GotoHomePage()
  .NavigateToLoginpage()
  .GetLoginPage()
  .atLoginPage()
  .Login(user.strUsername,user.strPassword)
  .GetHomePage()
  .atHomePage()
  .NavigateToDashboardPage()
  .GetDashBoardPage()
  .atDashBoardPage()
  .VerifyAccountAndBalanceForBaseCustomer();
}

@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Recipe Search for guest user", enabled = true)
public static void Verify_Guest_Recipe_Search() {
          Begin begin =new Begin();

          begin
.GoToHomePage()
.atHomePage()
.GotoHomePage()
.NavigateToRecipePage()
.GetRecipePage()
.atRecipePage()
.RecipeSarch("Kyckling")
.VerifySearch("Kyckling");
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Recipe Search for logged in user")
public static void Verify_LoggedIN_Recipe_Search() {
          
          User user=  User.Initialize("6digit");
          Begin begin =new Begin();

          begin
   .GoToHomePage()
   .atHomePage()
   .GotoHomePage()
   .NavigateToLoginpage()
   .GetLoginPage()
   .atLoginPage()
   .Login(user.strUsername,user.strPassword)
   .GetHomePage()
   .atHomePage()
   .NavigateToRecipePage()
   .GetRecipePage()
   .atRecipePage()
   .RecipeSarch("Fisk")
   .VerifySearch("Fisk");
}

@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Student Tab under settings with Student Credentials")
public static void Verify_Settings_ICA_Student_Customer() {
          User user=  User.Initialize("ICAStudent");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
.atHomePage()
.GotoHomePage()
.NavigateToLoginpage()
.GetLoginPage()
.atLoginPage()
.Login(user.strUsername,user.strPassword)
.GetHomePage()
.atHomePage()
.NavigateToMittICASettingsPage()
.GetMittICASettingsPage()
.atMittICASettingsPage()
.VerifyStudentCustomer();
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Account Managment under Settings with ICA Bank Customers")
public static void Verify_Settings_Account_Managment_With_ICA_Bank_Customer() {
          User user=  User.Initialize("6digit");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
  .atHomePage()
  .GotoHomePage()
  .NavigateToLoginpage()
  .GetLoginPage()
  .atLoginPage()
  .Login(user.strUsername,user.strPassword)
  .GetHomePage()
  .atHomePage()
  .NavigateToMittICASettingsPage()
  .GetMittICASettingsPage()
  .atMittICASettingsPage()
  .VerifyICABankCustomer();
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Account Managment under Settings with ICA Card customer ")
public static void Verify_Settings_Account_Managment_With_ICA_Card_Customer() {
          User user=  User.Initialize("4digit");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
.atHomePage()
.GotoHomePage()
.NavigateToLoginpage()
.GetLoginPage()
.atLoginPage()
.Login(user.strUsername,user.strPassword)
.GetHomePage()
.atHomePage()
.NavigateToMittICASettingsPage()
.GetMittICASettingsPage()
.atMittICASettingsPage()
.VerifyICACardCustomer();
}






  }


