package com.test.api;
import java.util.HashMap;
import java.util.Map;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import io.restassured.*;
public class PostRequestTest {
	@Test
	public void testPostUser() {
		
	
	RestAssured.baseURI= "https://dummyjson.com";
	
	
		Map<String,Object>RequestBody1= new HashMap<String, Object>();
		RequestBody1.put("title","BMW");
		RequestBody1.put("id","123");
		
		given().header("Content-Type","application/json").body(RequestBody1)
		.when().post("products/add")
		.then().statusCode(201).body("title",equalTo("BMW"))
				 .body("id", notNullValue()) 
				 .log().all();
	}
	}

