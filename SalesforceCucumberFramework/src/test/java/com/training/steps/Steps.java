package com.training.steps;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	BasePage basePage;
	PageFactory pageFactory = new PageFactory();
	
	@Before
	public void setUp() throws IOException {
		launchApplication();
	}
	@Given("user is on {string}")
	public void user_is_on(String Page) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		basePage = pageFactory.initialize(Page);
	}
	@When("user enter into textbox {string} {string}")
	public void user_enter_into_textbox(String LogicalName, String value) {
		basePage.enterIntoTextBox(LogicalName, value);  
	}
	@Then("click on the button {string}")
	public void click_on_the_button(String LogicalName) {
		basePage.wait(10000);
		basePage.clickButton(LogicalName);
	}
	@Then("I validate the outcomes {string} {string}")
	public void i_validate_the_outcomes(String LogicalName, String value) {
		basePage.wait(10000);
		basePage.validate(LogicalName,value);
	}
	@Then("user click checkbox {string}")
	public void user_click_checkbox(String LogicalName) {
		basePage.clickButton(LogicalName);
	}
	@Then("I validate the title {string} {string}")
	public void i_validate_the_title(String LogicalName, String value) {
		basePage.validateTheTitle(LogicalName,value);
	}
	@Then("user select {string}")
	public void user_select(String LogicalName) {
	    basePage.selectFromDropDown(LogicalName);
	}
	@Then("user switch frame {string}")
	public void user_switch_frame(String LogicalName) {
	    basePage.switchFrame(LogicalName);
	}
	@Then("user click dropDown {string}")
	public void user_click_drop_down(String LogicalName) {
		basePage.selectFromDropDown(LogicalName);
	}
	@When("user post a message {string} {string}")
	public void user_post_a_message(String LogicalName, String value) {
	   basePage.postMsg(LogicalName, value);
	}
	@When("user choose file {string} {string}")
	public void user_choose_file(String LogicalName, String value) {
		basePage.chooseFile(LogicalName, value);
	}
	@Then("user move to element {string}")
	public void user_move_to_element(String LogicalName) {
	    basePage.moveToElement(LogicalName);
	}
	@Then("crop the image {string}")
	public void crop_the_image(String LogicalName) {
	   basePage.cropImage(LogicalName);
	}
	@Then("I validate the list {string}")
	public void i_validate_the_list(String LogicalName) {
		basePage.wait(10000);
	    basePage.validateTheUserMenuList(LogicalName);
	}
	@Then("user select by visible text {string} {string}")
	public void user_select_by_visible_text(String LogicalName, String value) {
	    basePage.selectByVisibleText(LogicalName, value);
	}
	@When("pop Window Opens")
	public void pop_window_opens() {
	    basePage.popWindowOpens();
	}
	@Then("user accepts alert")
	public void user_accepts_alert() {
		basePage.alert();
	}
	@Then("I validate the text {string} {string}")
	public void i_validate_the_text(String LogicalName, String value) {
	    basePage.validateText(LogicalName, value);
	}
	@Then("select menu list {string}")
	public void select_menu_list(String LogicalName) {
	   basePage.selectMenuList(LogicalName);
	}

	@Then("select Lead menu list {string}")
	public void select_lead_menu_list(String LogicalName) {
	    basePage.selectLeadMenuList(LogicalName);
	}
	@Then("sleep time")
	public void sleep_time() {
	    basePage.wait(5000);
	}
	@Then("validate selected text {string} {string}")
	public void validate_selected_text(String LogicalName, String value) {
	   basePage.validateSelectedText(LogicalName, value);
	}

	@Then("I validate the actual and expected text {string} {string}")
	public void i_validate_the_actual_and_expected_text(String LogicalName, String value) {
	   basePage.validateActualExpectedText(LogicalName, value);
	}
	@Then("validate the tab name {string} {string}")
	public void validate_the_tab_name(String LogicalName, String expectedText) {
	    basePage.validateTabName(LogicalName, expectedText);
	}
	@Then("validate combo box window {string} {string}")
	public void validate_combo_box_window(String LogicalName, String expectedText) {
	    basePage.validateComboBoxWindow(LogicalName, expectedText);
	}
	@When("user enter  end date into textbox {string} {string}")
	public void user_enter_end_date_into_textbox(String LogicalName, String expectedText) {
		basePage.endDate(LogicalName, expectedText);
	   
	}





	@After
	public void tearDown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.close();
		driver = null;
	}
}
