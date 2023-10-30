package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = reader.nextInt();
		System.out.println("Enter the numbers : ");
		
		int[] Arr = new int[size];
		
		for(int i=0; i<size; i++) {
			//System.out.println(Arr[i]);
			Arr[i] = reader.nextInt();
		}
//		Arrays.sort(Arr);
//		System.out.println(Arr[size-2]);
		
		
		//Swap
		int temp =0 ;
		for(int j=0; j<Arr.length;j++) {
			for(int k=0;k<Arr.length;k++) {
				
				
				if(Arr[j]>Arr[k]) {
				
				temp = Arr[j];
				Arr[j] = Arr[k];
				Arr[k] = temp;
				
			}
				
			}
			

			
			
		}
		
		for(int num:Arr) {
			System.out.println(num);
		}
		System.out.println(Arr[1]);
		
		
		reader.close();
		
		
	}

}
