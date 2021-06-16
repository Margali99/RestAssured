package com.Automation;

import static org.hamcrest.Matcher.*;

import java.io.File;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BDDPost {
	
	
	@Test
	public void post() {
		
		//test pull
		
		String strPath = "{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
		
		File file = new File("D:\\RestAssured\\RestAssured_excel\\TestData.json");
		given()
		
			.baseUri("https://restful-booker.herokuapp.com/booking")
			.header("Content-Type","application/json")
			.body(strPath)
		
		.when()
			.post()
		
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().body();
		
		
	}
}
