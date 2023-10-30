package Practice;
/*
 * 
 * input [1,2,3,4,5,6,7]
1234567

3=3
The back 3 elements should come first
5671234
 * 
 * 
 * 
 * input [1,2,3,4,5,6,7]

output [5,6,7,1,2,3,4]

int key = 3;
 * 
 * 
 */
public class SortingArray {
	
	public static void main(String[] args) {
		
		int[] arrInt = {1,2,3, 4,5, 6,7};
		int tempArr[] = new int[arrInt.length]; ;
		int k =3;
		int m =0 ;
		
		for(int i=k+1;i<arrInt.length;i++) {
			tempArr[m] = arrInt[i];
			m++;
		}
		
		for(int x=0;x<arrInt.length-k;x++) {
			tempArr[m] = arrInt[x];
			m++;
		}
		
		for(int j=0;j<tempArr.length;j++) {
		
		System.out.println(tempArr[j]);
		}
	}

}
