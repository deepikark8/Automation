package JavaCoding;

public class RotateArrayIMP {
	
	public static void rotateArray(int[] arr, int k) {
		
		for(int i=0; i<k;i++) {
			int temp = arr[0];
			
			for(int j=0;j<arr.length-1;j++) {
				arr[j]= arr[j+1];
			}
		   arr[arr.length -1]= temp;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		rotateArray(arr,2);
		for(int j=0; j<arr.length;j++) {
		System.out.print(arr[j]+ " ");
		}
		
	}
	

}
