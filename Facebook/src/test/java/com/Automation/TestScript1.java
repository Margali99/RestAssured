package com.Automation;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestScript1 {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test
	public void getRequest() {
		System.out.println("Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}
