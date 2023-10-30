package Polymorphism;

public class OverloadingCompileTimeError {
	
	//System.out.println(Sum.add(11,11));//ambiguity
	
	public static void main(String[] args) {
		
		Sum sum = new Sum();
		System.out.println(sum.add(11, 11));
		
	} 
	

}

class Sum{
	
	//static method cannot be overridden 
	public int add(int a , int b) {
		
		int c = a+b;
		
		return c;
		
	}
	
	public double add(int a, int b) {
		
		double c = a+b;
		return c;
	}
	
	
}