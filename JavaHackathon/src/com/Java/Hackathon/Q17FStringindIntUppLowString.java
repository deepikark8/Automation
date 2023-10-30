package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * WJP to find total number of integers, uppercase and lowercase character in the give string
 * 
 * 
 */

public class Q17FStringindIntUppLowString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = reader.nextLine();
		String newString = str.replaceAll(" ", "");
		
		int number = 0;
		int upperCase = 0;
		int lowerCase = 0;
		
		for(int i=0; i<newString.length(); i++) {
			
			char ch = newString.charAt(i);
			
			
			if(ch>= '0' && ch <='9') {
				
				number++;
				
			}else if(ch >='A'&& ch<='Z') {
				
				upperCase++;
			}else if(ch >='a' && ch <='z') {
				lowerCase++;
				
			}
		
			
			
		}
		
		System.out.println("Integers : "+ number);
		System.out.println("UpperCase : "+ upperCase);
		System.out.println("LowerCase : "+ lowerCase);
		
		
		reader.close();
	}

}
