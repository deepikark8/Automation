package com.Java.Hackathon;
/*
 * 
 * Write a program for binary search. And 5 i/p has to take from user as binary elements.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q25BinarySearch {
	
	int binarySearchArray(int arr[],int first,int last,int element) {
		
		
		
		while(first<=last) {
			
			int mid = (first+last)/2;
			
		
			if(arr[mid] == element) {
				
				return mid;
			}
			if(arr[mid]<element) {
				first = mid+1;
			}else {
				last = mid-1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elments:");
		int size =  scanner.nextInt();
		int[] iArray = new int[size];
		System.out.println("Enter " + size + " integers");
		for(int i =0;i<size;i++) {
			
			iArray[i]=scanner.nextInt();
		
		}
		
		System.out.println("Enter the search value");
		int iSearch = scanner.nextInt();
		
		//Method 1
		
		
		int result = Arrays.binarySearch(iArray, iSearch);
		System.out.println("Result found at index : " + result);
		
		//Method 2
		Q25BinarySearch obj = new Q25BinarySearch();
		int searchResult = obj.binarySearchArray(iArray, 0, size-1,iSearch);
		System.out.println("result"+searchResult);
		if(searchResult == -1) {
			System.out.println("Search element not found");
		}else {
			System.out.println("Search element "+iSearch +" index is "+ searchResult);
		}
		
		scanner.close();
	}

}
