package com.day3.practice;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =100;
		System.out.println("The Integer Value is " + n);
		double a = n;
		System.out.println("The Double Value is " + a);
		
		
		
		double abc = 520.8;
		System.out.println("The Double value is " + abc );
		int def = (int) abc;//Type Casting
		System.out.println("The Integer Value after type Casting is " + def);
		
		
		/*
		 * Converting String to Integer in Type Casting
		 */
		
		int z = 100;
		System.out.println("z = "+ z);
		String str = String.valueOf(z);
		System.out.println("str = "+ str);
		
		/*
		 * Convert String to Int
		 */

		String newStr = "10";
		System.out.println("newStr = "+ newStr);
		int y = Integer.parseInt(newStr);
		System.out.println("y = "+ y);
	}

}
