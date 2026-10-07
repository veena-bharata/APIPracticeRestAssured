package com.test.api;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.*;

public class PutRequestTest {
	@Test
	public void testPutUser() {
		RestAssured.baseURI= "https://dummyjson.com";
		Map<String, Object> requestBody = new HashMap<String,Object>();
		requestBody.put("title","iPhone ");
		given().header("Content_Type","application/json").body(requestBody).when().put("products/123").
		then().statusCode(200).body("title",equalTo("iPhone 13 Pro")).log().all();
	}
	

}
