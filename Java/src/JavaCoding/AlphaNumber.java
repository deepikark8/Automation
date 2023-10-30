package JavaCoding;

//converting the number n to a string  
//String str = Integer.toString(n);  

import java.util.Scanner;

public class AlphaNumber {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the text : ");
		char c= reader.nextLine().charAt(0);
		
		if(Character.isDigit(c)) {
			System.out.println("It's a number");
		}else {
			System.out.println("It's a String");
		}
		
		reader.close();
	}

}
