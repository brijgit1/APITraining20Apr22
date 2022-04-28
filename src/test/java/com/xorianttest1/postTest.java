package com.xorianttest1;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postTest {
	
@Test
public void postTest() {
	
	given().contentType(ContentType.JSON).body("{\r\n" + 
			"    \"name\": \"Brij\",\r\n" + 
			"    \"job\": \"STL\"\r\n" + 
			"}")
	.when().post("https://reqres.in/api/users").then().statusCode(201);
}

@Test
public void postTesttwo() {
	given().contentType(ContentType.JSON).body("{\r\n" + 
			"    \"name\": \"Brij\",\r\n" + 
			"    \"job\": \"STL\"\r\n" + 
			"}")
	.when().post("https://reqres.in/api/users").then().log().all();
}




}
