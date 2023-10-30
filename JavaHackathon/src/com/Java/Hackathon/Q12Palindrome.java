package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * 
 * Write a program to check Palindrome (MalayalaM) for both numbers and string?
 * 
 */
public class Q12Palindrome {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string or numbers to check palindrome :" );
		String str = reader.nextLine();
		str = str.toLowerCase();		
		char[] chArray = str.toCharArray();
		//System.out.println(Arrays.toString(chArray));
		int sizeOfArray = chArray.length;
		boolean isItPalindrome = true;
		for(int i =1; i<chArray.length ;i++) {
			if(chArray[i-1]!=chArray[sizeOfArray-i]) {
				isItPalindrome = false;
				break;
				}
		}
		if(isItPalindrome == false) {
			System.out.println("Its not palindrome");
		}else {
			System.out.println("Its a palindrome");
		}
		reader.close();
		
		
		/*Method 2*/
		
		String myString = "anna";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
	}

}
