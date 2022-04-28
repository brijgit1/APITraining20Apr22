package com.xorianttest1;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetTestWithJsonPath {
	
@Test
public void validateResponseUsingHamcreset() {
	//Assert using hamcreset
	RestAssured.baseURI="https://reqres.in/api/users";
	RequestSpecification reqSpec=RestAssured.given();
	reqSpec.header("content-type","application/json");
	reqSpec.queryParam("page", 2);
	reqSpec.get().then().body("page",equalTo(3));//Hamcrest assertions....please do hands on on functional programming/Java8 concepts
}

@Test
public void validateResponseJsonPath() {
	//Assert using hamcreset
	RestAssured.baseURI="https://reqres.in/api/users";
	RestAssured.rootPath="data[0]";
	RequestSpecification reqSpec=RestAssured.given();
	reqSpec.header("content-type","application/json");
	reqSpec.queryParam("page", 2);
	reqSpec.get().then().body("id",equalTo(7));
}

@Test
public void validateResponseJsonPathTwo() {
	//Assert using hamcreset
	RestAssured.baseURI="https://reqres.in/api/users";
	RestAssured.rootPath="data[0]";
	RequestSpecification reqSpec=RestAssured.given();
	reqSpec.header("content-type","application/json");
	reqSpec.queryParam("page", 2);
	reqSpec.get().then()
	.body("id",equalTo(7))
	.body("email", equalTo("michael.lawson@reqres.in"))
	.body("first_name", equalTo("Michael"))
	.body("last_name",equalTo("Lawson"));
}

@Test
public void validateResponseUsingrootMethod() {
	RestAssured.baseURI="https://reqres.in/api/users";
	RequestSpecification reqSpec=RestAssured.given();
	reqSpec.header("content-type","application/json");
	reqSpec.queryParam("page", 2);
	//reqSpec.get().then().root("data").body("id", hasItem(100));
	reqSpec.get().then().root("data").body("id", hasItems(7,9,8));
}



}
