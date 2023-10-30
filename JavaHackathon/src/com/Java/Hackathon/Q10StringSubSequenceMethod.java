package com.Java.Hackathon;
/*
 *Q10  What is String subSequence method?
 * 
 */

import java.util.Scanner;

public class Q10StringSubSequenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String Sub Sequence Method returns character from the String
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String str = scanner.nextLine();
		System.out.println("Enter the substring index");
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		
		if(str.length()>0) {
			if(firstNum<str.length() && secondNum<str.length()) {
		System.out.println(str.subSequence(firstNum, secondNum));
			}else {
				System.out.println("Invalid request");
			}
		}
		scanner.close();
		
	}

}
