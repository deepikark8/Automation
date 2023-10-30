package com.Java.Hackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



/*
 * Write a function to find out longest palindrome in a given string?
 * 
 * 
 */

public class Q30LongestPalindromeInStr {
      	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		//String str = scanner.nextLine();
		
		
		String strText = scanner.nextLine();
		
		LongestPalindroneString(strText);
	
	}
	
	
	public static void LongestPalindroneString(String strText) {
		String[] strArray = strText.split(" ");
		//System.out.println("test :"+ Arrays.toString(strArray));
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		for(int i = 0; i<strArray.length;i++) {
			
			String myString = strArray[i];
		      StringBuffer buffer = new StringBuffer(myString);
		      buffer.reverse();
		      String data = buffer.toString();
		      if(myString.equals(data)){
		         System.out.println("Given String is palindrome : "+myString);
		         if(myString.length() < 3) {
		         arrList.add(myString);
		         }
		         
		      } else {
		         System.out.println("Given String is not palindrome : "+myString);
		      }
		
		      
		}
		
		for(int i=0; i<arrList.size();i++) {
			for(int j=1;j<arrList.size();j++) {
			
			String first = (String) arrList.get(i);
			String Second = (String) arrList.get(j);
			
			
			if(first.length() < Second.length()) {
				System.out.println("Longest Palindrome is "+ Second+" "+"Length : "+ Second.length());
			}else {
				
			}
			
			}
			
		}
		
	}
	

}
