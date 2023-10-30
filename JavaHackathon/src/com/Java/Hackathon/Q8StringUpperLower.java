package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * How can we make String upper case to lower case?
 * 
 */

public class Q8StringUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.nextLine();
		System.out.println(str);
		System.out.println("UPPERCASE : "+str.toUpperCase());
		System.out.println("LowerCase : "+str.toLowerCase());

		scanner.close();
	}

}
