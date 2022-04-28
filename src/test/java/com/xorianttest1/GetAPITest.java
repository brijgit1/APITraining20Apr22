package com.xorianttest1;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPITest {
	
@BeforeClass
public void forAllMethods() {
	RestAssured.baseURI="https://reqres.in";
	RestAssured.basePath="/api/users";
}
	
	
@Test
public void getListOfUsers() {
	
	RequestSpecification reqsp=RestAssured.given();
	reqsp.queryParam("page", 2);
	
	Response resp=reqsp.get();
	System.out.println(resp.asString());
	
	
}

@Test
public void getListOfUsers1() {
	
	RequestSpecification reqsp=RestAssured.given();
	reqsp.queryParam("page", 2);
	
	Response resp=reqsp.get();
	System.out.println(resp.asString());
	
	
}

@Test
public void getListOfUsers2() {
	RequestSpecification reqsp=RestAssured.given();
	reqsp.queryParam("page", 2);
	
	Response resp=reqsp.get();
	System.out.println(resp.asString());
	
	
}


}
