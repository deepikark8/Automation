package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 
 * 
 */
public class Q1ThreeBooleanVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first Boolean Values");
	
	boolean first = reader.nextBoolean();
	System.out.println("Enter the second Boolean Values");
	boolean second = reader.nextBoolean();
	System.out.println("Enter the third Boolean Values");
	boolean third = reader.nextBoolean();
	boolean result;
	
	if(first) {
		result = second || third;
	}else{
		result = second && third;
	}
	
	if(result) {
		System.out.println("Two Boolean are true");
	}else {
		System.out.println("Two Booleans are not True");
	}
	
		
	reader.close();
	}

}
