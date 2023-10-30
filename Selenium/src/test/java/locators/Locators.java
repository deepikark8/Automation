package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 *  - id
 *  - name
 *  - class
 *  - css selector
 * 	- link-text
 *  - partial link-text
 *  - tagname
 *  - xpath	
 * 
 * Absolute Xpath - contains complete xpath from root to node and it starts with single slash "/" 
 * 			Eg: /html/body/div/input
 * 
 * Relative xpath - it starts from referring the webelement of the current element and starts with double slash "//" 
 * 			Eg:	//tagname[@attribute='value'] 
 * 
 * 
 */


public class Locators {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*"); --->issue with driver
		
		options.addArguments("headless");
		options.addArguments("incognito");
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	
		@Test
		public void testcase1() {
			
			
		driver.switchTo().frame("callout"); //---> iframe	---> rt click shows reload frames -> easy way to identify frames in webpage
		
		WebElement clickStaySignedOut = driver.findElement(By.xpath("//button[contains(text(),'Stay signed out')]"));
		clickStaySignedOut.click();	
		
		driver.switchTo().defaultContent();
		WebElement clickBtn = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		clickBtn.click();
		
		driver.switchTo().frame("app");
		WebElement clcikYoutubeBtn = driver.findElement(By.xpath("//span[contains(text(),'YouTube')]"));
		clcikYoutubeBtn.click();
		
		
	}
		
		
		
		@AfterMethod
		public void tearDown() {
			//driver.quit();	
		}
		
	
		

}
