package JavaCoding;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		
		String str = "Automation is good";
		str = str.replaceAll("\\s", "");
		
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			
			count++;
		}
		
		System.out.println("Character count : "+ count);
		
		
		
	}

}
