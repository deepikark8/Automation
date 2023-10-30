package com.Java.Hackathon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 
 * Given an array of integers, sort the integer values.
 * 
 */
public class Q3ArrayOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Number of elements in array
		System.out.println("Enter the number of elments:");
		int num =  scanner.nextInt();
		int[] iArray = new int[num];
		System.out.println("Enter " + num + " integers");
		// Add array elements to array
		for(int i =0;i<num;i++) {	
			iArray[i]=scanner.nextInt();
		}
		System.out.println("Array of Integers before Sorting");
		for(int n=0; n<=iArray.length-1; n++) {	
			System.out.println(iArray[n]);
		}
		 Arrays.sort(iArray);
		 System.out.println("Array of Integers after Sorting - Method 1");
		 for(int i=0 ; i<=iArray.length-1; i++) {
			 System.out.println(iArray[i]);	 
		 } 
		 //Method 2
		 System.out.println("Sorting using Treeset - Method 2");
		 TreeSet<Integer> ts = new TreeSet<Integer>();
		 for(int i =0;i<num;i++) {	
				ts.add(iArray[i]);	 
			}
		 for(Integer numInt:ts) {
			System.out.println(numInt);
		 } 
		 //Method 3
		 System.out.println("Sorting in Method 3");
		 int temp;
		 for(int i=1; i<num;i++) {
			 for(int j=i;j>0;j--) {
				 
				 if(iArray[j]<iArray[j-1]) {
					 temp = iArray[j];
					 iArray[j]= iArray[j-1];
					 iArray[j-1]=temp;
				 }
				 
			 }
		 } 
		 for(int i=0 ; i<=iArray.length-1; i++) {
			 System.out.println(iArray[i]);	 
		 }
		scanner.close();
	}

}
