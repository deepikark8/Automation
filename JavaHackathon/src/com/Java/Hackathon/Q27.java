package com.Java.Hackathon;
import java.util.Arrays;
import java.util.Random;

public class Q27 {
	  public static void main(String[] args) {
	    Random rand = new Random();
	    int[] numbers = {51,95,66,72,42,38,39,41,15};



	    System.out.println("Before:"+Arrays.toString(numbers));
	    

	    quicksort(numbers);

	    System.out.println("\nAfter:"+Arrays.toString(numbers));
	   
	  }

	  private static void quicksort(int[] array) {
	    quicksort(array, 0, array.length - 1);
	    
	  }

	  private static void quicksort(int[] array, int lowIndex, int highIndex) {

	    if (lowIndex >= highIndex) {
	      return;
	    }
	    //rn.nextInt(maxValue - minValue + 1)
	    int pivotIndex = 4;//  new Random().nextInt(highIndex - lowIndex) + lowIndex;// (8-0)+0 // select random number within 8
	    System.out.println("pivotIndex : "+ pivotIndex);
	    
	    int pivot = array[pivotIndex];//assigning value to pivot
	    
	   
	    
	    swap(array, pivotIndex, highIndex);
	  
	    int leftPointer = partition(array, lowIndex, highIndex, pivot);//array,0,8,42

	    quicksort(array, lowIndex, leftPointer - 1);
	    quicksort(array, leftPointer + 1, highIndex);

	  }

	  private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
	    int leftPointer = lowIndex;//0
	    int rightPointer = highIndex - 1;//8-1 = 7
	    
 
	    while (leftPointer < rightPointer) {//0 < 7 
	      // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
	      while (array[leftPointer] <= pivot && leftPointer < rightPointer) { //a[0] <= p && 0 < 7 then leftPointer++ = 1
	        leftPointer++; // 1
	      }

	      // Walk from the right until we find a number less than the pivot, or hit the left pointer.
	      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
	        rightPointer--;
	      }

	      swap(array, leftPointer, rightPointer);//
	    }
	    
	    
	    if(array[leftPointer] > array[highIndex]) { // a[0] > a[7] // 51 > 15
	      swap(array, leftPointer, highIndex); 
	      System.out.println("left pointer  : " +leftPointer );
	    }
	    else {
	      leftPointer = highIndex;
	    }
	    
	    return leftPointer;//
	  }

	  private static void swap(int[] array, int index1, int index2) {
		  System.out.println("index1  :" + index1);//pivotIndex
		  System.out.println("index2  :" + index2);//highIndex
	    int temp = array[index1];
	    array[index1] = array[index2];
	    array[index2] = temp;
	    System.out.println("Array after swap :"+Arrays.toString(array));
	  }

	 

}
