package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//have a nice daya day nice nice

public class DuplicateWordInString {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a text");
		String str = reader.nextLine();
		String[] strArr = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String s:strArr) {
			Integer i = hm.get(s);
			if(i==null) {
				i =0 ;
			}
			hm.put(s, i+1);
		}
		
		// pass lambda expression to forEach()
			hm.forEach((key, value) -> {
				
				if(value > 1) {
					System.out.println(key + ":" + value);
				}
				
			 });
			
		reader.close();
		
	}

}
