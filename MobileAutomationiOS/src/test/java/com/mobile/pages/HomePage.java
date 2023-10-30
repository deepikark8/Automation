package com.mobile.pages;

import com.mobile.base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage{
	
	public HomePage(IOSDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	


	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	MobileElement activityIndicator;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	MobileElement alertView;
	
	public void clickActivityIndicator() {
		activityIndicator.click();
	}
	//driver.navigate().back();
	public void clickAlertView() {
		alertView.click();
	}
}
