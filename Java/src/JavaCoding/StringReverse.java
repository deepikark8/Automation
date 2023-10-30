package JavaCoding;

public class StringReverse {
	
	
	public static void main(String[] args) {
		
		String str = "Welcome";
		char[] ch = str.toCharArray();
		StringBuilder revStr = new StringBuilder();
		
		for(int i=ch.length-1; i>=0; i--) {
			
			revStr.append(ch[i]);
			
			
		}
		System.out.println(revStr);
		
	}

}
