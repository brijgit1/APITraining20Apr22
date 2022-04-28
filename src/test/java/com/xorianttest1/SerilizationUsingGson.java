package com.xorianttest1;

import org.testng.annotations.Test;

import com.google.gson.*;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import pojoPackage.CreateUserPOJO;

public class SerilizationUsingGson {
	
@Test	
public void gsonTest() {
	Gson gson= new Gson();
	CreateUserPOJO createUserPOJO =new CreateUserPOJO("BrijC", "PuneMah");
	given().contentType(ContentType.JSON).body(gson.toJson(createUserPOJO)).when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();

}

@Test	
public void gsonTestA() {
	HashMap<String, String> hm=new HashMap<>();
	hm.put("name", "Ramesh");
	hm.put("job", "XorJob");
	
	Gson gson= new Gson();
	//CreateUserPOJO createUserPOJO =new CreateUserPOJO("BrijC", "PuneMah");
	given().contentType(ContentType.JSON).body(gson.toJson(hm)).when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
}

@Test	
public void gsonTestUsingJsonObject() {
	Gson gson= new Gson();
	JsonObject jo= new JsonObject();
	jo.addProperty("name", "GSONName");
	jo.addProperty("job", "Gson_JOB");
	given().contentType(ContentType.JSON).body(gson.toJson(jo)).when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
}

}
