package Practice;

import java.util.Scanner;

public class SearchWordInText {
	
	
	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = reader.nextLine();
		String[] strArr = str.split(" ");
		System.out.println("Enter the text to search");
		String strSearch = reader.nextLine();
		boolean searchTextFound = false;
		for(int i=0;i< strArr.length;i++) {
			
			if(strSearch.equalsIgnoreCase(strArr[i])) {
				
				searchTextFound = true;
				break;
			}
			
			
		}
		
		if(searchTextFound == true) {
			System.out.println("Search word found");
		}else {
			System.out.println("Not found");
		}
		
		
		reader.close();
		
	}
	
	

}
