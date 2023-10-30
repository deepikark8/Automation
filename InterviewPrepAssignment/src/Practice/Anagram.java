package Practice;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
		
		String str1 = "LISTEN";
		String str2 = "SILENT";
				
		
		anagram(str1,str2);
				
	}
	
	public static void anagram(String str1, String str2) {
		
		boolean status = true;
		
		if(str1.length() == str2.length()) {
			
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
		
			Arrays.sort(ch2);
			
			status= Arrays.equals(ch1,ch2);
			
			
			if(status) {
				System.out.println("Its Anagram");
			}else {
				System.out.println("Its not Anagram");
			}
			
		}else {
			System.out.println("Its not Anagram");
		}
		
		
		
		
		
		//return str2;
		
		
	}
	
}
