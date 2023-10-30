package Feb27;


/*
 * 
 * 1. Find the second largest in an ARRAY?
 * 
 */
public class SecondLargestNum {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,5,2,6};

		int firstLargest = 0;
		int secondLargest = 0;
		
		for(int i=0; i<arr.length;i++) {

		if(arr[i]>firstLargest) {
			
			
			secondLargest = firstLargest;
			firstLargest = arr[i];
			
			
		}
		
		}
			
			

		System.out.println(firstLargest+ " " + secondLargest);
		
		
		
		
	}
}
