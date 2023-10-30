import java.util.Scanner;

public class TwoNumbersOperation {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number :");
		int iFirstNum = reader.nextInt();
		System.out.println("Enter Second number :");
		int iSecondNum = reader.nextInt();
	
		System.out.println(iFirstNum + " + "+ iSecondNum + " = " + (iFirstNum + iSecondNum));
		System.out.println(iFirstNum +" - "+ iSecondNum + " = "+ (iFirstNum - iSecondNum));
		System.out.println(iFirstNum + " x " + iSecondNum + " = "+ (iFirstNum * iSecondNum));
		System.out.println(iFirstNum + " / " + iSecondNum +" = "+ (iFirstNum / iSecondNum));
		System.out.println(iFirstNum +" % " +iSecondNum +" = "+(iFirstNum % iSecondNum));
		
		
		
		reader.close();
	}
	
}
/*
 * Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
