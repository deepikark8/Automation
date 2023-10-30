package com.Java.Hackathon;
/*
 * How can we make String Lower case to Upper case?
 * 
 */

import java.util.Scanner;

public class Q9MakeStringLowerToUpper {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String str = scanner.nextLine();
		String strLowerCase = str.toLowerCase();
		System.out.println("String Lower Case : "+ strLowerCase);
		System.out.println("String Lower to Upper case : "+ strLowerCase.toUpperCase());
		scanner.close();
	}

}
