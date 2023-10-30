package Day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//1.Define the path
		String sPath = "/Users/rahade/eclipse-workspace/AdavancedJava/File/ReadFile";
		
		//2.Read the File
		FileReader fileReader = new FileReader(sPath);
		
		//3.Read the file line by line
		BufferedReader bufferReader = new BufferedReader(fileReader);
		
		String str ;
		
		
//		while((str = bufferReader.readLine())!= null) {
//			
//			System.out.println(str);
//			
//		}
		
//		System.out.println(bufferReader.readLine()+"\n");
//		System.out.println(bufferReader.readLine()+"\n");
//		System.out.println(bufferReader.readLine()+"\n");
//		System.out.println(bufferReader.readLine()+"\n");
		
		String systemPath = System.getProperty("user.dir");
		
		String fileSeparator = System.getProperty("file.separator");
		
		
		String sPath1 = systemPath + fileSeparator +"File"+fileSeparator+"NewWriteFile";
		
		System.out.println(sPath1);
		
		
		//Write in same file
		FileWriter fileWriter = new FileWriter(sPath1);
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		
		while((str = bufferReader.readLine())!= null) {
//			
			//bufferWriter.write("You define your own life. Don't let other people write your script. ");
			bufferWriter.write(str);
			
//			
		}
		
		bufferWriter.close();
		
		
		

	}

}
