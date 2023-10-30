package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 *Q28  WJP to find factorial of a number using recursion
 * 
 */

 	


public class Q28FactorialWithRecursion{
	
	static int factorial(int n) {
		
		if(n==0) 
			return 1;
			
		else 
			
			return(n*factorial(n-1));
		
		
		
		
 	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find Factorial : ");
		int num = scanner.nextInt();
		int fact = 1;
		
		//Recursion
		 fact = factorial(num);
		
	
		
		
		System.out.println("Factorial of "+num +" is " +fact);
		scanner.close();

	}

}
