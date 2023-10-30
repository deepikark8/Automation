package com.Java.Hackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Read a file content and write it to a new file in reverse order.
 * (reverse line 1-10 to line 10-1)
 * 
 * 
 */

public class Q31FileStringReverseOrder {
	
	
	public static String ReverseString(String sText) {
		
		String[] words = sText.split(" ");
		StringBuilder revStr = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			
			revStr.append(words[i]).append(" ");
		}
		
		return revStr.toString();
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Read a file path
		String sUserDir = System.getProperty("user.dir");
		String sFileSeparator = System.getProperty("file.separator");
		String sPath = sUserDir+sFileSeparator+"Files"+sFileSeparator+"ReadFile31";
		
		
		//Read a File
		FileReader fileReader = new FileReader(sPath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
			
		String str = bufferedReader.readLine();
		System.out.println(str);
		
		//Reverse the Words
		String strReversed = ReverseString(str);
		 System.out.println(strReversed);
		
		//Write in a new file
		String sWritePath = sUserDir+sFileSeparator+"Files"+sFileSeparator+"WriteFile31";
		
		FileWriter fileWriter = new FileWriter(sWritePath,true);// true to avoid deleting
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(strReversed);
		
		
		bufferedWriter.close();
		bufferedReader.close();
		

	}

}
