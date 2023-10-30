package Assignment;

import java.util.Scanner;

/*
 *
 *
 * Write a Java program that accepts two "double" variables and
 * test if both strictly between 0 and 10 and false otherwise.
 */
public class AcceptDoubleVariable {

	public static void main(String[] args) {


		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a double variable");
		double a = reader.nextDouble();

		if(a > 0 && a < 10) {
			System.out.println("Its a double variable between 0 & 10");
		}else {
			System.out.println("It's not a double variable between 0 & 10");
		}

		System.out.println("Enter a double variable");
		double b = reader.nextDouble();

		if(b > 0 && b < 10) {
			System.out.println("Its a double variable between 0 & 10");
		}else {
			System.out.println("It's not a double variable between 0 & 10");
		}


		reader.close();

	}

}
