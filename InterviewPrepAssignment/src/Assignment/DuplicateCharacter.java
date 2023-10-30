package Assignment;

import java.util.HashMap;

public class DuplicateCharacter {

	public static void main(String[] args) {

		/*String str = "great testing";
		char ch[] = str.toCharArray();

		for(int i=0; i<str.length();i++){
			int count = 1;
			for(int j=i+1; j<str.length();j++){
				if(ch[i] == ch[j] && ch[i] != ' '){
				count ++;
				ch[j] = '0' ;//ch[j] to 0 to avoid calculating visited characters.
				}
			}

			if(count > 1 && ch[i] != '0'){
			System.out.println("String : "+ ch[i]+ " Count : "+count);
			}


		}*/



		//Hash Map
		String str = "great testing";
		char chArray[] = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();

		for(char c:chArray) {

			if(hm.containsKey(c)) {

				hm.put(c,hm.get(c)+1);

			}else {
				hm.put(c,1);
			}

		}
		System.out.println("HashMap: " + hm);




	/*

			  String str = "great testing";
			  int cnt = 0;
			  char[] inp = str.toCharArray();
			  System.out.println("Duplicate Characters are:");
			  for (int i = 0; i < str.length(); i++) {
			   for (int j = i + 1; j < str.length(); j++) {
			    if (inp[i] == inp[j]) {
			     System.out.println(inp[j]);
			     cnt++;
			     break;
			    }
			   }
			  }
			System.out.println("Count : "+ cnt);


		*/



			String str1 = "testingsetigt6bnb";
		       char ch[] = str1.toCharArray();

		       for(int i=0; i< str1.length();i++){
		          int count1 = 1;

		          if(ch[i] == '0') {
	           	   continue;//It breaks one iteration and continues with next iteration of the loop
	              }
		           for(int j=i+1; j<str1.length();j++){
		        	   if(ch[i] == ch[j]){
		            	   count1++;
		            	   ch[j] ='0';

		                }


		           }
		           if(count1 > 1) {
		        	   System.out.println(ch[i]);
		           }

		}




	}
}
