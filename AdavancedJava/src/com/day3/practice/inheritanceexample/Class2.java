package com.day3.practice.inheritanceexample;


/*
 * Overriding - having same method in same class doing something different
 * Overloading - we loaded the method with different parameters
 * 
 * 
 */

public class Class2 extends Class1{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class2 class2 = new Class2();
		
		//class2.addTwoNumbers(2,3);
		
		class2.addTwoNumbers(20.0, 30.0);
		

	}
	
	// this is method overriding - do something different
	//Example : Child will always override what parent said...
	 public void addTwoNumbers(double a , double b){
		  
		
		  double c =  a + b + 100.0 ;
		  System.out.println("Sum is " + c);
				  
			
			}
	 
	 
	 public void addTwoNumbers(int a , int b){
		  
			
		  int c =  a + b +10 ;
		  System.out.println("Sum is " + c);
				  
			
			}
	 
	 
	 public void addTwoNumbers(int a , int b , String s){
		  
			
		  int c =  a + b  +10 ;
		  System.out.println("Sum is " + c);
				  
			
			}
	

}
