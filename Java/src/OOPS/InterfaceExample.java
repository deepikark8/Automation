package OOPS;
/*
 * 
 * Interface has only method declaration and not method implementation 
 * 	- All methods  are public abstract
 * 	- All variables in interface are public static final
 * 	- Classes can implement interface and not extends
 * 	- class which implements the interface should provide the all methods in interface
 * 
 * 
 */
public abstract interface InterfaceExample {
	
	public abstract void add();
	public abstract void subtract();

}
public class Test implements InterfaceExample{

	//@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}
	
}
