package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 *  WJP to display duplicate character in string
 * 
 */


public class Q18DuplicateChInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string");
		
		String str = reader.nextLine();
		str = str.toLowerCase();
		char[] chArray = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length();j++) {
				
				if(chArray[i] == chArray[j]) {
					System.out.print(chArray[j]);
					break;
				}
			}
			
		}
		reader.close();

	}

}
