package com.Java.Hackathon;
/*
 * 
 * WJP to convert string to int
 */

import java.util.Scanner;

public class Q21StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string");
		
		String str = reader.nextLine();
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		reader.close();
	}

}
