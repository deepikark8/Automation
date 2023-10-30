
public class BasicClass {
	
	int num =10;
	int num2 = 20;
	
	public void sum (int a , int b) {
		
		
		System.out.println(a+b);
	}
	
	
	
	//It gets executed when you run the code
	public static void main(String[] args) {
		
		BasicClass basic = new BasicClass();
		
		//System.out.println(basic.num);
		
		basic.sum(15, 15);
	}

}
