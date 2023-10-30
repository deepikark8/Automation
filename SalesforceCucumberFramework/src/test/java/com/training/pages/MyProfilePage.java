package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;



public class MyProfilePage extends BasePage{

	static WebDriver driver;
	public MyProfilePage() {
		super(driver=BaseTest.getDriver());
	
	
	addObject("editProfile",By.xpath("//a[@class='contactInfoLaunch editLink']"));
	addObject("aboutSwitchFrame",By.id("contactInfoContentId"));
	addObject("aboutTab",By.xpath("//a[contains(text(),'About')]"));
	addObject("lastName",By.id("lastName"));
	addObject("saveAll",By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
	addObject("Post",By.xpath("//a[@title='Post']"));
	addObject("postSwitchFrame",By.xpath("//iframe[@allowtransparency='true']"));
	addObject("postMsg",By.xpath("//body[contains(text(),'Share')]"));
	addObject("Share",By.id("publishersharebutton"));
	addObject("file",By.xpath("//span[text()='File']"));
	addObject("upload",By.xpath("//a[contains(text(),'Upload')]"));
	addObject("chooseFile",By.id("chatterFile"));
	addObject("publishersharebutton",By.id("publishersharebutton"));
	addObject("photo",By.id("uploadLink"));
	addObject("photoSwitchFrame",By.id("uploadPhotoContentId"));
	addObject("choosePhoto",By.id("j_id0:uploadFileForm:uploadInputFile"));
	addObject("clickSavePhoto",By.id("j_id0:uploadFileForm:uploadBtn"));
	addObject("cropper1",By.xpath("//div[@class='imgCrop_handle imgCrop_handleSE']"));
	addObject("cropper2",By.xpath("//div[@class='imgCrop_handle imgCrop_handleNE']"));
	addObject("saveCroppedImg",By.id("j_id0:j_id7:save"));
	
}
}