package Practice;

import java.util.Scanner;

public class CountWordChar {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = reader.nextLine();
		String[] strArr = str.split(" ");
		
		for(String str1:strArr) {
			System.out.println(str1);
		}
		System.out.println("Count of word : "+ strArr.length);
		
//		for(int i=0; i<strArr.length;i++) {
//			System.out.println(strArr[i]);
//		}
		
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.println(ch[i]);
		}
		System.out.println("Count of Character : "+ch.length);
		reader.close();
		
	}

}
