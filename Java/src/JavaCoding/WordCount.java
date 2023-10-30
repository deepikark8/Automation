package JavaCoding;

public class WordCount {

	
	public static void main(String[] args) {
		
		String str = "Automation is great";
		
		String[] strArray = str.split(" ");
		
		
		int count =0;
		
		for(int i=0; i<strArray.length;i++) {
			
			count ++;
			
		}
		System.out.println("Word Count : "+ count);
		
	}
}
