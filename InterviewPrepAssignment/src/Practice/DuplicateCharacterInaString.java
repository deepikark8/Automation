package Practice;

public class DuplicateCharacterInaString {

	public static void main(String[] args) {

		 String str = "testingtsdss";
	       char ch[] = str.toCharArray();

	       for(int i=0;i<str.length();i++){

	           int count = 1;
	           if(ch[i] == '0'){
	               continue;
	           }

	           for(int j=i+1;j<str.length();j++){

	               if(ch[i] == ch[j]){
	                   count++;
	                   ch[j]='0';

	               }


	           }
	           if(count >1){
	           System.out.println(ch[i]+"="+count);
	           }
	       }

	}
}
