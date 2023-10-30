package Practice;

import java.util.Scanner;

public class AplhaNum {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a character");
		
		char c = reader.nextLine().charAt(0);
		
		if(Character.isDigit(c)) {
			
			System.out.println("It's a Number");
		}else {
			System.out.println("It's a String");
		}
		
		
		
		reader.close();
		
	}

}
