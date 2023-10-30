package JavaCoding;

public class LongestPalindromeSubstring {
	
	public static void main(String[] args) {
		
		String str = "ccc";//"babad";
		char[] ch = str.toCharArray();
		int length = str.length()-1;
		String rev = "";
		
		for(int i=0;i<str.length()-1/2;i++) {

		System.out.println("ch[i] : "+ch[i]);
		System.out.println("ch[len -i ]"+ch[length-i]);
			if(ch[i] == ch[length-i]) {
//				if(str.length()==3) {
//					rev= String.valueOf(ch[length-i]);
//				}
				rev = rev+ch[i];
			}
			else if(str.length()<=2) {
				rev = String.valueOf(ch[i]);
				break;
			}
			
		}
		
		System.out.println("Rev : "+rev);
		
		
		
	}

}
