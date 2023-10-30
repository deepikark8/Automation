package Practices;
/*
 * 
 * Consider there is a 3 Boolean variable called a, b, c. Check if at least
two out of three Booleans are true
 * 
 */

public class Boolean {
	
	
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = true;
		boolean c = false;
		
	/*	if(a == true) {
			
			if(b == true) {
			System.out.println("A & B are true");
			}else if(c == true){
				System.out.println("A & C are true");
			}
		}if(b == true) {
			if(a == true) {
				System.out.println("A & B are true");
				}else if(c == true){
					System.out.println("A & C are true");
				}
		}else {
			System.out.println("Two Booleans area not true");
		}
		*/
		if((a&&b)||(b&&c)||(c&&a)){
			System.out.println("Two values are true");
		}else {
			System.out.println("Two values are not true");
		}
		
		
		
	}

}
