import java.util.Scanner;

public class MultiplyTwoNumbers {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		int iFirstNum = reader.nextInt();
		System.out.println("Enter the second number");
		int iSecondNum = reader.nextInt();
		System.out.println(iFirstNum * iSecondNum);
		
		
		reader.close();
		
	}

}
