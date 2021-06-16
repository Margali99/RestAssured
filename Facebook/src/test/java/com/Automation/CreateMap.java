package com.Automation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Automation.helper.ExcelHelper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateMap {
	
	Map<String,Object> map = null;

	public void createMap(String firstName,String lastName, String totalPrice, String depositPaid, String checkIn,
			String checkOut, String additionalNeeds) {
		map = new HashMap<String,Object>();
		map.put("firstname", firstName);
		map.put("lastname", lastName);
		map.put("totalprice",Integer.parseInt(totalPrice));
		map.put("depositpaid",Boolean.parseBoolean(depositPaid));
		
		Map<String,String> bookingdatesmap = new HashMap<String,String>();
		bookingdatesmap.put("checkin", checkIn);
		bookingdatesmap.put("checkout", checkOut);
		
		map.put("bookingdates", bookingdatesmap);
		map.put("additionalneeds", additionalNeeds);
	}
	
	
	@Test(dataProvider="getTestData")
	public void postTest(String firstName,String lastName, String totalPrice, String depositPaid, String checkIn,
						String checkOut, String additionalNeeds ) throws Exception{
		
	RequestSpecification request = RestAssured.given();
	request.baseUri("https://restful-booker.herokuapp.com/booking");
	request.contentType(ContentType.JSON);
	
	createMap(firstName, lastName, totalPrice, depositPaid, checkIn, checkOut, additionalNeeds);
	request.body(map);
	
	Response response = request.post();
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getBody().asPrettyString());
	
	}
	
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData() throws Exception{
		
		Object[][] data = ExcelHelper.getTestData("D:\\RestAssured\\RestAssured_excel\\Book1.xlsx","sheet1");
		
		
		return data;
		
	}
	
	


}
