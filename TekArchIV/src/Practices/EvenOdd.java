package Practices;

import java.util.Scanner;
/*
 * 
 * Java Program to Find Odd or Even number
 * 
 */
public class EvenOdd {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = reader.nextInt();
		System.out.println("test");
		if(num%2 == 0) {
			System.out.println("Its Even Number");
		}else {
			System.out.println("Its Odd Number");
		}
		
		reader.close();
	}
}
