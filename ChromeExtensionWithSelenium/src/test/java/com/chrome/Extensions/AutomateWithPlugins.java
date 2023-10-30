package com.chrome.Extensions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateWithPlugins {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		
		launchBrowser();
		DefineWord();
		SelectOptions();
		DefineWord();
	}
	
	public static void launchBrowser(){
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./Extensions/GoogleDictionary.crx"));
		
	    driver = new ChromeDriver(options);
	
	}
	
	public static void DefineWord() throws InterruptedException {
		
		driver.get("chrome-extension://mgijmajocgfcbeboacabfgobmjgjcoja/browser_action.html");
		
		
		
		WebElement elementTxt = driver.findElement(By.id("query-field"));
		elementTxt.sendKeys("Automation");
		
		WebElement elementBtnDefine = driver.findElement(By.id("define-btn"));
		elementBtnDefine.click();
		
		Thread.sleep(5000);
		
		String strTxt = driver.findElement(By.className("headword")).getText();
		System.out.println(strTxt);
	}
	
	public static void SelectOptions() {

		driver.get("chrome-extension://mgijmajocgfcbeboacabfgobmjgjcoja/options.html");
		WebElement selectLang = driver.findElement(By.id("language-selector"));
		Select select = new Select(selectLang);
		select.selectByVisibleText("Hindi");
		
		driver.findElement(By.id("save-btn")).click();
		
		
		
	}
	
}
