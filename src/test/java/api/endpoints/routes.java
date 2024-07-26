package api.endpoints;

//  create user -  https://petstore.swagger.io/v2/user
// get user -  https://petstore.swagger.io/v2/user/{username}
//Update user - https://petstore.swagger.io/v2/user/{username}
//delete user - https://petstore.swagger.io/v2/user/{username}


//base_url = https://petstore.swagger.io
//End point - v2/user/{username}


public class routes {
	
	
	
	public static String base_url = "http://127.0.0.1:5000";

	
	//Register Module
	public static String registerPOST_url = base_url +"/api/register";
	public static String reguserGET_url = base_url +"/api/user/{user_id}";
	public static String regupdatePUT_url = base_url +"/api/user/{user_id}";
	
	
	//Login Module
	
	public static String loginPOST_url = base_url +"/api/login";
	public static String logoutGET_url = base_url +"/api/logout/";
	public static String changepsdPOST_url = base_url +"/api/change_password";
	public static String resetpsdreqPOST_url = base_url +"/api/reset_password/request";
	
	public static String verifyotpPOST_url = base_url +"api/verify_otp";
	public static String resetpsdPOST_url = base_url +"/api/reset_password";
	
//	public static String login1_url = base_url +"/login1";
//	public static String callback_url = base_url +"/login1";
//	public static String login1_url = base_url +"/login1";
//	public static String login1_url = base_url +"/login1";
	
//	public static String searchusers_url = base_url +"/api/search-users";
//	public static String users_url = base_url +"/api/users";
//	public static String verifyotp_url = base_url +"api/verify_otp";
//	public static String resetpsd_url = base_url +"/api/reset_password";
//	public static String verifyotp_url = base_url +"api/verify_otp";
//	public static String resetpsd_url = base_url +"/api/reset_password";
//	public static String verifyotp_url = base_url +"api/verify_otp";
//	public static String resetpsd_url = base_url +"/api/reset_password";
//	public static String verifyotp_url = base_url +"api/verify_otp";
//	public static String resetpsd_url = base_url +"/api/reset_password";
	
	
	
	

}
