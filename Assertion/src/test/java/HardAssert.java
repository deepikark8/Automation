import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert {
	
	public static void main(String[] args) {
		
		
		launchBrowser();
	}
	
	public static void launchBrowser() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedText = "Facebook - log in or sign up";
		String actualText = driver.getTitle();
		
		//System.out.println(driver.getTitle());
		Assert.assertEquals(actualText,expectedText);
		System.out.println("Assert passed");
		
		

		
	}
	
	

}




