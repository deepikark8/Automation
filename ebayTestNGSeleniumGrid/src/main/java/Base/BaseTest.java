package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import Utilities.CommonUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {

	
	WebDriver driver;
	CommonUtilities utilities = new CommonUtilities();
	
	
	public WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")) {	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		return driver;
	}
	
	public String getUrl() throws Exception {
		
		String sUrl = utilities.getString();
		
		
		return sUrl;
		
	}
	 
	
}
