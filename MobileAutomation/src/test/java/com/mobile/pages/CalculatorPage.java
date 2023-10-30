package com.mobile.pages;

import com.mobile.base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorPage extends BasePage{
	
	public CalculatorPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id="android:id/button1")
	MobileElement Agree;
	
	@AndroidFindBy(id="com.miui.calculator:id/btn_9_s")
	MobileElement nine;

	@AndroidFindBy(accessibility="plus")
	MobileElement plus;

	@AndroidFindBy(id="com.miui.calculator:id/btn_2_s")
	MobileElement two;
	
	

	public void ClickAgree() {
		Agree.click();
	}
	
	public void pressNine() {
		nine.click();
	}
	
	
	public void pressPlus() {
		plus.click();
	}
	
	
	public void PressTwo() {
		two.click();
	}
	
	
	

}
