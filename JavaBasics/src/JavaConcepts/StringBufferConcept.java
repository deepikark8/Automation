package JavaConcepts;

/*
 * A string buffer is like a String, but can be modified.
 * StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
 * That's why StringBuilder is faster than StringBuffer
 * 
 */

public class StringBufferConcept {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Good");
		sb.append(" ");
		sb.append("Morning!");
		
		String str = sb.toString();
		System.out.println(str);
		
	}

}
