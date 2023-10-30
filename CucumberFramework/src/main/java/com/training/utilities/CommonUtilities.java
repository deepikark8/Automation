package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getproperty(String key) throws IOException {
		
		String sPath = "/Users/rahade/eclipse-workspace4/CucumberFramework/properties/application.properties";
		
		FileInputStream fileInput =  new FileInputStream(sPath);
		Properties prop = new Properties();
		prop.load(fileInput);
		String value = prop.getProperty(key);
		return value;
	}

}
