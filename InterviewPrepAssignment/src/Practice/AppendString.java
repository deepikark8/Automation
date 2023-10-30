package Practice;


public class AppendString {
	public static void main(String[] args) {
		
		
		String str = "aabcccccaaa";
		
		StringBuffer sb = new StringBuffer();
		int count =1;
		char prev = str.charAt(0);
		for(int i=1;i<str.length();i++){
			char curr =str.charAt(i); 
			//System.out.println("prev : "+prev+"  "+"curr : "+curr);
			if(prev==curr){
				count++;
			}else{
				sb.append(prev);
				sb.append(count);
				prev = curr;
				count=1;
			}
		}
		sb.append(prev);
		sb.append(count);
		
//		System.out.println("compressed :"+ sb.length());
//		System.out.println("str : "+ str.length());
		
		if(sb.length()>str.length()) {
			
			System.out.println(str);
		}else{
			
			System.out.println(sb.toString());
		}
		
	}
	
	  

}
