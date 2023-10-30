package Assignment;

/*
 * How to check if a String contains only digits?
 *
 */

public class DigitInString {

	public static void main(String[] args) {

		String str = "hi34676867test";
		int digitCount =0 ;
		int alphaCount =0;

		for(int i=0; i<str.length();i++) {

			 Boolean flag = Character.isDigit(str.charAt(i));

			 if(flag) {
				 System.out.println("ITs a digit - "+ str.charAt(i));
				 digitCount ++;
			 }else {
				 System.out.println("ITs a letter - "+ str.charAt(i));
				 alphaCount++;
			 }
		}
		System.out.println("Digit Count : "+ digitCount);
		System.out.println("Alpha Count : "+ alphaCount);


	}

}
