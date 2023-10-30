package com.mobile.pages;

import com.mobile.base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AlertViewPage extends BasePage {

	public AlertViewPage(IOSDriver<MobileElement> driver) {
		super(driver);	
	}

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Simple\"]\n"
			+ "")
	MobileElement elementSimple;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	MobileElement elementOk;
	
	public void clickSimple() {
		elementSimple.click();
	}
	public void clickOK() {
		elementOk.click();
	}
}
