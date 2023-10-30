package JavaCoding;
/*
 *   Integer to string 
 *   	- String.valueOf()
 *   	- Integer.toString()
 * 
 * 	String to Integer
 * 		- Interger.parseInt()
 * 		- Integer.valueOf()
 * 
 */

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int num = 121;
		String str = String.valueOf(num);
		String rev = "";
		for(int i=0;i<str.length();i++) {
			
			rev = str.charAt(i)+rev;
			
		}
		
		
		int revNum = Integer.valueOf(rev);
		
		if(revNum == num) {
			System.out.println("It's Palindrome");
		}else {
			System.out.println("It's not Palindrome");
		}
		
	}

}
