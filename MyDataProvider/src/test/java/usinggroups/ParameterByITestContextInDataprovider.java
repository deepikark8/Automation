package usinggroups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterByITestContextInDataprovider {

	static WebDriver driver;
	
	@BeforeMethod(groups= {"A","B"})
	public static void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@Test(dataProvider="SearchProvider",dataProviderClass=DataProviderClass.class,groups="A")
	public void testMethodA(String name, String searchKey) {
		
		WebElement searchText= driver.findElement(By.name("q"));
		searchText.sendKeys(name);
		
		System.out.println("Welcome "+ name);
		
		String testValue = searchText.getAttribute("value");
		searchText.clear();
		
		Assert.assertEquals(testValue, name);
		
		
	}
	
	@Test(dataProvider="SearchProvider",dataProviderClass=DataProviderClass.class,groups="B")
	public void testMethodB(String searchKey) {
		
		WebElement searchText= driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);
		
		System.out.println("Welcome to "+ searchKey);
		
		String testValue = searchText.getAttribute("value");
		searchText.clear();
		
		Assert.assertEquals(testValue, searchKey);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
