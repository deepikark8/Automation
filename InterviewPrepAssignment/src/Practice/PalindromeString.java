package Practice;

public class PalindromeString {

	public static void main(String[] args) {

		 String str = "mom";
		    char ch[] = str.toCharArray();
		    int size = str.length();
		    int temp = 0;
		    for(int i=0;i<str.length()/2;i++){

		        if(ch[i] != ch[size-1-i]){
		            temp = 1;
		        }

		    }

		    if(temp == 1){
		        System.out.println("Its not a Palindrome");
		    }else{
		        System.out.println("Its  a Palindrome");
		    }





	}

}
