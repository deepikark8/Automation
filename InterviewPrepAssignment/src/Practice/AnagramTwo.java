package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramTwo {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] chA = a.toCharArray();
        //HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int count =1;
        
      for(int i=0; i<a.length();i++){
    	
    	  
    	  for(int j=1; j<a.length();j++) {
    		  System.out.println("ch[i] "+ chA[i]);
    		  System.out.println("ch[j] "+ chA[j]);
    		 
    		  if(chA[i] == chA[j]) {
    			  System.out.println("test "+ chA[i]);
    			  //hm.put(count++,chA[i]);
    			  hm.put(chA[i],count++);
    		  }
    	  }
    	 // break;
    	  
      }  
      
     // for(char newa: hm){
          System.out.println(hm);
      //}  
        return true;
    }

    public static void main(String[] args) {
    
        //Scanner scan = new Scanner(System.in);
        String a = "anagram"; //scan.next(); //
        String b = "margana"; //scan.next(); //
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	

}
