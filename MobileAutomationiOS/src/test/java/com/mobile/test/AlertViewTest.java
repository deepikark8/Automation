package com.mobile.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mobile.base.BaseTest;
import com.mobile.pages.AlertViewPage;
import com.mobile.pages.HomePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class AlertViewTest extends BaseTest{
	
	IOSDriver<MobileElement> driver;
	AlertViewPage alertViewPage;
	HomePage homePage;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = launchMobileApp();
		homePage = new HomePage(driver);
		alertViewPage = new AlertViewPage(driver);
	}
	
	@Test
	public void alertView() {
		homePage.clickAlertView();
		alertViewPage.clickSimple();
		alertViewPage.clickOK();
	}
	
	@AfterMethod
	public void tearDown() {
		
	}

}
