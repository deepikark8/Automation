package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class MySettingsPage extends BasePage {

	static WebDriver driver;
	public MySettingsPage() {
		super(driver=BaseTest.getDriver());
		
		addObject("personalBtn",By.xpath("//span[text()='Personal']"));
		addObject("loginHistory",By.xpath("//span[text()='Login History']"));
		addObject("downloadLoginHistory",By.xpath("//a[contains(text(),'Download login history')]"));
		addObject("displayLayout",By.xpath("//span[text()='Display & Layout']"));
		addObject("customizeTab",By.xpath("(//a[@id='CustomizeTabs_font'])[1]"));
		addObject("clickDropDown",By.xpath("//select[@id='p4']"));
		addObject("selectReports",By.xpath("//select[@name='duel_select_0']"));
		addObject("clickAddReport",By.id("duel_select_0_right"));
		addObject("clickSaveReport",By.xpath("//input[@value=' Save ']"));
		addObject("email",By.xpath("//span[text()='Email']"));
		addObject("myEmailSettings",By.id("EmailSettings_font"));
		addObject("emailName",By.id("sender_name"));
		addObject("emailAddress",By.id("sender_email"));
		addObject("AutomaticBcc",By.xpath("//input[@value='1']"));
		addObject("saveBtn",By.name("save"));
		addObject("calender",By.id("CalendarAndReminders_font"));
		addObject("clickActivityReminders",By.id("Reminders_font"));
		addObject("OpenaTestReminder",By.id("testbtn"));
		
	}
	
	

}
