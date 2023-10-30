package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * Write a method that will remove given character from the String?
 * 
 */

public class Q16RemoveCharaterFromString {
	
	
	void RemoveCh(String strText, String strRem) {
		
		String newString = strText.replace(strRem, "");
		System.out.println(newString);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str = reader.nextLine();
		System.out.println("Character need to be removed is :");
		String strRemove = reader.nextLine();
		
		Q16RemoveCharaterFromString removeCharacter = new Q16RemoveCharaterFromString();
		removeCharacter.RemoveCh(str, strRemove);
		
		
		reader.close();
		
	}

}
