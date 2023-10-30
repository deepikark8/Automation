package Practice;

public class PalindromeInteger {

	public static void main(String[] args) {

		int iArray[]= {5,6,4,4,6,5};
		int size = iArray.length;
		int temp = 0;

		for(int i=0;i<iArray.length/2;i++) {

			if(iArray[i] != iArray[size-1-i]) {

				temp = 1;
			}


		}
		if(temp == 1) {
			System.out.println("Its not Palindrome");
		}else {
			System.out.println("Its a Palindrome");
		}



	}
}
