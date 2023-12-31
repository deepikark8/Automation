package ebaySelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Categories {
	
	static WebDriver driver;
	static DesiredCapabilities cap = new DesiredCapabilities();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		allCategories("safari");
		
		//searchBox();
		
		//driver.close();
		
	}
	
	public static void allCategories(String browser) throws MalformedURLException {
		
		
		
	//	WebDriverManager.chromedriver().setup();
		//	driver = new ChromeDriver();
		
		if(browser.equals("chrome")) {
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("chrome");
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
		}
	
		if(browser.equals("firefox")) {
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("firefox");
			
			FirefoxOptions options = new FirefoxOptions();
			options.merge(cap);
			
		}
		if(browser.equals("safari")) {
			
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("safari");
			
			SafariOptions options = new SafariOptions();
			options.merge(cap);
			
		}
		
		
		driver = new RemoteWebDriver(new URL("http://192.168.86.250:4444"),cap); 
		driver.get("https://www.ebay.com/");		
		//driver.findElement(By.id("gh-cat-td")).click();
		
		
	}
	
	public  void showAllCategories() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-shop-a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li/a[contains(text(),'Parts & accessories')]")).click();
		
	}
	
	
public static String readExcelFile() throws IOException {
		
		File file = new File("/Users/rahade/workspaceInterView/ReadWriteExcelFile/application.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
        XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
        XSSFSheet sheet = workBook.getSheetAt(0);
        String cellValue = sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(cellValue);
        
        workBook.close();
        fileInput.close();
		return cellValue;
	}

	public static  void searchBox() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = readExcelFile();
		System.out.println("url : "+ url);
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Macbook");
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='gAC']"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(WebElement element: list) {
			
			System.out.println(element.getText());
			String sMAcBookPro = driver.findElement(By.xpath("//li/a[@aria-label='macbook air m1']")).getText();
			System.out.println("textt ::: "+sMAcBookPro);
			if(sMAcBookPro.equals(element.getText())) {
				
				System.out.println("-------");
				
				//macbook air m1
				//.click();
				
			}
		}
		
	}
}
