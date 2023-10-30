package com.Java.Hackathon;

import java.util.Arrays;

import java.util.TreeSet;

/*
 * 
 * WJP to merge two sorted array.(Do not use third array)		
 * array1[10] = 1,2,4,6,9,10		
 * array2[4] =  3, 5,7,8		
 * After merge :  
 * array1[10] = 1,2,3,4,5,6,7,8,9,10
 * 
 */

public class Q26MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1 - TreeSet
	
		int[] iArray1 = new int[]{1,2,4,6,9,10};
		System.out.println("Array1 ["+iArray1.length+"] = "+Arrays.toString(iArray1));
		
		int[] iArray2 = new int[]{3, 5,7,8};
		
		
		System.out.println("Array2 ["+iArray2.length+"] = "+Arrays.toString(iArray2));
		TreeSet<Integer> tsStr = new TreeSet<Integer>();
		for(int i=0; i<iArray1.length; i++) {
			tsStr.add(iArray1[i]);
		}
		for(int j=0; j<iArray2.length; j++) {
			tsStr.add(iArray2[j]);
		}
		System.out.println("After merge ["+tsStr.size()+"] = "+tsStr);
		
		
		
		//Method 2 - using Array sort
		System.out.println("*******    Method 2    *******");
		System.out.println();
		
		int[] array1 = new int[10];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 4;
		array1[3] = 6;
		array1[4] = 9;
		array1[5] = 10;
		int[] array2 = new int[4];
		array2[0] = 3;
		array2[1] = 5;
		array2[2] = 7;
		array2[3] = 8;
		
		int size = array1.length - array2.length;
		for(int i=0;i<array2.length;i++) {
			array1[size] = array2[i];
			size++;
		}
		System.out.println("Combining two array: "+Arrays.toString(array1));
		//Arrays.sort(array1);
		//System.out.println("Sorted array["+array1.length+"]"+" = "+Arrays.toString(array1));
		
		//Method 3 - using for loop
		System.out.println("*******    Method 3    *******");
		System.out.println();
		 int temp;
		for(int i=0; i<=array1.length;i++) {
			
			
			for(int j=i+1; j<=array1.length-1;j++) {
				
				if(array1[i]>array1[j]){
					
					temp = array1[i];
					array1[i] = array1[j];
					array1[j]= temp;
					
				}
				
			}
			
			
			
			
		
		}
		
		
		System.out.println("MEthod 3 Sorted array["+array1.length+"]"+" = "+Arrays.toString(array1));
		
		
		
		
	}
	

}
