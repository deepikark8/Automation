package com.training.restapi;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

/*
 * 
 * hamcrest Matcher
 * 
 * String :
 * 	startsWith
 * 	equalTo
 * 	equalToIgnoreCase
 * 	EndsWith
 * 	ContainsString
 * 	equalToIgnoreCaseWhiteSpace
 * 
 * 
 * Number :
 * 	equalTo
 * greaterthan
 * lessthan
 * lessthanequalto
 * 
 * 
 * Collections:
 * hasItem
 * hasItems
 * hasKey
 * 
 /
  * 
  */
/*
 * 
 * 1. Status code
 * 2. validate schema
 * 3. validate data
 *  	- Jpath
 *  	- json.jway
 *  	- hamcrest matcher
 *  4. How to read json file 
 * 	5. to traverse to a given field
 *  
 * 
 */
 

public class ApiAutomationUsers {
	
	String sHost = "https://jsonplaceholder.typicode.com";
	String sEPUsers = "/users";
	String sURI = "";
	
	@Test
	public void validate() throws IOException {
		sURI = sHost + sEPUsers;
		RestAssured.baseURI = sURI; // like pasting url link in Postman 
		Response response = RestAssured.given().get();// No body , no header
		//response.prettyPrint(); // To get the response
		
		System.out.println(response.getStatusCode());
		//String ActualValue = response.jsonPath().get("name[0]");
		//System.out.println(response.jsonPath().get("name[0]"));
		  
		
		String filepath = "/Users/rahade/eclipse-workspace4/ApiAutomation/TestData/ExpectedResponseforUser.json";
		String fileReadyToRead = readFileReturnString(filepath);
		//To parse json file and return string 
		//- it converts json file into string file because we have a inbuilt fn or class which is used to validate file .

		String ExpectedValue = JsonPath.read(fileReadyToRead, "$.[0].name");//expected value from the input data/json file using jsonPath
		String ExpectedCity = JsonPath.read(fileReadyToRead, "$.[3].address.city");// if want to validate the particular city from the input data/json file
		
		
		//Assert.assertEquals(ActualValue, ExpectedValue); 
		//Dependency - hamcrest Matcher - 1.3 
		// To compare response values - To use hamcrest matcher we need to import in manually

		
		//Instead of assertion to compare we use hamcrest Matcher
		response.then().body("name[0]", equalTo(ExpectedValue));// Using hamcrest Matcher we are validating the with actualvalue the expectedvalue
		response.then().body("email[0]", startsWith("S"));

		//hasItem - array of data
		response.then().body("address.city", hasItem("South Elvis"));
		response.then().body("address.city", hasItem(ExpectedCity)); // To validate the expected city with actual city
		
		response.then().body("address.city", hasItems("Gwenborough","McKenziehaven"));
		
		
		
	
		/*	List<String> cities = response.jsonPath().getList("address.city");
		
		for(String city: cities) {
			System.out.println(city);
			if(city.equalsIgnoreCase("South Elvis")) {
				System.out.println("Testcase Passed");
				break;
			}
		}*/
		
	}

	//It will take the file path and decode into string
	private String readFileReturnString(String filepath) throws IOException {

		byte[] encoded = Files.readAllBytes(Paths.get(filepath));//It will take the filepath and it will decode into byte
		return new String(encoded,StandardCharsets.UTF_8); // It will return as a string 

	}
	
	
	
	

}
