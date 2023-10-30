package usinggroups;



import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


/*
 * 
 *  ITestContext - Different test parameters based on groups
 * 
 */
public class DataProviderClass {
	
	@DataProvider(name= "SearchProvider")
	public static Object[][] getDataFromDataprovider(ITestContext c){
		Object[][] groupArray = null;
		
		for(String group: c.getIncludedGroups()) {
			if(group.equalsIgnoreCase("A")) {
				
				groupArray = new Object[][] {
					{"Deepika","MH"},
					{"Ram","Santa Clara"},
					{"Harsh","San Jose"},
					{"Harshitha","Milpitas"}
				};
				break;
				
			}else if(group.equalsIgnoreCase("B")) {
				
				groupArray = new Object[][] {
					{"Asia"},
					{"Europe"},
					{"Africa"},
					{"NorthAmerica"}
				};
			}
				break;
				
				
			}
			return groupArray;
		}
		
	}


