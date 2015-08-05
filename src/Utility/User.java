// <summary>
//     LoginData
// </summary>
// <revision>
//     Author:	Nidhish Jain
//     Date:	07/14/2015		Action: Created
// </revision>


package Utility;
import java.util.Map; 
import test.Core.*;

public  class User {
	
	public  String strUsername;
	public  String strPassword;
	public String strEmail;
	public String  strPhoneNumber;
	public String strZipcode;
 	static YmalReader reader = new YmalReader();
	
	@SuppressWarnings("rawtypes")
	
	public static User Initialize(String key) 
	{
		 User obj=new User();
       Map map=  reader.YmalRead(key, "./TestData/User.yaml");
       obj.strUsername= (String) map.get("UserName").toString();
       obj.strPassword=  (String) map.get("Password").toString();
       obj.strUsername= (String) map.get("Email").toString();
       obj.strPassword=  (String) map.get("PhoneNumber").toString();
       obj.strZipcode=   (String) map.get("Zipcode").toString();  
           
	return obj;
       
    }

	
	
	

}
