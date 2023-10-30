package com.Java.Hackathon;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * WJP to perform ascending order Selection  sort
 * 
 */
public class Q6AscendingOrderSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeSet always gives output in Ascending Order
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elments:");
		int num =  scanner.nextInt();
		int[] intArray = new int[num];
		System.out.println("Enter " + num + " integers");
		for(int i =0;i<num;i++) {
			intArray[i]=scanner.nextInt();
		}
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<intArray.length; i++) {
			ts.add(intArray[i]);	
		}
		System.out.println("Ascending Order: "+ ts);
		scanner.close();
	}
}
