package JavaCoding;

public class ReverseInteger {
	
	public static int reverse(int x) {
	       
		String str = Integer.toString(x);
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			result = str.charAt(i)+result;
			
		}
		System.out.println(result);
        int iResult = Integer.valueOf(result);
        return iResult;
    }

    public static void main(String[] args){
        reverse(123);

    }

}
