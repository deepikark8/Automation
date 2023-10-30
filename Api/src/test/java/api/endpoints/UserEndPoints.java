package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


//UserEndPoints.java -> created for perform CRUD operations
//CRUD - create read update delete request the user API



public class UserEndPoints {

	//To create user
	//public static  -> so i can access any where in the project
	public static Response CreateUser(User payload){

		// sending the request and storing the response in the variable and return the response

		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(Routes.post_url);

		return response;

	}


public static Response readUser(String userName){

		Response response = given()
							.pathParam("username",userName)
			.when()
			.get(Routes.get_url);

		return response;

	}

public static Response updateUser(String userName,User payload){


	Response response = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParam("username", userName)
		.body(payload)
	.when()
		.put(Routes.update_url);

	return response;

}

public static Response deleteUser(String userName){

	Response response = given()
						.pathParam("username",userName)
		.when()
		.delete(Routes.delete_url);

	return response;

}






}
