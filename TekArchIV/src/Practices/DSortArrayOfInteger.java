package Practices;
/*
 * Given an array of integers, sort the integer values.
 * 
 */


public class DSortArrayOfInteger {

	
	public static void main(String[] args) {
		
		
		int[] arrInt = {2,5,0,3,1,8,7};
		
		int low = 0;
		int high = arrInt.length - 1;
		int middle = (high - low)/2;
		System.out.println("middle :"+ middle);
		for(int i=0;i<arrInt.length;i++) {
			for(int j=i; j<arrInt.length/2;j++) {
				int temp = 0;
				if(arrInt[low]>arrInt[middle]) {
					temp = arrInt[low];
					arrInt[low] = arrInt[middle];
					arrInt[middle] = temp;	
				}else {
					low = low + 1;	
				}
			}
			
			
		}
		for (int i=0; i<arrInt.length;i++) {
			System.out.println(arrInt[i]+" ");
		}
	}
	
}
