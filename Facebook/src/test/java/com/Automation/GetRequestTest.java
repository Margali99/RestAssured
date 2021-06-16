package com.Automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestTest {

	public static void main(String[] args) {

		RequestSpecification request = RestAssured.given();
		request.baseUri("https://reqres.in/api/users/2");
		
		Response response = request.get();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());
		
	}

}
