import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderwithExcel {

	WebDriver driver;
	
	@BeforeMethod()
	public void launchApplication() {
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(dataProvider="SearchFromExcel",dataProviderClass=ReadExcel.class)
	public void login(String username,String password) throws Exception {
		

		
		System.out.println("username :"+ username);
		System.out.println("Password : "+password);
		
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='email']"));
		elementUsername.sendKeys(username);
		
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		elementPassword.sendKeys(password);
		
		WebElement elementSubmit = driver.findElement(By.xpath("//button[@name='login']"));
		elementSubmit.click();
		
	}
	

}
