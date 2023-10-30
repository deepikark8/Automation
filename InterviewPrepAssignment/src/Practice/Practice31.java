package Practice;

// i/p: "ilovecoding"
//o/p 1
//i/p: "aabb"
//O/p : -1

public class Practice31 {

	
	public static void main(String[] args) {
		
		
		
		String str = "aabb";
		char[] ch = str.toCharArray();
		
		for(int i =0; i<str.length();i++) {
			
			for(int j =1;j<str.length();j++) {
				
				if(ch[i]!=ch[j]) {
					System.out.println("Non repeating character : "+ ch[j]);
					break;
				}else {
					System.out.println("-1");
				}
				
			}
			break;
		}
		
	}
	
}
