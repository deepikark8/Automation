package Feb27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class SumOfTwoNumberInArray {

	 public int[] twoSum(int[] nums, int target) {

	     int size = nums.length;
	     int sum = 0;
	     int[] numArr = new int[2];
	        for(int i=0; i<nums.length-1; i++){
	        	for(int j=nums.length-1; j<0;j--) {
	        		
	        		sum = nums[i]+nums[j];
	  	           System.out.println(i+" =="+j);
	  	         
	  	           if(sum == target){
	  	        	   System.out.println(i+"test"+j);
  	              numArr[i] = i;
  	              numArr[j]=j;
	  	        	   
	  	         //  System.out.println( numArr[i]+","+numArr[j]);
	  	        	 
	  	           return numArr;
	  	        } 
	        	}
	          
	    }
	      return numArr;     
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfTwoNumberInArray obj = new SumOfTwoNumberInArray();
		int[] arr = {3,2,4};
		obj.twoSum(arr,6);
	}

}
