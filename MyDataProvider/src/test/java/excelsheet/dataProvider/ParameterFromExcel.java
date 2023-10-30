package excelsheet.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.differentMethod.DataProviderClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterFromExcel {

	static WebDriver driver;
	
	@BeforeMethod()
	public static void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test(dataProvider="Authentication")

    public void Registration_data(String sUserName,String sPassword)throws  Exception{

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sUserName);

		System.out.println(sUserName);

        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sPassword);

		System.out.println(sPassword);

        driver.findElement(By.xpath("//button[@name='login']")).click();

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

       // driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

		}

    @DataProvider

    public Object[][] Authentication() throws Exception{

         Object[][] testObjArray = ExcelUtils.getTableArray("/Users/rahade/InterviewPreparation/DataProvider/Testdata/exceldata.xlsx","Sheet1");

         return (testObjArray);

		}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
}
