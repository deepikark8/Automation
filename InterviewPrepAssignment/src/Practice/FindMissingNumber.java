package Practice;

//qn: In list of numbers(1-100), 
//there are some numbers missingHow do you find the missed numbers

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		
		int[] iArr= {0,1,2,4,5,7,8,9,11,12,13,14,16};
		int count = 17;
		int n =0;
		for(int i=0;i< count;i++) {
			
			 n=i;
			System.out.println("n : "+n + " iArr[i] : "+ iArr[i]);
			
			//System.out.println("Arr : "+ iArr[i]);
			
			if(n != iArr[i]) {
				System.out.println("It's not equal : "+ n);
				break;
			}
			
			
			
		}
		
	}

}
