package Feb27;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        
		 
		String str = String.valueOf(x);
		int n = str.length();
		
		for(int i=0; i<n/2;i++) {
			if(str.charAt(i) != str.charAt(n-1-i)) {
				System.out.println("No its not plaindrome");
				
				return false;
			}
		}
		System.out.println("yes its plaindrome");
	        return true;   
	        
	    }
    public static void main(String[] args){
    //System.out.println("testing");
    	PalindromeNumber obj = new PalindromeNumber();
    	obj.isPalindrome(10);
    }

}
