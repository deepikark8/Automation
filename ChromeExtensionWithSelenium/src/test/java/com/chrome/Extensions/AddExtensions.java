package com.chrome.Extensions;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddExtensions {
	
	public static void main(String[] args) {
		launchAppication();
		
	}
	
	public static void launchAppication() {
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addExtensions(new File("./Extensions/SelectorsHub.crx"));
		
		options.addExtensions(new File("/Users/rahade/InterviewPreparation/ChromeExtensionWithSelenium/Extensions/SelectorsHub.crx"));
		
		//options.addExtensions(new File("./Extensions/SelectorsHub.crx"),new File("./Extensions/chropath.crx"));
		
		//options.addExtensions(Arrays.asList(new File("./Extensions/SelectorsHub.crx"),new File("./Extensions/chropath.crx")));
		
		
	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
	}
}
