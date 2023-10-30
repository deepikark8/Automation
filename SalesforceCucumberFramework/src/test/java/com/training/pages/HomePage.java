package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage {

	static WebDriver driver;
	public HomePage() {
		super(driver=BaseTest.getDriver());
		
		
	addObject("userMenuDropDown",By.id("userNavLabel"));
	addObject("logout",By.xpath("//a[contains(text(),'Logout')]"));
	addObject("selectfromDropDown",By.xpath("//a[contains(text(),'Logout')]"));
	addObject("userMenuDropDownList",By.id("userNav-menuItems"));
	addObject("MyProfile",By.xpath("//a[contains(text(),'My Profile')]"));
	addObject("MySettings",By.xpath("//a[contains(text(),'My Settings')]"));
	addObject("developerConsole",By.xpath("//a[text()='Developer Console']"));
	addObject("logout",By.xpath("//a[contains(text(),'Logout')]"));
	
	//Create Account
	//TC10
	addObject("accountsTab",By.xpath("//a[@title='Accounts Tab']"));
	addObject("close",By.xpath("//a[contains(text(),'Close')]"));
	addObject("newAccount",By.name("new"));
	addObject("accountName",By.id("acc2"));
	addObject("accountType",By.id("acc6"));
	addObject("customerPriority",By.id("00NDm000006Mfgb"));
	addObject("saveBtnAccount",By.name("save"));
	
	//TC11
	addObject("createNewView",By.xpath("//a[contains(text(),'Create New View')]"));
	addObject("viewName",By.id("fname"));
	addObject("saveNewViewBtn",By.name("save"));
	
	//TC12
	addObject("selectView",By.id("fcf"));
	addObject("clickEditBtn",By.xpath("//a[text()='Edit']"));
	addObject("viewName",By.id("fname"));
	addObject("filterByField",By.id("fcol1"));
	addObject("filterByOperator",By.id("fop1"));
	addObject("filterByValue",By.id("fval1"));
	addObject("fieldToDisplay",By.id("colselector_select_0"));
	addObject("addBtn",By.xpath("//img[@alt='Add']"));
	addObject("saveBtnInEditView",By.name("save"));
	
	//TC13
	addObject("mergeAccount",By.xpath("//a[contains(text(),'Merge Accounts')]"));
	addObject("enterTextInMergeField",By.id("srch"));
	addObject("findAccountsBtn",By.name("srchbutton"));
	addObject("firstElement",By.xpath("//*[@id=\"cid0\"]"));
	addObject("secondElement",By.xpath("//*[@id=\"cid1\"]"));
	addObject("elementNext",By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[1]"));
	addObject("elementMerge",By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]"));
	addObject("dropDownRecentlyViewed",By.id("hotlist_mode"));
	addObject("checkMergeAccountName",By.xpath("//tr[contains(@class,'dataRow even first')]//a"));
	
	//TC14
	addObject("elementLastActivity",By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
	addObject("elementDateField",By.xpath("//*[@id='ext-gen20']"));
	addObject("elementFromDate",By.xpath("//*[@id='ext-gen152']"));
	addObject("elementToday",By.xpath("//button[contains(text(),'Today')]"));
	addObject("elementSave",By.xpath("//*[@id='ext-gen49']"));
	addObject("elementReportName",By.xpath("//*[@id='saveReportDlg_reportNameField']"));
	addObject("elementReportUniqueName",By.xpath("//*[@id='saveReportDlg_DeveloperName']"));
	addObject("elementSaveAndRunReport",By.xpath("//button[contains(text(),'Save and Run Report')]"));
	addObject("checkReportName",By.xpath("//div[@class='content']"));
	
	//TC15
	addObject("elementOpty",By.xpath("//a[@title='Opportunities Tab']"));
	addObject("elementOptyMenuList",By.id("fcf"));
	
	//TC16
	addObject("elementNew",By.xpath("//input[@title='New']"));
	addObject("optyName",By.id("opp3"));
	addObject("optyAccountName",By.id("opp4"));
	addObject("optyDate",By.id("opp9"));
	addObject("optyToday",By.xpath("//a[@class='calToday']"));
	addObject("optyStage",By.id("opp11"));
	addObject("optyProbability",By.id("opp12"));
	addObject("optyLeadSource",By.id("opp6"));
	addObject("optyPrimaryCampaignSource",By.id("opp17"));
	addObject("optySave",By.xpath("//td[@class='pbButtonb']//input[@title='Save']"));
	addObject("closeBtn",By.xpath("//a[text()='Close']"));
	
	//TC17
	addObject("elementOptyPipeline",By.xpath("//a[normalize-space()='Opportunity Pipeline']"));
	
	//TC18
	addObject("elementStuckOpty",By.xpath("//a[normalize-space()='Stuck Opportunities']"));
	
	//TC19
	addObject("elementIntervalDropDown",By.xpath("//select[@id='quarter_q']"));
	addObject("elementInclude",By.xpath("//select[@id='open']"));
	addObject("clickQuarterlySummaryLink",By.xpath("//input[@title='Run Report']"));
	
	//TC20
	addObject("elementLead",By.xpath("//a[@title='Leads Tab']"));
	
	//Tc21
	addObject("elementListDropDown",By.xpath("//select[@id='fcf']"));
	
	//TC22
	addObject("selectfromDropDown",By.xpath("//input[@title='Go!']"));
	addObject("elementListDropDown",By.xpath("//select[@id='fcf']"));
	
	//TC23
	addObject("elementListViewDropDown",By.id("fcf"));
	addObject("elementGo",By.xpath("//input[@title='Go!']"));
	
	//TC24
	addObject("elementLeadNew",By.xpath("//input[@title='New']"));
	addObject("elementLastName",By.id("name_lastlea2"));
	addObject("elementCompanyName",By.id("lea3"));
	addObject("elementSave",By.xpath("//td[@class='pbButtonb']//input[@title='Save']"));
	
	//TC25
	addObject("elementContacts",By.xpath("//a[@title='Contacts Tab']"));
	addObject("elementNew",By.xpath("//input[@title='New']"));
	addObject("elementLastName",By.xpath("//input[@id='name_lastcon2']"));
	addObject("elementAccountName",By.xpath("//input[@id='con4']"));
	addObject("clickSaveAccount",By.xpath("//td[@class='pbButtonb']//input[@title='Save']"));
	
	//TC26
	addObject("elementCreateNewViewLink",By.xpath("//a[normalize-space()='Create New View']"));
	addObject("elementViewName",By.id("fname"));
	addObject("elementUniqueName",By.name("devname"));
	addObject("elementSaveNewView",By.xpath("//td[@class='pbButtonb']//input[@title='Save']"));
	addObject("elementContactsDropDown",By.xpath("//select[@title='View:']"));
	
	//TC27
	addObject("elementDropDownRecentlyCreated",By.name("hotlist_mode"));
	
	//TC28
	addObject("elementContactsDropDown",By.xpath("//select[@title='View:']"));
	
	//TC29
	addObject("elementContactListName",By.xpath("//table[@class='list']/tbody/tr/th[1]/a"));
	addObject("eleemntContactListNameDetails",By.xpath("//h2[@class='topName']"));
	
	//TC30
	addObject("elementNewViewLink",By.xpath("//a[normalize-space()='Create New View']"));
	addObject("elementUniqueName",By.name("devname"));
	addObject("elementSaveNewViewContact",By.xpath("//td[@class='pbButtonb']//input[@title='Save']"));
	addObject("elementErrorMsg",By.xpath("//div[@class='requiredInput']//div[@class='errorMsg']"));
	
	//TC31
	addObject("elementNewViewLink",By.xpath("//a[normalize-space()='Create New View']"));
	addObject("elementViewName",By.id("fname"));
	addObject("elementUniqueName",By.name("devname"));
	addObject("elementCancel",By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]"));
	addObject("elementContactsText",By.xpath("//table[@class='list']/tbody/tr/th[1]/a"));
	
	//TC32
	addObject("elementNewContact",By.xpath("//input[@title='New']"));
	addObject("elementLastName",By.xpath("//input[@id='name_lastcon2']"));
	addObject("elementAccountName",By.xpath("//input[@id='con4']"));
	addObject("elementSaveNewContactPage",By.xpath("//td[@class='pbButtonb']//input[@title='Save & New']"));
	addObject("titlePage",By.xpath("//h1[@class='pageType']"));
	
	//TC33
	addObject("elementHome",By.xpath("//a[@title='Home Tab']"));
	addObject("elementUserNameInUseMenu",By.id("userNavLabel"));
	addObject("elementUserName",By.xpath("//h1[@class='currentStatusUserName']/a"));
	
	
	//TC34
	addObject("elementUserName",By.xpath("//h1[@class='currentStatusUserName']/a"));
	addObject("editProfile",By.xpath("//a[@class='contactInfoLaunch editLink']"));
	addObject("elementUserNameTitle",By.id("tailBreadcrumbNode"));
	
	
	//TC35
	addObject("clickAllTab",By.xpath("//a[@href='/home/showAllTabs.jsp']"));
	addObject("elementCustomizeAllTabs",By.xpath("//input[@title='Customize My Tabs']"));
	addObject("elementSelectedTab",By.id("duel_select_1"));
	addObject("elementClickSaveBtn",By.name("save"));
	addObject("elementHomeTabNames",By.xpath("//ul[@class='zen-inlineList zen-tabMenu']"));
	
	//TC36
	addObject("elementUserProfileName",By.id("userNavLabel"));
	addObject("elementDateLink",By.xpath("//span[@class='pageDescription']/a"));
	addObject("element8PM",By.xpath("//a[normalize-space()='8:00 PM']"));
	addObject("elementSubjectComboBoxBtn",By.xpath("//img[@title='Subject Combo (New Window)']"));
	addObject("elementEndTime",By.xpath("//input[@name='EndDateTime_time']"));
	addObject("elementClick9",By.xpath("//div[normalize-space()='9:00 PM']"));
	addObject("elementCalenderSave",By.xpath("//td[@class='pbButton']//input[@title='Save']"));
	addObject("elementTime8PM",By.xpath("//a[normalize-space()='8:00 PM']"));
	addObject("elementOther8PM",By.xpath("//div[@class='multiLineEventBlock dragContentPointer']/span/a/span"));
	addObject("elementOtherLink",By.cssSelector("a[href='javascript:pickValue(4);']"));
	
	//TC37
	addObject("element4PM",By.xpath("//a[normalize-space()='4:00 PM']"));
	addObject("elementOtherLink",By.cssSelector("a[href='javascript:pickValue(4);']"));
	addObject("elementCheckRecurrence",By.xpath("//input[@name='IsRecurrence']"));
	addObject("elementFrequency",By.xpath("//label[normalize-space()='Frequency']"));
	addObject("elementStartDate",By.xpath("//label[@for='RecurrenceStartDateTime']"));
	addObject("elementEndDate",By.xpath("//label[@for='RecurrenceEndDateOnly']"));
	addObject("elementSelectWeekly",By.xpath("//input[@value='ftw']"));
	addObject("elementCalenderSave",By.xpath("//td[@class='pbButton']//input[@title='Save']"));
	addObject("elementTime",By.xpath("//a[normalize-space()='4:00 PM']"));
	addObject("elementOther4PM",By.xpath("//div[@class='multiLineEventBlock dragContentPointer']/span/a/span"));
	addObject("elementMonthView",By.xpath("//img[@title='Month View']"));	
	addObject("EndDate",By.xpath("//input[@name='RecurrenceEndDateOnly']"));
	
	
	
	
	
	
	
	}

}
