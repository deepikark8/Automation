package api.endpoints;


//Maintain all the urls here
// we get urls from Swagger URI

//Uniform resource locator = baseurl + endpoint
//baseurl = common url

//https://petstore.swagger.io/v2


public class Routes {

	//public to access everywhere in the project
	//static to access the variable directly by using the class name without using any object
	public static String base_url = "https://petstore.swagger.io/v2";

	//User module
	public static String post_url = base_url+"/user";//->this post request create a new user
	public static String get_url = base_url+"/user/{username}";//->this username we will pass in another request
	public static String update_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";

	//Store module


	//Pet module


}
