package com.Java.Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Given an array of integers check the Palindrome of the series.
 * 
 */

public class Q4Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elments:");	
		int num =  scanner.nextInt();
		int[] intArray = new int[num];
		System.out.println("Enter " + num + " integers");
		for(int i =0;i<num;i++) {	
			intArray[i]=scanner.nextInt();
		}
		int sizeOfArray = num - 1;
		boolean isItPalindrome = true;
		
		for(int i=0; i<intArray.length/2; i++) {
			
			
			if(intArray[i]!=intArray[sizeOfArray-i]) {
				
				isItPalindrome = false;
				break;
			}	
		}
		
		if(isItPalindrome) {
		System.out.println("Its Palindrome");
		}else {
			System.out.println("Its not Palindrome");
		}

		//Method 2
		System.out.println("******** Method 2 ********");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		ArrayList<Integer> revArrList = new ArrayList<Integer>();
		for(int arrElement :intArray ) {
			
			arrList.add(arrElement);
			revArrList.add(arrElement);
		}
		Collections.reverse(revArrList);
		if(arrList.equals(revArrList)== true) {
		System.out.println("Palindrome");
		
		}else {
			System.out.println("Not Palindrome");
		}
		
		scanner.close();
		
	}

}
 