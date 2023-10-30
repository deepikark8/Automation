package Day6.AbstractConcept;

/*
 * Abstract class should have a keyword abstract
 * It contains abstract method and non abstract method
 * 
 * 100% Abstraction - in the class all the method are implemented - in the interface all the methods are implemented 
 * 100% Abstraction = Interface
 * 
 * 
 */

abstract class AbstractConcept {
	
	abstract void method3();
	
	abstract void method1(); // Abstract Method or unimplemented method
	 void method2() { 
		// this is a normal method or implemented method or Concrete method
		 
	 } 
	 
	 AbstractConcept() {
		 //Abstract class can have Constructor
	}
	
	 public void method4() {
	}
	 
	 protected void method5() {
		 
	 }
	 
	 private void method6(){
		 
	 }
	 
	 void method7() {
		 
	 }
	 
	 final void method8() {
		 
	 }
	 
	 public static void main(String[] args) {
		
	}
	 
	 
	 

}
