package com.Java.Hackathon;
/*
 * 
 * Q23 WJP to differentiate input as string, int or bool
 * 
 * 
 */

import java.util.Scanner;

public class Q23DifffInputBoolStrInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);	
		System.out.println("Enter an input");
			if(reader.hasNextInt()){	
				System.out.println("Entered input is integer");
			}else if(reader.hasNextBoolean()){
				System.out.println("Entered input is Boolean");
			}else {
			System.out.println("Entered input is String");
			}
		reader.close();
	}
}
