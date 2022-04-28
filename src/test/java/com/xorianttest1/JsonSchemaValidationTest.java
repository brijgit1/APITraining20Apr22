package com.xorianttest1;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationTest {
	
@Test
public void jsonSchemaValidationTest() {
	//File file =new File("D:\\APIAutomation\\APITraining20Apr22\\src\\test\\resources\\jsonschema_GetUsers.json");
	//File file =new File("./src/test/resources/jsonschema_GetUsers.json");
	File file =new File(System.getProperty("user.dir")+"/src/test/resources/jsonschema_GetUsers.json");

	given().contentType(ContentType.JSON)
	.when().get("https://reqres.in/api/users?page=2").then()
	.body(JsonSchemaValidator.matchesJsonSchema(file));
}

}
