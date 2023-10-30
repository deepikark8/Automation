package Practice;
/*
 * 
 * Rotate array (1,2,3, 4,5, 6,7)
k=3
(5,6,7,1,2,3,4)
 * 
 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
