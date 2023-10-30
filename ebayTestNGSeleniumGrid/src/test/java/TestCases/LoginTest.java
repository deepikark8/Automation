package TestCases;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;




//java -jar selenium-server-4.10.0.jar standalone


public class LoginTest{

	
	//public WebDriver driver;
	//public DesiredCapabilities cap = new DesiredCapabilities();
	//String url;
	
	
	
	@Test
	public void login() throws MalformedURLException {
		
	 DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setPlatform(Platform.ANY);
		cap.setBrowserName("safari");
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//		ChromeOptions options = new ChromeOptions();
//		options.merge(cap);

	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.86.250:4444"),cap);
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("deepika");
	System.out.println(driver.getTitle());
	
	}
	
	@AfterTest
	public void afterMethod() {
		//driver.close();
	}
	
}
