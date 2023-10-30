package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage() {
		
		super(driver = BaseTest.getDriver());
		
		addObject("username",By.id("username"));
		addObject("password",By.id("password"));
		addObject("Login",By.id("Login"));
		addObject("errorMsg",By.xpath("//div[contains(text(),'Please enter your password')]"));
		addObject("rememberme",By.xpath("//input[@id='rememberUn']"));
		addObject("displayOfUsername",By.xpath("//span[@id='idcard-identity']"));
		addObject("forgotPassword",By.xpath("//a[contains(text(),'Forgot Your Password?')]"));
		addObject("usernameInForgotPassword",By.xpath("//input[@name='un']"));
		addObject("Continue",By.xpath("//input[@id='continue']"));
		addObject("passwordReset",By.xpath("//p[contains(text(),'We’ve sent you an email with a link to finish resetting your password.')]"));
		addObject("errorMsgIncorrectUserDetails",By.id("error"));
	}
	

}
