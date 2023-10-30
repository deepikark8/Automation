package Feb27;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindrome {
	
	static char[] strArray;
	
	public static int longestPalSubstr(String str)
    {
        // get length of input String
        int n = str.length();
    
        // All subStrings of length 1
        // are palindromes
        int maxLength = 1, start = 0;
        
         strArray = new char[n];
         char temp = 0;
        // Nested loop to mark start and end index
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;
    
                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++) 
                	
                    if (str.charAt(i + k) != str.charAt(j - k)) {
                    	flag = 0;
                    }else {
                    	strArray[j] = str.charAt(i + k);
                    }
                
                // Palindrome
                if (flag!=0 && (j - i + 1) > maxLength) {
                    start = i;
                    
                    
                    //strArray[i]= temp ;
                    maxLength = j - i + 1;
                }
            }
        }
    
        // return length of LPS
        return maxLength;
    }
    public static void main(String args[]) {
        // Your code goes here
    	
    	Scanner reader = new Scanner(System.in);
    	System.out.println("Enter a string : ");
        String s = reader.nextLine();
        System.out.println(longestPalSubstr(s));
        
        System.out.println("test   : "+Arrays.toString(strArray));
        reader.close();
    }


}
