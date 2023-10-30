import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePage {
	
WebDriver driver;
DesiredCapabilities cap;


	@BeforeMethod
	public void GridSetup(){
		
		//DesiredCapabilites is used to set the type of browser and OS that we will automate.
		 cap = new DesiredCapabilities();
		
		
	}
	
	@Test
	public void Test1() throws MalformedURLException{

		
		cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.WIN10);
		// set the timeout to a maximum of 300 seconds
		//cap.setCapability("browserstack.idleTimeout", "300");

		//RemoteWebDriver is used to set which node (or machine) that our test will run against.
		driver = new RemoteWebDriver(new URL("http://192.168.86.23:4444"),cap);
				
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deepika ramkumar");
		System.out.println("Chrome - "+ driver.getTitle());


	}
	
	
	@Test
	public void Test2() throws MalformedURLException {

//		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		//cap.setPlatform(Platform.MAC);
		
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),cap);
//		driver.get("https://www.facebook.com/");
//		System.out.println(driver.getTitle());

		//RemoteWebDriver is used to set which node (or machine) that our test will run against.
		driver = new RemoteWebDriver(new URL("http://192.168.86.23:4444"),cap);
				
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deepika ramkumar");
		System.out.println("Safari - "+ driver.getTitle());
		

	}
	
	@Test
	public void Test3() throws MalformedURLException {

//		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("safari");
		//cap.setPlatform(Platform.ANY);
//		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		//RemoteWebDriver is used to set which node (or machine) that our test will run against.
		driver = new RemoteWebDriver(new URL("http://192.168.86.23:4444"),cap);
				
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deepika ramkumar");
		System.out.println("Firefox - "+ driver.getTitle());


	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
