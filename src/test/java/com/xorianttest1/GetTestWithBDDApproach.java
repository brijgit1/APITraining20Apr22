package com.xorianttest1;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class GetTestWithBDDApproach {
	
@Test
public void getListOfUsers() {
	//given
	//when-GET, PUT, POST , DELETE
	//than assert this and asserts that
	//given().baseUri("https://reqres.in/api/users?page=2").contentType(ContentType.JSON).when().get().then().assertThat().statusCode(200);
	System.out.println(given().baseUri("https://reqres.in/api/users?page=2").contentType(ContentType.JSON).when().get().asString());

}

@Test
public void getListOfUsers1() {
	//given
	//when-GET, PUT, POST , DELETE
	//than assert this and asserts that
	//given().baseUri("https://reqres.in/api/users?page=2").contentType(ContentType.JSON).when().get().then().assertThat().statusCode(200);
	given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);

}

@Test
public void getListOfUsers2() {
	//given
	//when-GET, PUT, POST , DELETE
	//than assert this and asserts that
	//given().baseUri("https://reqres.in/api/users?page=2").contentType(ContentType.JSON).when().get().then().assertThat().statusCode(200);
	given().queryParam("page", 2).contentType(ContentType.JSON).when().get("https://reqres.in/api/users").then().assertThat().statusCode(200);

}


}
