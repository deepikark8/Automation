package com.Java.Hackathon;
/*
 * WJP to display number of occurrence of all character
 * 
 */

import java.util.HashMap;
import java.util.Scanner;

class Q19NumOccCh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string");
		
		String str = reader.nextLine();
		char chArray[] = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		for(char ele: chArray) {	
			if( hm.containsKey(ele)) {
				hm.put(ele,hm.get(ele)+1);
			}else {
				hm.put(ele,1);
			}
			
		}
		System.out.println(hm);
		
		
			reader.close();		
	}

}
