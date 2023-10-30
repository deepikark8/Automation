package Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExamplePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/** *1. Define Path of the File*/
		
		//String sPath = "/Users/rahade/Desktop/Personal/Tekarch/WebinarSS/Day8/properties.txt";
			//fruits.properties
			String sPath = "/Users/rahade/eclipse-workspace/AdavancedJava/src/Day8/test.properties";
		 
		/**2.Load the file to Object. Type of the object is File Input Stream */
		FileInputStream fileInput = new FileInputStream(sPath);
		
		/**3. Create an object of Properties Class   */
		Properties property = new Properties();
		
		/**4. Load my file input stream to the properties  */
		property.load(fileInput);

		/**5. Retrieve the data from the file */
		System.out.println(property.getProperty("Tesla"));
		
		
		
		/***6. Write the data in the file */
		FileOutputStream outputStream = new FileOutputStream(sPath);
		
		property.setProperty("hi", "test");
		property.setProperty("10", "Deepiks");
		property.setProperty("30", "Ram");
		property.setProperty("37", "harsh");
		property.setProperty("67", "harshi");
		property.store(outputStream, null);
		
		
		fileInput.close();

	}

}
