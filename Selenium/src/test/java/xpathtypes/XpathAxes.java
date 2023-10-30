package xpathtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * We use xpath axes when we have dynamic element
 * 
 * 
 */

public class XpathAxes {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		launchBrowser();
		login();
		home();
		
		xpathFollowing();
		xpathFollowingSibling();
		xpathPreceding();
		xpathPrecedingSibiling();
		xpathChild();
		
		xpathParent();
		xpathDescendants();
		xpathAncestors();
		//driver.quit();
	}
	
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		
	}
	
		public static void login() {
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement clickSubmit = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		clickSubmit.click();
	}
	
	public static void home() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
	}
	
	//---- Following----- Following element
	public static void  xpathFollowing() {
		
		WebElement elementFollowing = driver.findElement(By.xpath("//input[@id='name']//following::div//input[@id='lname']"));
		elementFollowing.sendKeys("Ramkumar");
		
	}
	
	//--- Following-Sibling---- nodes that share same parent in the following 
	public static void xpathFollowingSibling() {
		
		WebElement elementDropDown = driver.findElement(By.xpath("//option[@value='newdelhi']//following-sibling::option[1]"));
		elementDropDown.click();

	}
	
	
	//----	Preceding------ locate element before the current node
	public static void xpathPreceding() {
		
		
		WebElement elementPreceding = driver.findElement(By.xpath("//input[@id='emailid']//preceding::input[@id='pincode']"));
		elementPreceding.sendKeys("95054");
		
	}
	
	//---- Preceding-Sibling ------ nodes that share same parent but the before(previous) text
	public static void xpathPrecedingSibiling() {
		
		WebElement elementPrecedingSibling = driver.findElement(By.xpath("//option[text()='MBA']//preceding-sibling::option[1]"));
		elementPrecedingSibling.click();
		
	}
	
	//----- Xpath using child ---- locate all the child element of particular node
	public static void xpathChild() {
		WebElement elementChild = driver.findElement(By.xpath("//span[@class='col-35']//child::input[@value='female']"));
		elementChild.click();
		
	}
	
	
	//----- xpath using Parent---- parent node of current node 
	public static void xpathParent() {
		
		WebElement element = driver.findElement(By.xpath("//a[@onclick='logout()']//parent::div//a"));
		System.out.println("Parent :"+ element.getText());
	}
	
	//------ xpath using descendants ---- descendants  refer to child nodes, grand child nodes.
	public static void xpathDescendants() {
		
		WebElement element = driver.findElement(By.xpath("//div[@class='row'][1]//descendant::span"));
		System.out.println(element.getText());
		
	}
	
	//---- xpath using Ancestors---- refer to parent node, grand parent node
	public static void xpathAncestors() {
		
		WebElement element = driver.findElement(By.xpath("//div[@class='row']//ancestor::div//input[@id='name']"));
		element.sendKeys("Deepika");
		
	}
	
}
