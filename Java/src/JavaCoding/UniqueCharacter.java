package JavaCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacter {
	
	public static void main(String[] args) {
		
		
		String str = "testinnggsss";
		
		Map<Character,Integer> hm = new HashMap<Character, Integer>();
		int count = 1;
		
		for(int i=0;i<str.length();i++) {
			
			if(hm.containsKey(str.charAt(i))) {
				
				int icount = hm.get(str.charAt(i));
				hm.put(str.charAt(i), icount+1);
				
			}else {
				hm.put(str.charAt(i), count);
				
			}
			
			
		}
		System.out.println(hm);
		
		
		 List< Character > keys = new ArrayList< Character >();

	        Integer value = 1;

	        for ( Character key : hm.keySet() )
	        {
	            if ( hm.get( key ).equals( value ) )
	            {
	                keys.add(key);
	            }
	        }

	        System.out.println( value + " has been found in the following keys: " + keys );
		
		
		
		
	}

}
