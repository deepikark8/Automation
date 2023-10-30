package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("1", "Ram");
		tm.put("3", "Harshi");
		tm.put("5", "Harsh");
		tm.put("6", "Deepika");
		//tm.put(null, "Rahade");
		
		//To get both Keys and values
				for(Map.Entry<String,String> tmDisplay:tm.entrySet()) {
					
					//System.out.println(tmDisplay.getKey()+ " "+ tmDisplay.getValue());
				}
				
				TreeMap<Integer,String> tmNew = new TreeMap<Integer,String>();
				tmNew.put(34, "Ram");
				tmNew.put(6, "Harshi");
				tmNew.put(56, "Harsh");
				tmNew.put(67, "Deepika");
				//tm.put(null, "Rahade");
				
				//To get both Keys and values
//						for(Map.Entry<Integer,String> tmNewDisplay:tmNew.entrySet()) {
//							
//							System.out.println(tmNewDisplay.getKey()+ " "+ tmNewDisplay.getValue());
//						}	     
				
	     			
				TreeMap<String,Integer> tmStr1 = new TreeMap<String,Integer>();
				tmStr1.put("Deepu",34);
				tmStr1.put("Ram",39);
				tmStr1.put("Harsh",10);
				tmStr1.put("Harshi",5);
				tmStr1.put("test",null);
				
				
				for(Map.Entry<String,Integer> tmNewStr:tmStr1.entrySet()) {
					System.out.println(tmNewStr.getKey()+" "+ tmNewStr.getValue());
				}
				
				
				
				

	}

}
