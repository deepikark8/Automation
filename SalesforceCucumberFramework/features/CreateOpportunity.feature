Feature: Create Opportunity Page

  @tag15
  Scenario: opportunities drop down
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementOpty"
    Then select menu list "elementOptyMenuList"

  @tag16
  Scenario: Create a new Opty
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementOpty"
    And click on the button "closeBtn"
    Then click on the button "elementNew"
    When user enter into textbox "optyName" "Automation testing"
    When user enter into textbox "optyAccountName" "Airplane"
    And click on the button "optyDate"
    And click on the button "optyToday"
    Then user select by visible text "optyStage" "Needs Analysis"
    Then click on the button "optyProbability"
    When user enter into textbox "optyProbability" "20"
    Then user select by visible text "optyLeadSource" "Phone Inquiry"
    When user enter into textbox "optyPrimaryCampaignSource" ""
    Then click on the button "optySave"
    Then I validate the title "title" "Opportunity: Automation testing ~ Salesforce - Developer Edition"

  @tag17
  Scenario: Test Opportunity Pipeline Report
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementOpty"
    And click on the button "closeBtn"
    And click on the button "elementOptyPipeline"
    Then I validate the title "title" "Opportunity Pipeline ~ Salesforce - Developer Edition"

  @tag18
  Scenario: Test Stuck Opportunities Report
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementOpty"
    And click on the button "closeBtn"
    And click on the button "elementStuckOpty"
    Then I validate the title "title" "Stuck Opportunities ~ Salesforce - Developer Edition"

  @tag19
  Scenario: Test Stuck Opportunities Report
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementOpty"
    And click on the button "closeBtn"
    Then user select by visible text "elementIntervalDropDown" "Current FQ"
    Then user select by visible text "elementInclude" "All Opportunities"
    And click on the button "clickQuarterlySummaryLink"
    Then I validate the title "title" "Opportunity Report ~ Salesforce - Developer Edition"
