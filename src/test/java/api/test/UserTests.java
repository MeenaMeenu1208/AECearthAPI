package api.test;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.UserRegister;
import io.restassured.response.Response;

public class UserTests {
	
//	Faker faker;
//	UserRegister userPayload;
//	public Logger logger;
//	
//	
//	@BeforeClass
//	public void setUp() {
//		faker = new Faker();
//		userPayload = new UserRegister();
//	
//		
////		userPayload.setId(faker.idNumber().hashCode());
////		userPayload.setUsername(faker.name().username());
////		userPayload.setFirstName(faker.name().firstName());
////		userPayload.setLastName(faker.name().lastName());
////		userPayload.setEmail(faker.internet().safeEmailAddress());
////		userPayload.setPassword(faker.internet().password(5, 10));
////		userPayload.setPhone(faker.phoneNumber().cellPhone());
//		
//		//logs
//		
//		logger = LogManager.getLogger(this.getClass());
//		logger.debug("debugging.........");
//		
//		
//		
//}
//	@Test(priority=1)
//	public void testPostUser() {
//		
//		logger.info("************Creating User *****************");
//		Response response = UserEndPoints.CreateUser(userPayload);
//		response.then().log().all();
//		Assert.assertEquals(response.getStatusCode(), 200);
//		logger.info("************User info displayed *****************");
//	}
//	@Test(priority=2)
//	public void testGetUserByName() {
//		
//		logger.info("************ Reading User *****************");
//		Response response = UserEndPoints.ReadUser(this.userPayload.getUsername());
//		response.then().log().all();
//		Assert.assertEquals(response.getStatusCode(), 200);
//		logger.info("************ User info displayed *****************");
//	}
//	
//	@Test(priority=3)
//	public void testUpdateUserByName() {
//		
//		//update data using payload 
//		
//		logger.info("************ Update User info *****************");
////		userPayload.setFirstName(faker.name().firstName());
////		userPayload.setLastName(faker.name().lastName());
//		userPayload.setEmail(faker.internet().safeEmailAddress());
//		
//		Response response = UserEndPoints.UpdateUser(this.userPayload.getUsername(), userPayload);
//		response.then().log().body();
//		Assert.assertEquals(response.getStatusCode(), 200);
//		//update data using payload
//		
//		Response responseAfterupdate = UserEndPoints.ReadUser(this.userPayload.getUsername());
//		Assert.assertEquals(responseAfterupdate.getStatusCode(), 200);
//		logger.info("************ Updated User displayed *****************");
//	}
//	
//	@Test(priority=4)
//	public void testDeleteUserByName() {
//		logger.info("************ Deleting User *****************");
//	//	Response response = UserEndPoints.DeleteUser(this.userPayload.getUsername());
//	//	Assert.assertEquals(response.getStatusCode(), 200);
//		logger.info("************ Deleted User displayed *****************");
//	}
	
	
}
