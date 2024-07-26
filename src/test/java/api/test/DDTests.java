package api.test;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import org.testng.AssertJUnit;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.UserRegister;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests extends DataProviders {
	
	
	Faker faker;
	UserRegister userPayload;
	public Logger logger;
	
	@Test(priority=1, dataProvider = "Data")
	public void testPostUser(String firstname, String lastname, String email,String phone, String password, String cpassword) {
		
		faker = new Faker();
		UserRegister userPayload = new UserRegister();
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setFirstname(firstname);
		userPayload.setLastname(lastname);
		userPayload.setEmail(email);
		userPayload.setPhone(phone);
		userPayload.setPassword(password);
		userPayload.setCpassword(cpassword);

		
		
		Response response = UserEndPoints.CreateUser(userPayload);
		response.then().log().all();
		AssertJUnit.assertEquals(response.getStatusCode(), 400);
		
		
		
		
	}
	
	@Test(priority=1, dataProvider = "UserNames")
	public void testDeleteUserByName(String userName) {
		
		//Response response = UserEndPoints.DeleteUser(userName);
		//AssertJUnit.assertEquals(response.getStatusCode(), 200);
		
		
	}

}
