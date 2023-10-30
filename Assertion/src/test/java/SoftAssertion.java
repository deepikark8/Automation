import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	public static void main(String[] args) {
		launchBrowser();
		
	}
	
	
public static void launchBrowser() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		String expectedText = "Google123";
		String actualText = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualText, expectedText);
		
		
		
}




}
