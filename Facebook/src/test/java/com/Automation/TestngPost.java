package com.Automation;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngPost {
	@Test
	public void postRequest() {
		
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking");
		request.contentType(ContentType.JSON);
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("firstname","Sri");
		map.put("lastname","Brown");
		map.put("totalprice",111);
		map.put("depositpaid",true);
		
		Map<String,String> bookingdatesmap = new HashMap<String,String>();
		bookingdatesmap.put("checkin","2018-01-01");
		bookingdatesmap.put("checkout","2019-01-01");
		
		map.put("bookingdates",bookingdatesmap);
		map.put("additionalneeds","Breakfast");
		
		request.body(map);
		
		Response response = request.post();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
		Assert.assertNotNull(response.getBody().asPrettyString());
		
		JsonPath jsonbody = response.getBody().jsonPath();
	
		System.out.println(jsonbody.getInt("bookingid"));
		System.out.println(jsonbody.getString("booking.firstname"));
		System.out.println(jsonbody.getString("booking.lastname"));
		System.out.println(jsonbody.getString("booking.bookingdates.checkin"));
		
		Assert.assertNotNull(jsonbody.getInt("bookingid"));
		Assert.assertNotNull(jsonbody.getString("booking.firstname"));
		Assert.assertNotNull(jsonbody.getString("booking.lastname"));	
		Assert.assertNotNull(jsonbody.getString("booking.bookingdates.checkin"));
		
	}

}
