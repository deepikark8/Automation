package Feb27;

import java.util.ArrayList;

public class PaliandromeRecursiveFn {
	
	void intToArray(int num){
		ArrayList<Integer> al = new ArrayList<>();
	
	    if( num != 0){
	        int temp = num %10;
	        num /= 10;
	        
	        al.add(temp);
	        intToArray(num);
	       
	        
	    }
	    for(int i:al) {
	    	System.out.println(i);
	    }
	    }
	
	public static void main(String[] args) {
		
		PaliandromeRecursiveFn obj = new PaliandromeRecursiveFn();
		obj.intToArray(121);
		String str = "test";
		if(str.equals(str)) {
			
			
			
		}
		 if(str.length() == 1){
	           
	        }
		
		
		
	}

}
