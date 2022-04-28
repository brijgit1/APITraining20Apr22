package com.xorianttest1;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import pojoPackage.CreateUserPOJO;

public class CreateUserPOJOTest {
	
@Test
public void createUserTestA() {
	CreateUserPOJO createUserPOJO=new CreateUserPOJO("BrijB", "Xor");
	//given().contentType(ContentType.JSON).body(createUserPOJO).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	
}

}
