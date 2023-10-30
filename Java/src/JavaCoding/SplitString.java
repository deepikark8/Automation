package JavaCoding;

public class SplitString {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		String[] strArray = str.split("m");
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		
	}
	
}
