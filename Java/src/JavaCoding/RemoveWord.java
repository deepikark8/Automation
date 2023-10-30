package JavaCoding;

public class RemoveWord {
	
	public static void main(String[] args) {
		
		
		String str = "Today is a good bad day";
		String newStr = str.replaceAll("bad","");
		System.out.println(newStr);
		
	}

}
