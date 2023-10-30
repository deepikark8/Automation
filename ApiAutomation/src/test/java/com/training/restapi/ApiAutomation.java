package com.training.restapi;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiAutomation {
	
	String sHostUrl = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	
	String sEndPointLogin = "/login";
	String sEndPointGetData = "/getdata";
	String sEndPointAddData = "/addData";
	String sEndPointUpdateData = "/updateData";
	String sEndPointDeleteData = "/deleteData";
	
	//URI = Universal resource Identifier
	String sURI = "";
	//Create a object for response
	Response response;
	int status;
	
	
	
	@Test
	public void login() {
		sURI = sHostUrl+sEndPointLogin;
		System.out.println(sURI);
		// Assign it to some tool for request
		RestAssured.baseURI = sURI;
		
		String token;
		
		//Response is defined by schema..
		response = RestAssured.given().body("{\"username\": \"deepikark8@gmail.com\", \n"
				+ "    \"password\": \"deepikark123\"\n"
				+ "}").when().contentType("application/json").post();
		
		status = response.getStatusCode();
		System.out.println(status);
		//To see the response
		//System.out.println(response.asString());
		
		//To make your response neat
		//System.out.println(response.asPrettyString());
		
		response.prettyPrint();
		
		//To get the token separately from the response
		//jsonPath() - to parse the response
		token = response.jsonPath().get("token[0]");
		System.out.println(token);
		
		if(status == 201) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
	
		//--------------- Get Data -------------------
		sURI = sHostUrl+sEndPointGetData;
		RestAssured.baseURI = sURI;
		
		//HashMap is used to store header data
		HashMap<String , String> headerData = new HashMap<String , String>();
		headerData.put("Content-Type", "application/json");
		headerData.put("Token", token);
		
		//This is for request and response of getData 
		response = RestAssured.given().headers(headerData).get();
		
		//Response of getData
		//System.out.println(response.asPrettyString());
		
		//To get all account numbers
		List<String>accountNumbers = response.jsonPath().getList("accountno");
		for(String accountNumber:accountNumbers) {
			//System.out.println(accountNumber);
		}
		
		
		//--------------- Add Data -------------------
		sURI = sHostUrl+sEndPointAddData;
		//Assign
		RestAssured.baseURI = sURI;
		
		response = RestAssured.given().headers(headerData).body("{\n"
				+ "\"accountno\": \"TA-0000004\",\n"
				+ "\"departmentno\": \"2\",\n"
				+ "\"salary\": \"20001\",\n"
				+ "\"pincode\": \"222211\",\n"
				+ "\"userid\": \"2SzbIDsypLtkddHfpkrL\",\n"
				+ "\"id\": \"NeWyYtMPyR9nghcK5vGl\"\n"
				+ "}").when().post();
		status = response.getStatusCode();
		System.out.println("Status of Add Data : "+status);
		if(status == 201) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
		
		//--------------- Update Data -------------------
		sURI = sHostUrl + sEndPointUpdateData;
		RestAssured.baseURI = sURI;
		response = RestAssured.given().headers(headerData).body("{\n"
				+ "\"accountno\": \"TA-1000004\",\n"
				+ "\"departmentno\": \"2\",\n"
				+ "\"salary\": \"20001\",\n"
				+ "\"pincode\": \"222211\",\n"
				+ "\"userid\": \"2SzbIDsypLtkddHfpkrL\",\n"
				+ "\"id\": \"NeWyYtMPyR9nghcK5vGl\"\n"
				+ "}\n"
				+ "").when().put();
		status = response.getStatusCode();
		System.out.println("Status of Update Data : "+status);
		if(status == 200) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
		
		//--------------- Delete Data -------------------
		sURI = sHostUrl + sEndPointDeleteData;
		RestAssured.baseURI = sURI;
		response = RestAssured.given().headers(headerData).body("{\n"
				+ "\"accountno\": \"TA-1000004\",\n"
				+ "\"departmentno\": \"2\",\n"
				+ "\"salary\": \"20001\",\n"
				+ "\"pincode\": \"222211\",\n"
				+ "\"userid\": \"2SzbIDsypLtkddHfpkrL\",\n"
				+ "\"id\": \"NeWyYtMPyR9nghcK5vGl\"\n"
				+ "}\n"
				+ "").when().delete();
		status = response.getStatusCode();
		System.out.println("Status of Delete Data : "+status);
		if(status == 200) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
	}
	
	
	
	
	
	

}
