package InvokeDataProviderFromDiffClass;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name= "SearchProvider")
	public static Object[][] getDataFromDataprovider(){
		return new Object[][] {
			
			{"Deepika","India"},
			{"Ram","USA"},
			{"Harsh","Mountain House"},
			{"Harshitha","Santa clara"}
			
		};
		
	}

}
