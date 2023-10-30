package Practices;
/*
 * Write a Java Program to swap two numbers using the third variable.
 * 
 */
public class SwapTwoNumbersUsingThirdNumber {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 13;
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
	}
}
