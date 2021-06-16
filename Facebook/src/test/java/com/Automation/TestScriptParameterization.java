package com.Automation;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestScriptParameterization {
	
	String token = null;
	
	@Parameters({"Username", "Password"})
	@Test(priority=1)
	public void eCreateToken(String username , String password) {
		
	RequestSpecification request = RestAssured.given();
	request.baseUri("https://restful-booker.herokuapp.com/auth");
	request.contentType(ContentType.JSON);
	
	Map<String,String> map = new HashMap<String,String>();
	map.put("username", username);
	map.put("password", password);
	
	request.body(map);
	
	Response response = request.post();
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getBody().asPrettyString());
	
	Assert.assertEquals(response.getStatusCode(), 200);
	
	Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
	Assert.assertNotNull(response.getBody().asPrettyString());
	
	JsonPath jsonbody = response.getBody().jsonPath();
	token = jsonbody.getString("token");
	
	}
	
	@Test(priority=2, dependsOnMethods= "eCreateToken")
	public void deleteRequest() {
		
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking/6");
		request.contentType(ContentType.JSON);
		
		request.cookie("token",token);
		
		Response response = request.delete();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
		
	}
}
