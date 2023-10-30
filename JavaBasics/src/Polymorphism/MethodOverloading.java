package Polymorphism;

//Method Overloading

public class MethodOverloading {

	public static void sum(int a, int b) {
		System.out.println("Sum of two numbers is "+(a+b));
	}
	
	public static void sum(int a, int b, int c) {
		
		System.out.println("Sum of three numbers is "+ (a+b+c));
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		sum(a,b);
		sum(a,b,c);
		
	}
	
	
}
