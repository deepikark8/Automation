package Practices;

import java.util.Scanner;

/*
 * 
 * Java Program to Swap two numbers without using third variable
 * 
 */
public class SwapTwoNumbersWithoutThirdVariable {
	
	public static void main(String[] args) {
		
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Enter the number1 :");
		
		int a = 10;
		int b = 20;
		System.out.println("a : "+a);
		System.out.println("b :"+b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a :"+ a);
		System.out.println("b :"+b);
		
		
	}

}
