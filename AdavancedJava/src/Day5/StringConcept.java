package Day5;

/*
 * 
 * String is a non-primitive data type
 * String is a class
 * 
 * 
 * 
 */

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Literal way
		
		String sName = "Deepika";
		System.out.println(sName);
		String sLastName = "Ramkumar";
		System.out.println(sName.concat(sLastName));
		System.out.println(sName);
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1==s2);
		
		// Object way of creating String
		
		String str = new String("Java"); 
		String str1 = new String("Java");
		System.out.println(str.equals(str1));
		
		String newStr = "I like to learn Java";
		newStr = "testingggg";
		System.out.println(newStr);
		System.out.println(newStr.charAt(2));
		/*System.out.println(newStr.isEmpty());
		System.out.println(newStr.toUpperCase());
		System.out.println(newStr.toLowerCase());
		
		System.out.println(newStr.indexOf("v"));
		System.out.println(newStr.replace("Java", "Python"));
		System.out.println(newStr.endsWith("like"));
		System.out.println(newStr.substring(2, 18));
		System.out.println(newStr.length());
		
		
		String[] sArray =  newStr.split(" ");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		
		//To make String mutable
		StringBuffer buffer = new StringBuffer("Hi");
		System.out.println(newStr);
		buffer.append(newStr);
		buffer.append("Test");
		System.out.println(buffer);
		
		//To make String mutable
		StringBuilder builder = new StringBuilder("Have a great day");
		builder.indexOf(newStr, 8);
		builder.append(newStr);
		System.out.println(builder);
		*/
		
		
	}

}
