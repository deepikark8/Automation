package Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


//Property file which contains key and value

public class PropertiesFileConcept {
	
	

	public static void main(String[] args) throws IOException {
		
		
	/*1. Define Path of the File*/
		
		String sUerDir =  System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
		
		
		//File Separator
		String fileSeparator = System.getProperty("file.separator");
		
		
		
	String sPath = sUerDir+ fileSeparator  +"src" + fileSeparator+"Day8"+fileSeparator+"userdetails.properties";
	
	System.out.println(sPath);
	
	 
	/*2.Load the file to Object. Type of the object is File Input Stream */
	FileInputStream fileInput = new FileInputStream(sPath);
	
	/*3. Create an object of Properties Class   */
	Properties property = new Properties();
	
	/* 4. Load my file input stream to the properties  */
	property.load(fileInput);

	/*5. Retrieve the data from the file */
	System.out.println(property.get("url"));
	
	
	
	
	
	/*6. Write the data in the file */
	
	property.setProperty("Email","test@123.com");
	property.setProperty("PhoneNumber","123456");
	property.setProperty("Address","123 ABC");
	
	
	FileOutputStream fileOutput = new FileOutputStream(sPath);
	
	/* 7. Store data in the file */
	property.store(fileOutput, "file updated");
	
	
	fileInput.close();
	fileOutput.close();
	
	}

}
