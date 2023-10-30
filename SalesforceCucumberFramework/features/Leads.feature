Feature: Leads Page

  @tag20
  Scenario: User logged out and application closed
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementLead"
    And click on the button "closeBtn"
    Then I validate the title "title" "Leads: Home ~ Salesforce - Developer Edition"

  @tag21
  Scenario: User logged out and application closed
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementLead"
    And click on the button "closeBtn"
    Then select Lead menu list "elementListDropDown"

  @tag22
  Scenario: User logged out and application closed
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementLead"
    And click on the button "closeBtn"
    And click on the button "selectfromDropDown"
    Given user is on "HomePage"
    And user click dropDown "userMenuDropDown"
    Then click on the button "logout"
    Then sleep time
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementLead"
    Then validate selected text "elementListDropDown" "Today's Leads"

  @tag23
  Scenario: List item Todays Leads work
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementLead"
    And click on the button "closeBtn"
    Then user select by visible text "elementListViewDropDown" "Today's Leads"
    And click on the button "elementGo"
    Then I validate the title "title" "Leads ~ Salesforce - Developer Edition"

  @tag24
  Scenario: Check New button on Leads Home. Application launched and user logged in. User logged out and application closed
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementLead"
    And click on the button "closeBtn"
    And click on the button "elementLeadNew"
    When user enter into textbox "elementLastName" "ABCD"
    When user enter into textbox "elementCompanyName" "ABCD"
    And click on the button "elementSave"
    Then I validate the title "title" "Lead: ABCD ~ Salesforce - Developer Edition"
