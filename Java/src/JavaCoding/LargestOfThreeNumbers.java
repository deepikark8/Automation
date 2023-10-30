package JavaCoding;

import java.util.Arrays;

public class LargestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		
		int[] iArr = {2,6,7,3,9,19};
		//Arrays.sort(iArr);
		int temp =1 ;
		for(int i=0; i<iArr.length;i++) {
			
			for(int j=i+1;j<iArr.length;j++) {
				
				
				if(iArr[i] > iArr[j]) {
					temp = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = temp;
				}
				
				
				//temp =0;
			}
			
		}
		
		for(int k=iArr.length-3;k<iArr.length;k++) {
			
			System.out.println(iArr[k]);
			
		} 
		
		
		
	}
	

}
