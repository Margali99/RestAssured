package com.Automation;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest2 {

	public static void main(String[] args) {
	
		RequestSpecification request = RestAssured.given();
		
		request.baseUri("https://restful-booker.herokuapp.com/auth");

		request.contentType(ContentType.JSON);
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("username", "admin");
		map.put("password", "password123");
		
		request.body(map);
		
		Response response = request.post();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
	}

}
