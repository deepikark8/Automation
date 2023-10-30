package com.Java.Hackathon;

//import java.util.Scanner;

/*
 * 
 * Q29 WJP to perform Merge sort using recursion 
 * 
 */

public class Q29MergeSortUsingRecursion {
	
	void merge(int arr[], int first, int middle, int last) {
		
		int n1 = middle-1+1;
		//System.out.println("n1"+n1);
		int n2 = last-middle;
		//System.out.println("n2"+n2);
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1;++i) {
			
			L[i]= arr[i+1];
			System.out.println("Left"+ L[i]);
		}
		for(int j=0;j<n2;j++) {
			R[j] = arr[middle+j+1];
			System.out.println("Right"+R[j]);
		}
		
		
		
	}
	
	void sort(int arr[], int first , int last) {
		
		int[] firstArr = new int[last];
		for(int i =0 ; i<last/2; i++){	
			firstArr[i] = arr[(last/2)-i-1];
			System.out.println("First Array Elelment"+firstArr[i]);
		}
	}
	
	void printArray(int arr[]) {
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number of elments:");
//		int num =  scanner.nextInt();
//		int[] iArray = new int[num];
		
		int[] iArray = {70,50,30,10,20,40,60};
		int num =  iArray.length;
		System.out.println("Enter " + num + " integers");	
//		for(int i =0;i<num;i++) {
//			iArray[i]=scanner.nextInt();
//			}
		
		System.out.println("Array of Integers before Sorting");
		for(int n=0; n<=iArray.length-1; n++) {
			System.out.println(iArray[n]);
		}
		
		
		Q29MergeSortUsingRecursion obj = new Q29MergeSortUsingRecursion();
		//num - size of array
		obj.sort(iArray, 0, num-1);
		
		
	}
}
