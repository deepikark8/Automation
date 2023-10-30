package com.Java.Hackathon;
/*
 * 
 * Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
 * 
 */

import java.util.Scanner;

public class Q13ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string :" );
		String str = reader.nextLine();
		System.out.println("Input : "+ str );
		//String Builder is commonly used to reverse a string in Java
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		//System.out.println("Output : "+ sb );
		
		//Method 2
		
		char[] letters = reader.nextLine().toCharArray();
		System.out.println("Rev String");
		for(int i = letters.length - 1; i>=0;i--) {
			System.out.println(letters[i]);
		}
		System.out.println("\n");
		
		
		reader.close();
	}

}
