package com.day4;

public class FinallyConcept {

	public static void main(String[] args) {
		
	try {
		int a = 40;
		int b = 0;
		int c = a/b;
		System.out.println("C : "+ c);
	}catch(Exception e) {
		System.out.println("Exception : "+ e);
	}finally {
		System.out.println("Finally print this Stataement ");
	}
	
	System.out.println("I have some code to exceute");
}
	
}
