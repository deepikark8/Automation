package JavaCoding;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String str = "malayalam123";
		char[] ch = str.toCharArray();
		String reverse ="";
//		for(int i =ch.length-1; i>=0;i--) {
//			
//		reverse = reverse+ch[i];	
//			
//			
//		}
		
		for(int i=0;i<=str.length()-1;i++) {
			
			reverse=str.charAt(i)+reverse;
		}
		
		System.out.println(reverse);
	
		if(reverse.equals(str)) {
			System.out.println("It's Palindrome");
		}else {
			System.out.println("Its not Palindrome");
		}
		
	}
	
	
	
	
}
