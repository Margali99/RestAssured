package com.Automation;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestScript2 {
	
	

	@Parameters({"FirstName","LastName","TotalPrice","DepositPaid","CheckIn","CheckOut","AdditionalNeeds"})
	@Test
	public void postTest(String firstName,String lastName, int totalPrice, boolean depositPaid, String checkIn,
						String checkOut, String additionalNeeds )
	
	{
		
	RequestSpecification request = RestAssured.given();
	request.baseUri("https://restful-booker.herokuapp.com/booking");
	request.contentType(ContentType.JSON);
	
	Map<String,Object> map = new HashMap<String,Object>();
	map.put("firstname", firstName);
	map.put("lastname", lastName);
	map.put("totalprice",totalPrice);
	map.put("depositpaid", depositPaid);
	
	Map<String,String> bookingdatesmap = new HashMap<String,String>();
	bookingdatesmap.put("checkin", checkIn);
	bookingdatesmap.put("checkout", checkOut);
	
	map.put("bookingdates", bookingdatesmap);
	map.put("additionalneeds", additionalNeeds);
	
	request.body(map);
	
	Response response = request.post();
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getBody().asPrettyString());
	
	}
	

}
