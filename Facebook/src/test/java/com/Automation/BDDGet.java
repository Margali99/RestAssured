
package com.Automation;
import static org.hamcrest.Matcher.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class BDDGet {
	
@Test
public void get() {
	

	given()
		.baseUri("https://restful-booker.herokuapp.com/booking/1")
	
	.when()
		.get()
	
	.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();
	
}
	
	

}
