package com.Automation;



import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestTest2 {

	public static void main(String[] args) {
		
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://restful-booker.herokuapp.com/booking/1");
		Response response = request.get();
		
//		System.out.println(response.getHeaders());
		
		Headers headers = response.getHeaders();
		List<Header> list = headers.asList();
		
		for(Header header : list) {
			System.out.println(header.getName()    +   "\t" );
			System.out.println(header.getValue());
		}
		
			
		
	}

}
