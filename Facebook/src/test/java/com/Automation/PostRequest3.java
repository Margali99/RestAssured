package com.Automation;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest3 {

	public static void main(String[] args) {
		
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking");
		request.contentType(ContentType.JSON);
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("firstname","Jim");
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
		
	}

}
