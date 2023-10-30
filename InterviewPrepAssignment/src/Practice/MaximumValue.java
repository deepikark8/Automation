package Practice;


/*
 * 
 * Write a function solution that, given an integer N, returns the maximum possible value obtainable by deleting one '5' digit from the decimal representation of N. It is guaranteed that N will contain at least one '5' digit. 
Examples: 
1. Given N = 15958, the function should return 1958. 
2. Given N = -5859, the function should return -589. 
3. Given N = -5000, the function should return 0. After deleting the '5, 
the only digits in the number are zeroes, so its value is 0.
 * 
 * 
 */


public class MaximumValue {
	
	public static void main(String[] args) {
		
		int a = 15351;
		char[] iArr = String.valueOf(a).toCharArray();
		int count = 0;
		char[] copyArr = new char[iArr.length];
		for(int i=0; i<iArr.length;i++) {	
			
			//System.out.println(iArr[i]);
			
		if(a > 1) {
			
				if(iArr[i] == '5'&& count == 0) {
					count = 1;
				}else {
					copyArr[i] = iArr[i];
				}
			}else {
				
				
				if(iArr[i] == '5' && count > 2) {
					
				}else{
					
					copyArr[i] = iArr[i];
					count ++;
				}
				
			}
		}
		System.out.println(copyArr);
		
	}

}
