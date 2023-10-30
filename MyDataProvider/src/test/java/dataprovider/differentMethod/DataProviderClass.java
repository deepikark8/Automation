package dataprovider.differentMethod;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name= "SearchProvider")
	public static Object[][] getDataFromDataprovider(Method m){
		if(m.getName().equalsIgnoreCase("testMethodA")) {
		return new Object[][] {
			
			{"Deepika","India"},
			{"Ram","USA"},
			{"Harsh","Mountain House"},
			{"Harshitha","Santa clara"}
			
		};
		}else {
		return  new Object[][] {
			
			{"Canada"},
			{"Russia"},
			{"Mexico"}
		};
		
	}

}
}
