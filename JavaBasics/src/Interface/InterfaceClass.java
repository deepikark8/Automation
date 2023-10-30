package Interface;

public class InterfaceClass implements InterfaceTwo {

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
		System.out.println("Method One");
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
		System.out.println("Method Two");
		
	}
	
	public static void main(String[] args) {
		
		
		InterfaceTwo obj = new InterfaceClass();
		obj.methodOne();
		obj.methodTwo();
		
	}

}
