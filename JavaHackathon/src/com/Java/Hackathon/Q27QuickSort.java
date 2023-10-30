package com.Java.Hackathon;

import java.util.Arrays;

public class Q27QuickSort {
	
	public static void main(String[] args) {
		
		int array[] = {7,2,1,6,8,5,3,4};
		int start = 0;
		int end = array.length-1;
		
		System.out.println("Array : "+ Arrays.toString(array));
		
		QuickSort(array,start,end);
		
		System.out.println(Arrays.toString(array));
		
		
		
	}
	
	public static void QuickSort(int[] array, int start ,int end) {
		
		System.out.println("Start   :"  +start);//0
		System.out.println("End     :" + end);//2
		
		if(start < end) {
			System.out.println(" ---------  Entering If -------- ");
			
			int partitionIndex = partition(array,start,end);//3
			
			QuickSort(array,start,partitionIndex-1);//array,0,3-1
			System.out.println("QuickSort 1   :"+Arrays.toString(array));
			QuickSort(array,(partitionIndex+1),end);
			System.out.println("QuickSort 2  :"+Arrays.toString(array));
		}
		
	}
	
	
	public static int partition(int[] array, int start, int end) {
		
		int pivot = array[end]; //a[ 2]=3
		int PIndex = start; //start = 0 //end = 7
		int temp =0 ;
		
		System.out.println("PIVOT : "+ pivot);
		System.out.println("P index  : "+ PIndex);
		
		
		for(int i = start;i<end;i++) {
			
			if(array[i]<pivot) {
				temp = array[i];
				array[i] = array[PIndex];
				array[PIndex]= temp;
			
				PIndex = PIndex + 1;
			
			}
			
		}
		System.out.println("New Pindex :"+PIndex);
		System.out.println("Array after temp in for loop :"+Arrays.toString(array));
		
		int temp1 = array[PIndex];
		array[PIndex] = array[end];
		array[end] = temp1;
		System.out.println("Array  temp :"+Arrays.toString(array));
		
		
		System.out.println(" PIndex in partition  : "+PIndex);
		return PIndex;
	}
	
	
	
	
	

}
