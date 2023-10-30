package com.training.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	
	
	HashMap<String,By> objectRepo = new HashMap<String,By>();
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	public void addObject(String LogicalName,By by) {
		objectRepo.put(LogicalName,by);
	}
	public WebElement getElement(String LogicalName) {
		By by = objectRepo.get(LogicalName);
		WebElement element = driver.findElement(by);
		return element;
	}
	public List<WebElement> getElements(String LogicalName) {
		By by = objectRepo.get(LogicalName);
		List<WebElement> listElements = driver.findElements(by);	
		return listElements;
	}
	public void enterIntoTextBox(String LogicalName, String value) {
		WebElement element = getElement(LogicalName);
		waitforVisibility(element,10);
		element.click();
		element.clear();
		element.sendKeys(value);
	}
	public void clickButton(String LogicalName) {
		WebElement element = getElement(LogicalName);
		element.click();
	}
	public void clickDropDown(String LogicalName) {
		WebElement element = getElement(LogicalName);
		element.click();
	}
	public void selectFromDropDown(String LogicalName) {
		WebElement element = getElement(LogicalName);
		element.click();
	}
	public void selectByVisibleText(String LogicalName,String value) {
		WebElement element = getElement(LogicalName);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	public void switchFrame(String LogicalName) {
		 WebElement element = getElement(LogicalName);
		 wait(5000);
		 driver.switchTo().frame(element);
	}
	public void postMsg(String LogicalName, String value) {
		WebElement element = getElement(LogicalName);
		waitforVisibility(element,10);
		element.sendKeys(value);
		driver.switchTo().defaultContent();
	}
	public void chooseFile(String LogicalName, String value) {
		WebElement chooseFile = getElement(LogicalName);
		waitforVisibility(chooseFile,15);
		chooseFile.sendKeys(value);	
	}
	public void moveToElement(String LogicalName) {
		WebElement elementPhoto = getElement(LogicalName);
		wait(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(elementPhoto).build().perform();
		waitforVisibility(elementPhoto,15);
		elementPhoto.click();
	}
	public void cropImage(String LogicalName) {
		WebElement cropper1 = getElement(LogicalName);
		waitforVisibility(cropper1,10);
		Actions action = new Actions(driver);
		action.clickAndHold(cropper1).moveByOffset(30, 50).build().perform();
	}
	
	public void validateTheTitle(String LogicalName, String value) {
		wait(5000);
		String actualText = driver.getTitle();
		System.out.println("actual text :"+ actualText);
		String expectedText = value;
		compareText(actualText,expectedText);
	}
	public void validate(String LogicalName, String value) {
		wait(5000);
		System.out.println("LogicalName :"+ LogicalName);
		WebElement elementToValidate = getElement(LogicalName); 
		String actualText = elementToValidate.getText();
		System.out.println("actualText : "+ actualText);
		String expectedText = value;
		compareText(actualText,expectedText);
	}
	public void validateText(String LogicalName, String value) {
		WebElement elementToValidate = getElement(LogicalName); 
		String ActualText = elementToValidate.getText();
		System.out.println("ActualText : "+ ActualText);
		String ExpectedText = value;
		compareText(ActualText,ExpectedText);	
		
	}
	public void selectMenuList(String LogicalName) {
		WebElement elementOptyMenuList = getElement(LogicalName); 
		Select select = new Select(elementOptyMenuList);
		String[] expectedList = {"All Opportunities","Closing Next Month","Closing This Month","My Opportunities","New Last Week","New This Week","Opportunity Pipeline","Private","Recently Viewed Opportunities","Won"};
		//elementOptyMenuList.click();
		List<WebElement> options = select. getOptions();
		for(WebElement strText : options) {
			for(int i=0;i<expectedList.length;i++) {
				
				if(strText.getText().equalsIgnoreCase(expectedList[i])){
					String actualText = strText.getText();
					String expectedText = expectedList[i];
					//Validate TC15
					compareText(actualText,expectedText);
				}
			}
		}
		
	}
	public void selectLeadMenuList(String LogicalName) {
		WebElement elementListDropDown = getElement(LogicalName); 
		Select select = new Select(elementListDropDown);
		String[] expectedList = {"All Open Leads","My Unread Leads","Recently Viewed Leads","Today's Leads","View - Custom 1","View - Custom 2"};
		elementListDropDown.click();
		
		//Validate TC21
		List<WebElement> options = select. getOptions();
		for(WebElement strText : options) {
			//System.out.println(strText.getText());
			for(int i=0;i<expectedList.length;i++) {
				
				if(strText.getText().equalsIgnoreCase(expectedList[i])){
					String actualText = strText.getText();
					String expectedText = expectedList[i];
					compareText(actualText,expectedText);
					}
				}
			}
	}
	
	public void validateTheUserMenuList(String LogicalName) {
		List<WebElement> elementList = getElements(LogicalName);
		String[] arr = {"My Profile","My Settings","Developer Console","Switch to Lightning Experience","Logout"};
		
		for(WebElement element:elementList) {
			//System.out.println(element.getText());
			for(int i=0; i<arr.length;i++) {
				if(element.getText().contains(arr[i])) {
			         System.out.println("Testcase passed all elements are found");		
				}
			}
		}
		
	}
	public void popWindowOpens() {
		String parentWindowTitle = driver.getTitle();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(parentWindowTitle);
		
		for(String handle:driver.getWindowHandles()) {
			
			driver.switchTo().window(handle);	
			
		}
		
		String childWindowTitle = driver.getTitle();
		System.out.println(childWindowTitle);
		
	}
	public void alert() {
		driver.switchTo().alert().accept();
	}
	public void validateSelectedText(String LogicalName, String value) {
		WebElement elementListDropDown = getElement(LogicalName);
		Select select = new Select(elementListDropDown);
		WebElement selectedOption = select.getFirstSelectedOption(); 
		String actualText = selectedOption.getText();
		String expectedText = value;
		compareText(actualText,expectedText);
	}
	public void waitforVisibility(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void validateActualExpectedText(String actualElement , String expectedElement) {
		WebElement element1 = getElement(actualElement);
		String actualText = element1.getText();
		element1.click();
		WebElement element2 = getElement(expectedElement);
		String expectedText = element2.getText();
		compareText(actualText,expectedText);
	}
	public void validateTabName(String LogicalName , String expected) {
		String expectedText = expected;
		List<WebElement> elementList = getElements(LogicalName);
		for(WebElement tabName : elementList) {
			System.out.println(tabName.getText());
			if(tabName.getText().equalsIgnoreCase(expectedText)){
				System.out.println("Element Present");
			}else {
				Assert.assertNotEquals(tabName.getText(), expectedText);
			}
		}
	}
	public void endDate(String LogicalName,String expected) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    Calendar cal = Calendar.getInstance();
	    //cal.setTime(new Date());
	    int days = Integer.parseInt(expected);
	    cal.add(Calendar.DATE, days);
	    WebElement element = getElement(LogicalName);
	    String newDate = dateFormat.format(cal.getTime());
	    System.out.println("newDate :"+newDate);
	    element.sendKeys(newDate);
	    element.click();
	}
	
	public void validateComboBoxWindow(String LogicalName , String expected) {
		// Store the current window handle
				String winHandleBefore = driver.getWindowHandle();
				String actualText = null;
				// Switch to new window opened
				for(String winHandle : driver.getWindowHandles()){
					if(!winHandle.equals(winHandleBefore)) {
						driver.switchTo().window(winHandle);
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						WebElement element = getElement(LogicalName);
						actualText = element.getText();
						element.click();
					}
				}
				driver.switchTo().window(winHandleBefore);
				String expectedText = expected;
				compareText(actualText,expectedText);
	}
	public void compareText(String actualText , String expectedText) {
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
