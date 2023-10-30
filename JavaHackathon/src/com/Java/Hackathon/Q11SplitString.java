package com.Java.Hackathon;
/*
 * Q11 How to Split String in java?
 * 
 */

import java.util.Scanner;

public class Q11SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		
		String str = scanner.nextLine();
		
		String[] strArray = str.split(" ");
		
		for(int i =0 ; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
		}
		
		System.out.println("------Split with index-----");
		String[] strArray1 = str.split(str, 8);
		
		
		for(int j=0; j<strArray1.length; j++) {
			System.out.println(strArray[j]);
		}
		
		scanner.close();
		

	}

}
