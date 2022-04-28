package com.xorianttest1;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class GetJsonPathTest {
	
@Test
public void getJsonPathTest() {
	Response resp=given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2");
		/*
		 * JsonPath jp=new JsonPath(resp.asString());
		 * System.out.println(jp.get("data[0].id").toString());
		 */
	
	System.out.println(resp.path("data[0].id").toString());
	
}

}
