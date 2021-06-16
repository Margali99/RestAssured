package com.Automation;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest3 {
	
	public static String  createToken() {
		
		RequestSpecification request = RestAssured.given();
			
			request.baseUri("https://restful-booker.herokuapp.com/auth");
			
			request.contentType(ContentType.JSON);
			
			Map<String,String> map1 = new HashMap<String,String>();
			map1.put("username","admin");
			map1.put("password", "password123");
			
			request.body(map1);
			
			Response response = request.post();
		
			JsonPath jsonbody = response.getBody().jsonPath();
			String token = jsonbody.getString("token");
			
			
			System.out.println(token);
			
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			System.out.println(response.getBody().asPrettyString());
			return token;
			
			
			
		}
	
	public static void putrequest(String token) {
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking/4");
		request.contentType(ContentType.JSON);
		
		
		request.cookie("token", token);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("firstname", "srikrishna");
		map.put("lastname", "adusu");
		map.put("totalprice",112);
		map.put("depositpaid", true);
		
		Map<String,String> bookingdatesmap = new HashMap<String,String>();
		bookingdatesmap.put("checkin", "2019-01-01");
		bookingdatesmap.put("checkout", "2019-05-05");
		
		map.put("bookingdates", bookingdatesmap);
		map.put("additionalneeds", "lunch");
		request.body(map);
		
		Response response = request.put();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
	}
	
	public static void patchrequest(String token) {
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking/4");
		request.contentType(ContentType.JSON);
		
		
		request.cookie("token", token);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("firstname", "srirama");
		map.put("lastname", "adusu");
		
		request.body(map);
		Response response = request.patch();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
	}
	
	public static void deleterequest(String token) {
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking/4");
		request.contentType(ContentType.JSON);
		
		
		request.cookie("token", token);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("firstname", "srirama");
		map.put("lastname", "adusu");
		
		request.body(map);
		Response response = request.delete();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
	}
	

	public static void main(String[] args) {
		
		String token1 = PutRequest3.createToken();
		
		PutRequest3.deleterequest(token1);
		
	
		

	}

}
