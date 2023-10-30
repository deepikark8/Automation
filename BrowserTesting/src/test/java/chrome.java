import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup(); //--> WebDriver manager
		
		
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true); //---> headless mode
		
		WebDriver driver = new ChromeDriver(options); // ---> Selenium manager
		
		
		
		
		
		//WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		
		
		
	}

}

