package Practices;
/*
 * write a program to find factorial (Non Recursive)
 * 
 */
public class FactorialNonRecursive {
	
	public static int factorial(int num) {
		
		int fact = 1;
		
		for(int i =1;i<=num;i++) {
			
			fact = fact * i;
		}
		System.out.println("Factorial of "+num + " is "+fact);
		
		return fact;
	}
	

	public static void main(String[] args) {
		factorial(5);
		
	}
}
