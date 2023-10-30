package com.Java.Hackathon;

import java.util.Scanner;

/*
 * 
 * WJP to convert int to string
 * 
 */

public class Q22ConvertIntToStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = reader.nextInt();
        
        //Method 1
		String str = String.valueOf(num);
		System.out.println(str);
		
		//Method 2
		System.out.println(Integer.toString(num));
		
		//Method 3 
		num = Integer.parseInt(str);
		System.out.println(num);
		
		//Method 4 - StringBuffer
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(num);
		String str4 = strBuff.toString();
		System.out.println(str4);
		
		//Method 5 - StringBuilder
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(num);
		String str5 = strBuilder.toString();
		System.out.println(str5);
		
		String str55 = new StringBuilder().append(num).toString();
		
		System.out.println(str55);
		
		
		//Method 6 - concat
		String str6 = ""+num;
		System.out.println(str6);
		
		//Method 7 - Boxing
		Integer obj = new Integer(num);
		String str7 = obj.toString();
		System.out.println(str7);
		
		
		reader.close();
		
	}

}
