package Practices;

import java.util.HashMap;

/*
 * 
 * Write a Java Program to count the number of words in a string using HashMap.
 * 
 */
public class CountNumOfWordsInHashMap {

	public static void main(String[] args) {
		
		String str = "This this is is done by Saket Saket";
		String[] arrStr = str.split(" ");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0; i<arrStr.length;i++) {
			if(hm.containsKey(arrStr[i])) {
				int count = hm.get(arrStr[i]);
				count = count + 1;
				hm.put(arrStr[i], count);
			}else {
				hm.put(arrStr[i], 1);
			}
			
			
		}
		System.out.println(hm);
	}
}
