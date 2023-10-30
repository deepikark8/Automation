package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
 * 
 * 
 * 	- Implicit wait 
 * 	- Explicit Wait
 * 	- Fluent Wait
 * 
 */
public class Waits {
	
	static WebDriver driver;
	static WebElement element;
	
	public static void main(String[] args) {
		launchBrowser();
		implicitwait();
		waitForFluent();
		clickImageTab();
		
	}
	
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
			
		
	}
	
	/*--- Implicit wait - it tells the webdriver to wait  for certain amount of time for the element before 
	it throws the No such element exception */
	
	// Implict wait - driver level
	public static void implicitwait() {
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//10 - integer value... TimeUnit - Measurement of time in Seconds/minutes/Milliseconds
		driver.findElement(By.id("APjFqb")).sendKeys("Happy");
		
	}
	
	public static void clickImageTab() {
		
		element  = driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
		int myMinutes = 5;
	    Duration durationInMinutes = Duration.ofMinutes(myMinutes);
	    
		waitForElement(element,durationInMinutes);
		element.click();
		
	}
	
	
	//---- Explicit wait - Element level
	// --It is specific to element which is loading late.
	//The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception.
	
	
	public static void waitForElement(WebElement element,Duration d) {
		
		WebDriverWait wait = new WebDriverWait (driver,d); 
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.elementToBeClickable(element)); ----- elementToBeClickable()
		//wait.until(ExpectedConditions.textToBePresentInElement(xpath, "text")); --- textToBePresentInElement
		//wait.until(ExpectedConditions.alertIsPresent()); ---- alertIsPresent
		//----- frameToBeAvailableAndSwitchToIt
		
		/*
		 *  alertIsPresent()
			elementSelectionStateToBe()
			elementToBeClickable()
			elementToBeSelected()
			frameToBeAvaliableAndSwitchToIt()
			invisibilityOfTheElementLocated()
			invisibilityOfElementWithText()
			presenceOfAllElementsLocatedBy()
			presenceOfElementLocated()
			textToBePresentInElement()
			textToBePresentInElementLocated()
			textToBePresentInElementValue()
			titleIs()
			titleContains()
			visibilityOf()
			visibilityOfAllElements()
			visibilityOfAllElementsLocatedBy()
			visibilityOfElementLocated()
		 * 
		 * 
		 */
	}
	
	
	//---Fluent wait --- it checks for element in a regular interval of time  --- poll time
	//It helps to avoid ElementNotVisibleException
	public static void waitForFluent() {
		System.out.println("FluentWait");
		FluentWait fluentwait = new FluentWait(driver);
		fluentwait.withTimeout(Duration.ofSeconds( 10));
		fluentwait.pollingEvery(Duration.ofSeconds(10));
		
		
		
	}

}
