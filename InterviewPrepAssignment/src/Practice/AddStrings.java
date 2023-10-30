package Practice;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String str = "<<>>";
	       char[] ch1 = str.toCharArray();
	       String str2 = "WooHoo";//yay
	       
	      char[] ch2 = str2.toCharArray();
	       int strCount = str.length() + str2.length();
	        char[] ch3 = new char[strCount];
	        
	       //System.out.println("Count : "+ strCount);
	       //System.out.println("Length : "+ str.length() );
	        for(int i=0; i<str.length()/2;i++){
	            //System.out.println(ch1[i]);
	            ch3[i] = ch1[i];
	        }
	        for(int j=0;j<ch2.length;j++){
	            ch3[j+2] = ch2[j];
	        }
	        
	        for(int k=str.length()-1;k>=ch1.length-2;k--){
	        
	            ch3[strCount-k+1] = ch1[k];
	        }
	        for(int l=0;l<strCount;l++){
	            
	           System.out.print(ch3[l]);
	        }
	        

	}

}
