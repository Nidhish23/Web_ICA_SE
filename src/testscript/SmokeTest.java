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
import Utility.LoginData;


public class SmokeTest extends TestBase  {
	
	 
//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify the login functionality with 3 digit pin(old customer)")
public static void Verify_Login_Functionality_With_3Digit() {
	
		LoginData login=  LoginData.Initialize("3digit");
		Begin begin =new Begin();
        
		begin
	       .GoToHomePage()
	       .atHomePage()
	       .GotoHomePage()
	       .NavigateToLoginpage()
	       .GetLoginPage()
	       .atLoginPage()
	       .Login(login.username,login.password);
	      
	
  }
//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify the login functionality with 6 digit pin(New customer)")
public static void Verify_Login_Functionality_With_6Digit() {
	
	LoginData login=  LoginData.Initialize("6digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(login.username,login.password);
     
}
//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify the login functionality with 4 digit pin(Bank Customer)")
public static void Verify_Login_Functionality_With_4Digit() {
	
	LoginData login=  LoginData.Initialize("4digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(login.username,login.password);
     
}
//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify StoreCache Functionality With Login")
public static void Verify_StoreCache_Functionality_With_Login() {
	
	LoginData login=  LoginData.Initialize("6digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(login.username,login.password)
       .GetHomePage()
       .atHomePage()
       .VerifyStoreCache();
     
}

//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Wrong Credentials")
public static void Verify_Wrong_Credentials() {
	
	LoginData login=  LoginData.Initialize("Wrongdigit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(login.username,login.password);
       
       
     
}
 
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify StoreCache Functionality With Login")
public static void Verify_Matkassen_Order_Flow() {
	
	LoginData login=  LoginData.Initialize("4digit");
	Begin begin =new Begin();
    
	begin
       .GoToHomePage()
       .atHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GetLoginPage()
       .atLoginPage()
       .Login(login.username,login.password)
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
       .FillInformation()
       .PayWithPayex();
     
}
//@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify_Add_Item_To_Shopping_List")
public static void Verify_Add_Item_To_Shopping_List() {
	
	LoginData login=  LoginData.Initialize("4digit");
	Begin begin =new Begin();
    
	begin
	.GoToHomePage()
    .atHomePage()
    .GotoHomePage()
    .NavigateToLoginpage()
    .GetLoginPage()
    .atLoginPage()
    .Login(login.username,login.password)
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
public static void Verify_old_base_customer() {
          LoginData login=  LoginData.Initialize("Oldbase");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
  .atHomePage()
  .GotoHomePage()
  .NavigateToLoginpage()
  .GetLoginPage()
  .atLoginPage()
  .Login(login.username,login.password)
  .GetHomePage()
  .atHomePage()
  .NavigateToDashboardPage()
  .GetDashBoardPage()
  .atDashBoardPage()
  .VerifyDashboardBaseCustomer();
}

@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Recipe Search for guest user", enabled = true)
public static void Verify_Recipe_Search_Guest() {

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
public static void Verify_Recipe_Search_Loggedin() {
          
          LoginData login=  LoginData.Initialize("6digit");
          Begin begin =new Begin();

          begin
   .GoToHomePage()
   .atHomePage()
   .GotoHomePage()
   .NavigateToLoginpage()
   .GetLoginPage()
   .atLoginPage()
   .Login(login.username,login.password)
   .GetHomePage()
   .atHomePage()
   .NavigateToRecipePage()
   .GetRecipePage()
   .atRecipePage()
   .RecipeSarch("Fisk")
   .VerifySearch("Fisk");
}

@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify Student customer type")
public static void Verify_ICA_Student_Customer() {
          LoginData login=  LoginData.Initialize("ICAStudent");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
.atHomePage()
.GotoHomePage()
.NavigateToLoginpage()
.GetLoginPage()
.atLoginPage()
.Login(login.username,login.password)
.GetHomePage()
.atHomePage()
.NavigateToMittICASettingsPage()
.GetMittICASettingsPage()
.atMittICASettingsPage()
.VerifyStudentCustomer();
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify ICA Bank customer type")
public static void Verify_ICA_Bank_Customer() {
          LoginData login=  LoginData.Initialize("6digit");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
  .atHomePage()
  .GotoHomePage()
  .NavigateToLoginpage()
  .GetLoginPage()
  .atLoginPage()
  .Login(login.username,login.password)
  .GetHomePage()
  .atHomePage()
  .NavigateToMittICASettingsPage()
  .GetMittICASettingsPage()
  .atMittICASettingsPage()
  .VerifyICABankCustomer();
}
@Test (groups={"ICA.SE-Smoke Test"}, description = "Verify ICA Card customer type")
public static void Verify_ICA_Card_Customer() {
          LoginData login=  LoginData.Initialize("4digit");
          Begin begin =new Begin();

          begin
          .GoToHomePage()
.atHomePage()
.GotoHomePage()
.NavigateToLoginpage()
.GetLoginPage()
.atLoginPage()
.Login(login.username,login.password)
.GetHomePage()
.atHomePage()
.NavigateToMittICASettingsPage()
.GetMittICASettingsPage()
.atMittICASettingsPage()
.VerifyICACardCustomer();
}






  }


