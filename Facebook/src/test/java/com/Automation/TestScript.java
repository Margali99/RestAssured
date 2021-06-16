package com.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestScript {
  @Test
  public void test() {
	  
	  
	  RequestSpecification request = RestAssured.given();
	  request.baseUri("https://reqres.in/api/users/2");
	  Response response = request.get();
		
	  Assert.assertEquals(response.getStatusCode(), 200);
		
	  System.out.println(response.getBody().asString());
  }
}
