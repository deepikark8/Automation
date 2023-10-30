package com.mobile.base;

import io.appium.java_client.android.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.*;

public class BaseTest {
	
	private static AndroidDriver<MobileElement> driver;
	
	public AndroidDriver<MobileElement> launchMobileapp()  {
		
		DesiredCapabilities capabalities = new DesiredCapabilities();
		
		File appDir = new File("/Users/rahade/eclipse-workspace4/MobileAutomation/apps");
	    
		File newApp = new File(appDir,"ApiDemos.apk");
		
		capabalities.setCapability("deviceName", "4b61cd710305");
		capabalities.setCapability("platformName", "Android");
		capabalities.setCapability("platformVersion", "9");
		capabalities.setCapability("app", newApp.getAbsolutePath());
		
		
		//com.miui.calculator/com.miui.calculator.cal.CalculatorActivity
		//com.android.contacts/com.android.contacts.activities.TwelveKeyDialer
		
		
		/*
		 * capabalities.setCapability("appPackage", "com.miui.calculator");
		 * capabalities.setCapability("appActivity",
		 * "com.miui.calculator.cal.CalculatorActivity");
		 */
		
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabalities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
		
	}

}
