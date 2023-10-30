package Practices;
/*
 * 
 *  Write a Java Program to reverse a string without using String inbuilt function.
 * 
 */
public class ReverseString {

	public static void main(String[] args) {
		
		String strText = "Best of luck";
		String reversedStr = "";
		
		for(int i =0; i<strText.length(); i++) {
			reversedStr = strText.charAt(i) + reversedStr;
		}
		
		System.out.println("reversedStr : "+ reversedStr);
		
		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2.reverse();
		System.out.println(str2);
		
		
	}
	
}
