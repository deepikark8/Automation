package Practice;

public class withoutLoopPrintNumbers {
	
	public static void main(String[] args) {
	
		int num=1;
		printNumbers(num);
		
	}
	
	public static void printNumbers(int num) {
		
		if(num<=100) {
			
			System.out.println(num);
			printNumbers(num+1);
		}
		
	}
	

}
