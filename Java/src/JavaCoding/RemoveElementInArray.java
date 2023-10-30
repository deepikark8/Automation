package JavaCoding;

public class RemoveElementInArray {

	public static int removeElement(int[] nums, int val) {
        int[] newNums = new int[nums.length];
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){
            	System.out.println("nums[i] = "+nums[i]);
                newNums[i]=nums[i];
                
            }

        }

    StringBuilder s = new StringBuilder();
    for(int i:newNums){
    	if(i != 0) {
    	System.out.println("i : "+i);
        s.append(i);
    	}
    }

    return Integer.parseInt(s.toString());
    }
public static void main(String[] args){
    int[] nums = {3,2,2,3};
    int value = 3;
    System.out.println(removeElement(nums,value));
}
	
}
