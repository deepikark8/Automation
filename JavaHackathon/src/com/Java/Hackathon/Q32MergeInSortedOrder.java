package com.Java.Hackathon;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. 
 * Write a method to merge B into A in sorted order. 
 * 
 */
public class Q32MergeInSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elments:");
		
		int num =  scanner.nextInt();
		int[] arrA = new int[num];
		
		
		System.out.println("Enter " + num + " integers");
		
		
		for(int i =0;i<num;i++) {
			
			arrA[i]=scanner.nextInt();
		
		}
			
		//int[] iArray1 = new int[]{1,2,4,6,9,10};
		System.out.println("Array1 ["+arrA.length+"] = "+Arrays.toString(arrA));
		
		
		System.out.println("Enter the number of elments:");
		int num2 =  scanner.nextInt();
		int[] arrB = new int[num2];
		
		System.out.println("Enter " + num2 + " integers");
		
		
		for(int i =0;i<num2;i++) {
			
			arrB[i]=scanner.nextInt();
		
		}
		
		//int[] iArray2 = new int[] {3, 5,7,8};
		System.out.println("Array2 ["+arrB.length+"] = "+Arrays.toString(arrB));
		
		
	
		if(num>num2) {
			
		for(int x=0; x<arrA.length;x++) {
			
			
			if(arrA[x] == 0) {
		
				for(int i=0; i<arrB.length;i++) {
			
					arrA[x+i]=arrB[i];
					System.out.println(arrA[x+i] +"="+arrB[i]);
					
					
			
				}
				
			}
		
			}
		
		}
		Arrays.sort(arrA);
		System.out.println(Arrays.toString(arrA));

		scanner.close();
		
	}

}
