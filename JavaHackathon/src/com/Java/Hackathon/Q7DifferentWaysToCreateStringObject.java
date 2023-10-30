package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * What are different ways to create String Object?
 * 
 */
public class Q7DifferentWaysToCreateStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		//String str = new String();
		//String str1 = new String("Hi");
		String str2 = scanner.nextLine();
		//System.out.println(str);
		//System.out.println(str1);
		System.out.println(str2);

		scanner.close();
	}

}
