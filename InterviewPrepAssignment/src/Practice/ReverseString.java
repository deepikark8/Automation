package Practice;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "Java123";
		char ch[] = str.toCharArray();
		String revStr = "";
		for(int i=ch.length-1; i>=0;i--) {
			
			revStr = revStr + ch[i];
			
			
		}
	
		System.out.println(revStr);
	}
	
	
}
