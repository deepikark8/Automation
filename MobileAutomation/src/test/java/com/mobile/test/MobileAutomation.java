package com.mobile.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mobile.base.BaseTest;
import com.mobile.pages.CalculatorPage;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;

public class MobileAutomation extends BaseTest{
	
	AndroidDriver<MobileElement> driver;
	CalculatorPage calc;
	
	@BeforeMethod
	public void before() {
		driver = launchMobileapp();
		//calc = new CalculatorPage(driver);
		
	}
	
	@Test
	public void validatecalculator() {
		/*
		 * calc.ClickAgree(); calc.pressNine(); calc.pressPlus(); calc.PressTwo();
		 */
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	

}
ER