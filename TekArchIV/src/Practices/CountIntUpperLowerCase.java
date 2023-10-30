package Practices;

public class CountIntUpperLowerCase {

	public static void main(String[] args) {
		
		String str = "testing IN AUTomation 13535";
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int numCount = 0;
		
		for(int i =0;i<str.length();i++) {
			
			if(Character.isUpperCase(str.charAt(i))) {
				upperCaseCount++;
				
			}else if(Character.isLowerCase(str.charAt(i))) {
				lowerCaseCount++;
			}else if(Character.isDigit(str.charAt(i))) {
				numCount++;
			}
			
		}
		System.out.println("Upper case :"+ upperCaseCount);
		System.out.println("Lower case :"+lowerCaseCount);
		System.out.println("Number :"+numCount);
		
	}
}
