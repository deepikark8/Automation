package com.seleniumgrid.parallelTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelTest {
	WebDriver driver;
	
	
	
	@BeforeMethod()
	public void beforeMethod() throws MalformedURLException {
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		//Headless mode
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		
		//cap.setCapability("headless",true);
		driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),options);
		
		
	}
	
	@Test
	public void test1() {
		
		
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void test2() {
		
		driver.get("https://www.google.com/");
		
	}

	@Test
	public void test3() {
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}
	
}
