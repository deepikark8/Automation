package Assignment;

/*
 *  How to count a number of vowels and consonants in a String?
 *
 */

public class VowelsAndConsonants {

	public static void main(String[] args) {

		String str = "testing";
		char[] ch = str.toCharArray();
		int vowelCount = 0;
		int consonantsCount = 0;

		for(int i =0;i<str.length();i++) {


			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {

				//System.out.println("It's a Vowel");
				vowelCount++;
			}else {
				//System.out.println("It's a Consonants");
				consonantsCount++;
			}

		}

		System.out.println("Vowel : "+ vowelCount);
		System.out.println("Consonants : "+ consonantsCount);



	}

}
