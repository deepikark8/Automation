package Practice;

/*
 * 
 * program print only number 

String str="adbx123"; 

output-123 
 * 
 */

public class PrintNumberInString {
	
	public static void main(String[] args) {
		
		String str = "adbx123";
		char[] ch = str.toCharArray();
		
		for(int i =0; i<ch.length;i++) {
			
			
			
			if(Character.isDigit(ch[i])) {
				System.out.print(ch[i]);
			}
			
		}
		
		
	}

}
