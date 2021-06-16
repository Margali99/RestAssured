package com.Automation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestDataProvider {
	
	
	@Test(dataProvider="getTestData1")
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
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData(){
		
		Object[][] data = new Object[1][7];
		
		data[0][0] = "SriKrishna";
		data[0][1] = "Adusu";
		data[0][2] =  979;
		data[0][3] =  true;
		data[0][4] = "2018-05-05";
		data[0][5] = "2019-05-05";
		data[0][6] = "Lunch";
		
		return data;
	
		
	}
	
	@DataProvider(name="getTestData1")
	public Object[][] getTestData1(){
		
		Object[][] data1 = {
							{"LFT","RFT",555,true,"2018-02-02","2019-02-02","Breakfast"},
							{"Selenium","RestAssured",777,true,"2018-05-05","2019-07-07","Lunch"}
							} ;
		
		return data1;
	}
}
