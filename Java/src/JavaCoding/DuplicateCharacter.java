package JavaCoding;

public class DuplicateCharacter {
	
	public static void main(String[] args) {
		
		String str = "moqweme";
		char[] ch = str.toCharArray();
		
		System.out.print("Duplicate Characters in above string are: ");
		
		for(int i=0; i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(ch[i] == ch[j]) {
					System.out.print(ch[i]+ " ");
					break;
				}
			}
			
		}
		
		
	}

}
