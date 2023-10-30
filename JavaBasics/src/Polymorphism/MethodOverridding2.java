package Polymorphism;

public class MethodOverridding2 extends MethodOverridding {
	
	
	public void sum(int a,int b) {
		System.out.println("Sum of two numbers is "+ (a+b));
	}
	
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		MethodOverridding mo = new MethodOverridding2();
		
		mo.sum(a,c);
		
	}

}
