package Practice;

public class PalindromeStrNewMethod {

	public static void main(String[] args) {
		
		String str = "moyuiym";
		String newStr = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr+str.charAt(i);
			
		}
		System.out.println("New Str : "+ newStr);
		
		if(str.equalsIgnoreCase(newStr)) {
			System.out.println("Its a Palindrome");
		}else {
			System.out.println("Its not a Palindrome");
		}
		
	}
	
}
