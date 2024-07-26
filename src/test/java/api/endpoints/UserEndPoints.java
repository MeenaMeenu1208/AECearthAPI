package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.UserRegister;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created to perform CRUD operation - read, update, delete requests the user API.
//Payload - to create user data - request body
public class UserEndPoints {
	
	
	public static Response CreateUser(UserRegister payload) {
		
		
		
		Response response = given()
			
				
				
				
		.contentType(ContentType.JSON)//what kind of data you are running
		.accept(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(routes.registerPOST_url);
		
		return response;
		
	}
	
public static Response ReadUser(String userID) {
		
		Response response = given()
		.pathParam("userid",userID)
		
		.when()
		.get(routes.reguserGET_url);
		
		return response;
		
	}

public static Response UpdateUser(String userID, UserRegister payload) {
	
	Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("userid",userID)
			.body(payload)
			
			.when()
			.put(routes.regupdatePUT_url);
			
			return response;
	
}

//public static Response DeleteUser(String userID) {
//	
//	Response response = given()
//			.contentType(ContentType.JSON)
//			.accept(ContentType.JSON)
//			.pathParam("username",userID)
//
//			
//			.when()
//			.delete(routes.delete_url);
//			
//			return response;
//	
//}

}
