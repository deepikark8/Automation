package com.Java.Hackathon;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 
 * WJP to find total number of repeated integers, uppercase and lowercase character in the give string
 * 
 */

public class Q20RepeatedCh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = reader.nextLine();
		
		int repaetedInts = 0;
		int reapeatedLowerCaseChars = 0;
		int reapeatedUpperCaseChars = 0;
		
		HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
		for(int i=0; i<input.length();i++) {
			char c = input.charAt(i);
			if(Character.isDigit(c)) {
				if(charMap.containsKey(c)) {
					int count = charMap.get(c);
					//System.out.println("count :"+ count);
					if(count == 1) {
						repaetedInts++;
					}
					charMap.put(c, count+1);
					
				}else {
					charMap.put(c, 1);
				}
				
			}
			else if(Character.isLowerCase(c)) {
				
					if(charMap.containsKey(c)) {
						int count = charMap.get(c);
						//System.out.println("count :"+ count);
						if(count == 1) {
							reapeatedLowerCaseChars++;
						}
						charMap.put(c, count+1);
						
					}else {
						charMap.put(c, 1);
					}
				
				
				
			}else if(Character.isUpperCase(c)) {
				if(charMap.containsKey(c)) {
					int count = charMap.get(c);
					//System.out.println("count :"+ count);
					if(count == 1) {
						reapeatedUpperCaseChars++;
					}
					charMap.put(c, count+1);
					
				}else {
					charMap.put(c, 1);
				}
				
				
			}
			
			
			
		}
		
		
		
		System.out.println("Number of reapeated Integers : "+ repaetedInts);
		System.out.println("Number of repeated Lowercase :" + reapeatedLowerCaseChars);
		System.out.println("Number of repeated Uppercase :"+ reapeatedUpperCaseChars);
		
	/*	String str = reader.nextLine();
		str = str.replaceAll(" ", "");
		int upperCase =0 , lowerCase = 0, number = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <='Z') {
				upperCase++;
			}else if(ch >= '0' && ch <='9') {
				number++;
			}else if(ch >= 'a' && ch <= 'z') {
				lowerCase++;
			}
		}
		System.out.println("Lowercase letters : "+ lowerCase);
		System.out.println("Uppercase letters : "+ upperCase);
		System.out.println("Integers  : "+ number);*/
		
		
		
		
		
		reader.close();
		
	}

}
