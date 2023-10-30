package com.Java.Hackathon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * WJP to perform ascending order Quick sort
 * 
 * 
 */
public class Q27AscendingOrderQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of elments");
		
		int num =  reader.nextInt();
		int[] iArray = new int[num];
		
		System.out.println("Enter the  "+num+"integers");
		
		for(int i =0;i<num;i++) {
			
			iArray[i]=reader.nextInt();
		
		}
		
		TreeSet<Integer> tsInt = new TreeSet<Integer>();
		
		for(int i=0; i<num; i++) {
			
			tsInt.add(iArray[i]);
		}

		System.out.println(tsInt);
		reader.close();
		
		*/
		System.out.println("********    Method - Quick Sort *********");
		int array[] = {51,95,66,72,42,38,39,41,15}; //{7,2,1,6,8,5,3,4};
		System.out.println("Array before Quick sort :" + Arrays.toString(array));
	/*	int start = 0;
		int end = array.length-1;
		QuickSort(array,start,end);
		System.out.println("Array after Quick sort : "+Arrays.toString(array));*/
		
		
		
		int pivot = array[0];
		
		int sizeOfArray = array.length;
		int temp =0; 
		
		
		for(int i=1;i<array.length/2;i++) {
			//System.out.println(array[i]+ ">"+ pivot+ "|| "+ array[sizeOfArray-i]+"<"+pivot);
			
			if(array[i] > pivot || array[sizeOfArray-i]< pivot){
				
				temp = array[i];
				array[i]=array[sizeOfArray-i];
				array[sizeOfArray-i] = temp;
				
			}
			
		}
		System.out.println("Array after Quick sort 1 :" + Arrays.toString(array));
		int midPoint = array.length/2 + 1;
		System.out.println("Midpoint :" + midPoint);
		if(array[midPoint]<pivot) {
			
			temp = array[midPoint];
			array[midPoint] = array[0];
			array[0] = temp;
		}
		
		System.out.println("Array after Quick sort 2 :" + Arrays.toString(array));
		
		//Sorting Left Array
		int sizeOfLeftArray = midPoint-1;
		pivot = array[sizeOfLeftArray/2];
		System.out.println("Pivot :"+pivot);
		//int[] arrayLeft = new int[sizeOfLeftArray];
		System.out.println("Left Array Size :" + sizeOfLeftArray);
		
		for(int i =0; i<sizeOfLeftArray/2; i++) {
			System.out.println(array[i]+"<"+ pivot + "&&"+array[sizeOfLeftArray-i]+">"+ pivot);
			if(array[i]> pivot && array[sizeOfLeftArray-i]< pivot) {
				
				temp = array[i];
				array[i] = array[sizeOfLeftArray-i];
				array[sizeOfLeftArray-i] = temp;
				
			}
			
		}
		int midLeftPoint = sizeOfLeftArray/2 +1;
		System.out.println("MidLEft Point :" + midLeftPoint);
		if(array[midLeftPoint]< pivot) {
			
			temp = array[midLeftPoint];
			array[midLeftPoint] =  array[sizeOfLeftArray/2];
			 array[sizeOfLeftArray/2] = temp;
		}
		System.out.println("Array after Quick sort 3 :" + Arrays.toString(array));
		
		//Sorting Left Array - 2
		int sizeOfLeftArray2 = midLeftPoint;
		System.out.println("sizeOfLeftArray2 :"+ sizeOfLeftArray2);
		pivot = array[0];
		System.out.println("Pivot 2 :"+pivot);
		//int[] arrayLeft = new int[sizeOfLeftArray];
		System.out.println("Left Array Size :" + sizeOfLeftArray2);
		
		for(int i =1; i<sizeOfLeftArray2; i++) {
			System.out.println(array[i]+"<"+ pivot + "&&"+array[sizeOfLeftArray2-i]+">"+ pivot);
			if(array[i] > pivot || array[sizeOfLeftArray2-i]< pivot) {
				
				temp = array[i];
			//			System.out.println(temp);
				array[i] = array[sizeOfLeftArray2-i];
			//	System.out.println(array[i]);
				array[sizeOfLeftArray-i] = temp;
			//	System.out.println(array[sizeOfLeftArray-i]);
				
			}
			
		}
		
		
		int midLeftPoint2 = sizeOfLeftArray2/2 ;
		System.out.println("MidLEft Point :" + midLeftPoint2);
		if(array[midLeftPoint2] < pivot) {
			
			temp = array[midLeftPoint2];
			array[midLeftPoint2] =  array[0];
			array[0] = temp;
		}
		System.out.println("Array after Quick sort 4 :" + Arrays.toString(array));
		
		
		
		//Sort Right side
		sizeOfArray = array.length;
		int sizeOfLeftArrayRt = sizeOfArray - midLeftPoint;
		System.out.println("sizeOfLeftArrayRt :"+ sizeOfLeftArrayRt);
		pivot = array[6];
		System.out.println("Pivot 2 :"+pivot);
		
		
		for(int i = 1; i<3; i++) {
			System.out.println(array[6+i]+"<"+ pivot + "&&"+array[9-i]+">"+ pivot);
			if(array[6+i] > pivot || array[9-i]< pivot) {
				
				temp = array[6+i];
						System.out.println(temp);
						array[6+i] = array[9-i];
				System.out.println(array[6+i]);
				array[9-i] = temp;
				System.out.println(array[9-i]);
				
			}
			
		}
		
		System.out.println("Array after Quick sort 5 :" + Arrays.toString(array));
		int midRightPoint2 = 7 ;
		System.out.println("MidLEft Point :" + midLeftPoint2);
		if(array[midRightPoint2] < pivot) {
			
			temp = array[midRightPoint2];
			array[midRightPoint2] =  array[6];
			array[6] = temp;
		}
		System.out.println("Array after Quick sort 5 :" + Arrays.toString(array));
		
		
		
		
	}	
	
/*	
 private static	void QuickSort(int[] array,int start, int end) {
	 
	 if(start < end) {
	 int partitionIndex = partition(array,start,end);
	 QuickSort(array, start , partitionIndex - 1);
	 QuickSort(array , (partitionIndex+1) , end);
	 }	
	}
	
private static	int partition(int[] array,int start, int end) {	
	int pivot = array[end];
	int pIndex = start;
	int temp;
	for(int i = start; i<end;i++) {
		if(array[i]<pivot) {
			
			temp = array[i];
			array[i] = array[pIndex];
			array[pIndex] = temp;
			
			pIndex = pIndex + 1;
			System.out.println(Arrays.toString(array));
		}
	}
	int temp1;
	temp1 = array[pIndex];
	array[pIndex] = array[end];
	array[end] = temp1;
	
	
		return pIndex;
	}*/
	
	
}
