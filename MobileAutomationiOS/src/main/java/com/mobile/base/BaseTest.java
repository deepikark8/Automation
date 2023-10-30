package com.mobile.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class BaseTest {
	
	IOSDriver<MobileElement> driver;
	
	public IOSDriver<MobileElement> launchMobileApp(){
		
		DesiredCapabilities capabalities = new DesiredCapabilities(); 
		capabalities.setCapability("platformName", "iOS");
		capabalities.setCapability("platformVersion", "16.4");
		capabalities.setCapability("deviceName","iPhone 14 Pro");
		capabalities.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		capabalities.setCapability("automationName", "XCUItest");
		capabalities.setCapability("udid", "E3CF338A-2CAF-480A-A422-EC164F4188C0");
		try {
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabalities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
	}

}





