package com.Java.Hackathon;
/*
 * Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
 * 
 */

import java.util.Arrays;
import java.util.HashMap;

public class Q5ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iArray[] = {5,34,56,76,56,78,78,23,34,23};
		
		//Display the Array 
		System.out.println("Array of Numbers : "+ Arrays.toString(iArray));
		// In HashMap Key cannot be Duplicate but Value can be duplicate 
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0; i<iArray.length; i++) {
			
			hm.put(iArray[i], i);
			
		}
		
		System.out.println("Unique Numbers of Array : "+hm.keySet());
		
		//To find the number of occurrences of duplicate numbers.
		int count= 0;
		
		for(int i=0;i<iArray.length;i++) {
			
			for(int j=i+1; j<iArray.length;j++) {
				if(iArray[i] == iArray[j]) {
					count ++;
					//System.out.println(iArray[j]);	
				}
				
			}	
			
		}
		
		System.out.println("Number of occurrences of duplicate numbers :"+count);

	}

}
