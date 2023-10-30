package Assignment;

import java.util.Scanner;

/*
 *
 * Write a Java program that accepts four integer from the user and
 * prints equal if all four are equal,
 * and not equal otherwise.
 *
 */

public class FourIntegerEqualOrNot {


	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first Integer");
		int a = reader.nextInt();
		System.out.println("Enter second Integer");
		int b = reader.nextInt();
		System.out.println("Enter second Integer");
		int c = reader.nextInt();
		System.out.println("Enter second Integer");
		int d = reader.nextInt();


		if(a == b && c == d) {

			if(b == c && a == d) {
				System.out.println("All Four Integers are Equal");
			}else {
				System.out.println("All Integers are not equal");
			}

		}else{

			System.out.println("All Integers are not equal");

		}

		reader.close();
	}
}
