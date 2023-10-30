package ConstructorConcept;

/*
 * 
 * Q #5) What do you mean by Constructor?

Answer: Constructors can be explained in detail with enlisted points:

When a new object is created in a program a constructor gets invoked corresponding to the class.
The constructor is a method which has the same name as the class name.
If a user doesn’t create a constructor implicitly a default constructor will be created.
The constructor can be overloaded.
If the user created a constructor with a parameter then he should create another constructor explicitly without a parameter.
 * 
 */

public class Class1 {
	
	public Class1() {
		
	}
	
	public Class1(String a) {
		System.out.println("test");
	}

}
