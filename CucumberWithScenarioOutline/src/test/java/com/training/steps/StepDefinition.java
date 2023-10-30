package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinition {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Given("User is on {string}")
	public void user_is_on(String string) {
	    
	}

	@When("^User enter the username(.*)$")
	public void user_enter_the_username(String username) {
	    WebElement eleUsername = driver.findElement(By.xpath("//input[@id='email']"));
	    eleUsername.sendKeys(username);
	}

	@Then("^User enter the password(.*)$")
	public void user_enter_the_password(String password) {
	    WebElement elePassword = driver.findElement(By.xpath("//input[@id='pass']"));
	    elePassword.sendKeys(password);
	}

	@Then("click button")
	public void click_button() {
	    WebElement eleSubmit = driver.findElement(By.xpath("//button[@name='login']"));
	    eleSubmit.click();
	}

	@After
	public void teardown() {
		//driver.quit();
	}

}
