package com.Java.Hackathon;
import java.util.Scanner;

/*
 * 
 * write a program to find factorial (Non Recursive)
 * Factorial === to multiply all whole numbers from our chosen number
 * 
 */

public class Q2Factorial {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number to find the Factorial");
		
		int number = reader.nextInt();
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+number+ " is " +factorial);
		
		reader.close();
		
		
		
		
		
	}
}
