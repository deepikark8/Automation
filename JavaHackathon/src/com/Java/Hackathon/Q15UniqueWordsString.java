package com.Java.Hackathon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 
 * Given a string print the unique words of the string.
 * 
 */

public class Q15UniqueWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubmain
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = reader.nextLine();
        String[] words = str.split(" ");
        
        
        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
		
		for(String s:uniqueWords)
			System.out.println(s);
		
        reader.close();
	}

}
