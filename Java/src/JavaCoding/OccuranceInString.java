package JavaCoding;

public class OccuranceInString {
	public static void main(String[] args) {
	
	String str = "Automation12VAAPPLE5765567&#$@";
	char[] ch = str.toCharArray();
	//char ch = str.charAt(i);
	int lowercase =0 ,uppercase=0,number =0, special =0;
	
	for(int i=0;i<str.length();i++) {
	
		
		if(ch[i]>= 'A' && ch[i] <= 'Z'){
			
			System.out.println("Uppercase : "+ ch[i]);
			uppercase++;
		}
		else if(ch[i] >= 'a'&& ch[i] <= 'z') {
			System.out.println("Lowercase : "+ ch[i]);
			lowercase ++;
		}
		else if(ch[i] >='0' && ch[i]<='9') {
			System.out.println("Number  : "+ch[i]);
			number++;
		}else
			special++;
		
	}
	
	System.out.println("Uppercase : "+uppercase);
	System.out.println("LowerCase : "+lowercase);
	System.out.println("Number : "+number);
	System.out.println("Special : "+special);
}
	
	
	
}
