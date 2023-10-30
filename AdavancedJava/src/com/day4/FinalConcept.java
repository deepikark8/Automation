package com.day4;

/*
 * Final Variable cannot be reassigned
 * Final can be used for
 * 	1. Variable
 * 	2. Method
 * 	3. Class 
 * Method is final - it cannot be override by child class
 * Class is final - we cannot Inherit - We cannot extend any final class 
 * We can overload the final  - in child class
 * 
 */
public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a = 40;
		//a = 80; we cant reassign final variable
		System.out.println("a :"+ a);
		FinalConcept obj = new FinalConcept();
		 obj.addTwoNumbers(3,4);
		

	}
	
	
	 final void addTwoNumbers(double a , double b){
		  
		 
		  double c =  a + b ;
		  System.out.println("Sum is " + c);
				  
			
			}

}
