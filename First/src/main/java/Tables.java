import java.util.Scanner;

public class Tables {
public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int iNum = reader.nextInt();
	for(int i=0; i<10;i++) {
		
		int result = iNum * (i+1);
		System.out.println(iNum +" x "+(i+1) + " = "+ result);
		
		
	}
	
	
	reader.close();
}
}
