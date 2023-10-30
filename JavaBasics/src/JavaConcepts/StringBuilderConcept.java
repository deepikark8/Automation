package JavaConcepts;

/*
 * building strings from many smaller strings or 
 * appending new characters to an existing string.
 * 
 */

public class StringBuilderConcept {

	
	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Happy");
		sb.append(" ");
		sb.append("Morning");
		String str = sb.toString();
		System.out.println(str);
		
	}
	
}
