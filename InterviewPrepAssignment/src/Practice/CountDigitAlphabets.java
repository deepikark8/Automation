package Practice;
/*
 * 
 * Write a Java class. Create a method in this class that takes a List of strings as the only  argument.   Each string in this list will be a single word containing either alphabets   a through z or digits 0 through 9 (for example, “abcd”, “Pune”, “623”, “Mumbai”, “10”, etc. The  method should print on standard output 2 numbers:   a. How many strings in the input array are numbers   b. How many strings in the input array are non-numeric.
 */

public class CountDigitAlphabets {
	
	public static void main(String[] args) {
		 String[] strArr = {"abcghytd","124563","pune","4564646","5675765","57657856876","fhhfututguy"};
	        
		// findTheCharCountInText(strArr);
		 //findTheStringCount(strArr);
		 findTheStringCount(strArr);
		 
	}
	 
	public static void findTheCharCountInText(String[] test){
        int count = 0;
        for(String str: test){
        
            char[] ch = str.toCharArray();
            
            for(char c:ch){
                if(Character.isDigit(c)){
                   count++;
                }else{
                    count++;
                }
            }
             System.out.println("Count : "+count);
             count = 0;
            }   
        }
	
	public static void findTheStringCount(String[] text) {
		
		int digiCount = 0 ;
		//String strText = text;
		int stringCount = 0;
		for(String str: text) {
			
			System.out.println(str);
		
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isDigit(ch[i])) {
				digiCount ++;
				break;
			}else {
				stringCount++;
				
				break;
			}
			
		}
		
		
		}
		System.out.println("Numbers in String Array are: "+digiCount);
		System.out.println("Non-Numeric String in Array are : "+ stringCount);
		
	}
	
}
