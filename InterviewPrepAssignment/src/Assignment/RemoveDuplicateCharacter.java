package Assignment;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String str = "gtesting";
		System.out.println(str);
		char[] ch = str.toCharArray();

		for(int i=0;i<str.length();i++) {

			for(int j=i+1;j<str.length();j++) {

				if(ch[i] == ch[j]) {
					String str1 = String.valueOf(ch[i]);
					str = str.replaceAll(str1, "");
				}

			}

		}

		System.out.println("Duplicate Character Removed = "+ str);

	}

}
