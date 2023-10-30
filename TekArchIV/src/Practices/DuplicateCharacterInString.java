package Practices;

import java.util.Scanner;

public class DuplicateCharacterInString {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in); 
		System.out.println(" enter ur string \n"); 
		String inputString=input.nextLine(); 
		int[] occured=new int[128];
		for(int i=0;i<inputString.length();i++){ 
			if(inputString.charAt(i)!=' ')
			//System.out.println("test :"+occured[inputString.charAt(i)]++);
			occured[inputString.charAt(i)]++;
		}
		for(int j=0;j<occured.length;j++){ 
			//System.out.println("Occured :"+ occured[j]);
			
			if(occured[j]>1){
				System.out.println((char)(j) + " is duplicate"); 
		}
			
		}
	}
}
