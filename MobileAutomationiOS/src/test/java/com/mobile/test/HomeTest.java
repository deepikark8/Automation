package com.mobile.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mobile.base.BaseTest;
import com.mobile.pages.HomePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class HomeTest extends BaseTest {

	IOSDriver<MobileElement> driver;
	HomePage homePage;
	
	@BeforeMethod
	public void before() {
		driver = launchMobileApp();
		homePage = new HomePage(driver);
		
	}
	
	@Test
	public void validateActivityIndicators() {
		homePage.clickActivityIndicator();
	}
	
	@Test
	public void validateAlertView() {
		homePage.clickAlertView();
	}
	
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	

	
}
