package com.xorianttest1;

import java.io.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.JSONPObject;

import pojoPackage.CreateUserPOJO;

public class SerilizationUsingJackson {
	
	
@Test
public void JacksonSerilization() throws StreamWriteException, DatabindException, IOException {
	
	CreateUserPOJO createUserPOJO=new CreateUserPOJO("BrijBhan", "TestAutomation");
	ObjectMapper om = new ObjectMapper();
	om.writeValue(new File("D:\\APIAutomation\\APITraining20Apr22\\src\\test\\resources\\createUserPayload.json"), createUserPOJO);
}

}
