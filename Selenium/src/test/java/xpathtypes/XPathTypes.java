package xpathtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * DOM - Data object model
 * 
 *   //tagname[@attribute='value']
 *   
 *   
 *   // - current node
 *   tagname - tagname of current node
 * 	@ - select attribute
 *   attribute - attribute of the node
 *   value - value of chosen attribute
 *   
 * 
 */
public class XPathTypes {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
	}
	
	@Test
	public void xpathUsingContains() {
		
		WebElement downloads = driver.findElement(By.xpath("//a[@href='/downloads']"));
		downloads.click();
		
	}
	
	//---- Logical operation -----
	@Test
	public void xpathSuinbgLogicalOperators() {
		
		WebElement dropDown = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle' or @role='button']"));
		dropDown.click();
		
		WebElement insideDropDown = driver.findElement(By.xpath("//a[@href='/events' and contains(text(),'Events')]"));
		insideDropDown.click();
		
		
	}
	
	//---- Using Text()-----
	@Test
	public void xpathUsingText() {
		
		WebElement History = driver.findElement(By.xpath("//h4[text()='Selenium IDE']"));
		String actualText = History.getText();
		System.out.println(actualText);
		
	}
	
	//---- Starts-with
	@Test
	public void xpathUsingStartsWith() {
		
		WebElement txt = driver.findElement(By.xpath("//a[starts-with(@class,'selenium-button selenium-webdriver')]"));
		System.out.println(txt.getText());
		
	}
	
	
	//--- index
	@Test
	public void xpathUsingIndex() {
		
		WebElement element = driver.findElement(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0'][5]//span"));
		System.out.println(element.getText());
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
		
	}
}
