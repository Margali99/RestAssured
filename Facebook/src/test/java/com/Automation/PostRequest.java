package com.Automation;








import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
;

public class PostRequest {

	public static void main(String[] args) {
		
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://reqres.in/api/users");
		request.contentType(ContentType.JSON);
		

		
//		String requestBody = "{\r\n"
//				+ "    \"name\": \"morpheus\",\r\n"
//				+ "    \"job\": \"leader\"\r\n"
//				+ "}";
//		request.body(requestBody);
		
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("name", "morpheus");
     	map.put("job", "leader");
		
		request.body(map);
		
		
		
		Response response = request.post();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asPrettyString());

	}

}
