package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java
 * 
 */
public class Q14ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string numbers :" );
		String str = reader.nextLine();
        String[] strArray = str.split(" ");
        System.out.println( str);
		for(int i =1 ; i<strArray.length+1; i++) {
			
			int a = strArray.length-i;
			System.out.print(strArray[a]+" ");
			
		}
		
		
		
		reader.close();
		
		
		
		
		
	}

}
