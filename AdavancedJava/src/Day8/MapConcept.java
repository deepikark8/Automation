package Day8;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(34, "Deepu");
		hm.put(39, "Ram");
		hm.put(10, "Harsh");
		hm.put(5, "Harshi");
		hm.put(null, "test");
		
		//System.out.println(hm.get(6));
		//System.out.println(hm.size());
		
		
		//Getting values from HashMap
//		for(String values:hm.values()) {
//			System.out.println(values);	
//		}
		
		
		HashMap<String,String> hmStr = new HashMap<String,String>();
		hmStr.put("*", "Deepu");
		hmStr.put("Star", "Ram");
		hmStr.put("Square", "Harsh");
		hmStr.put("Rectangle", "Harshi");
		hmStr.put(null, "test");
		
		
		String str = hmStr.get("Square");
		//System.out.println(str);
		
		//Getting Keys from HashMap
//		for(String keys:hmStr.keySet())
//			System.out.println(keys);
		
		
		
		//To get both Keys and values
		for(Map.Entry<String,String> hmDisplay:hmStr.entrySet()) {
			
			//System.out.println(hmDisplay.getKey()+ " "+ hmDisplay.getValue());
		}
		
		
		HashMap<String,Integer> hmStr1 = new HashMap<String,Integer>();
		hmStr1.put("Deepu",34);
		hmStr1.put("Ram",39);
		hmStr1.put("Harsh",10);
		hmStr1.put("Harshi",5);
		hmStr1.put("test",null);
		
		
		for(Map.Entry<String,Integer> hmNewStr:hmStr1.entrySet()) {
			System.out.println(hmNewStr.getKey()+" "+ hmNewStr.getValue());
		}
		
		
		
		

	}

}
