package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	public String getProperty(String key) throws IOException {
		
		String sPath = "/Users/rahade/eclipse-workspace4/SalesforceCucumberFramework/Properties/application.properties";
		FileInputStream fileInput = new FileInputStream(sPath);
		Properties property = new Properties();
		property.load(fileInput);
		String value = property.getProperty(key);
		return value;
	}

}
