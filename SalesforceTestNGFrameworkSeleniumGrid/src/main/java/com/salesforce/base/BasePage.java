package com.salesforce.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		
		//To initialize all the elements in the page 
		PageFactory.initElements(driver, this);
	}
	
	public void waitforVisibility(WebElement element, int time) {
		int myMinutes = 5;
	    Duration durationInMinutes = Duration.ofMinutes(myMinutes);
	    
		WebDriverWait wait = new WebDriverWait(driver, durationInMinutes);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void compareText(String ActualText,String ExpectedText) {
		Assert.assertEquals(ActualText, ExpectedText);
	}
	
}
