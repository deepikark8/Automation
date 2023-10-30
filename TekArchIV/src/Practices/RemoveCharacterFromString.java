package Practices;

public class RemoveCharacterFromString {
	
	public static void main(String[] args) {
		
		String str = "Automation TeEsting";
		String removeStr = "E";
		if(str.contains(removeStr)) {
			str = str.replace(removeStr, "");	
		}
		System.out.println(str);
		
		
	}

}
