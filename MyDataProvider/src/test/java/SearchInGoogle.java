import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchInGoogle {
	static WebDriver driver;
	@BeforeMethod
	public static void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@Test(dataProvider="searchProvider")
	public static void searchGoogle(String name, String searchKey) throws InterruptedException {
		
		WebElement elementSearch = driver.findElement(By.name("q"));
		elementSearch.sendKeys(searchKey);
		System.out.println("Welcome "+ name +"Your search key is->"+searchKey);
		
		Thread.sleep(3000);
		
		String expectedText = elementSearch.getAttribute("value");
		System.out.println( expectedText + "::::"+ searchKey );
		
		elementSearch.clear();
		
		AssertJUnit.assertTrue(expectedText.equalsIgnoreCase(searchKey));
		
	}
	
	@DataProvider(name="searchProvider")
	public Object[][] getDataFromDataprovider(){
		return new Object[][]
				{
					{ "Deepika" , "USA" },
					{ "Ramkumar", "Mountain House"},
					{ "Harsh" ,"Santa Clara"},
					{ "Harshitha" ,"San jose"}
			
			
				};
		
	}
	
	@AfterMethod
	public static void teardown() {
		driver.quit();
	}
	

}
