package com.Java.Hackathon;
/*
 * 
 * Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, which when added give N.    	
 * INPUT:  N = 9  	OUTPUT:  4 + 5  		      2 + 3+ 4
 * 
 */

import java.util.Scanner;

public class Q24InputPositiveNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = reader.nextInt();
		for(int i=1; i<=num/2;i++) {
			int sum = 0 , x = i;
			String s = "";
			while(sum<num) {
				sum = sum+ x;
				s=s+x+"+";
				x++;
			}
			if(sum == num) {
				System.out.println(s.substring(0, s.length()-1));
			}
		}
		reader.close();
	}
}


