Feature: CreateAccount Page

  @tag10
  Scenario: Create an Account
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    Then click on the button "accountsTab"
    And click on the button "close"
    Then click on the button "newAccount"
    When user enter into textbox "accountName" "Testing Technologies"
    Then user select by visible text "accountType" "Technology Partner"
    Then user select by visible text "customerPriority" "High"
    And click on the button "saveBtnAccount"
    Then I validate the title "title" "Account: Testing Technologies ~ Salesforce - Developer Edition"

  @tag11
  Scenario: Create new view
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    Then click on the button "accountsTab"
    And click on the button "close"
    And click on the button "createNewView"
    When user enter into textbox "viewName" "CucumberTesting"
    And click on the button "saveNewViewBtn"

  @tag12
  Scenario: Edit view
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    Then click on the button "accountsTab"
    And click on the button "close"
    Then user select by visible text "selectView" "Orange"
    And click on the button "clickEditBtn"
    When user enter into textbox "viewName" "Orange"
    Then user select by visible text "filterByField" "Account Name"
    Then user select by visible text "filterByOperator" "contains"
    When user enter into textbox "filterByValue" "a"
    Then user select by visible text "fieldToDisplay" "Last Activity"
    Then click on the button "addBtn"
    Then click on the button "saveBtnInEditView"

  @tag13
  Scenario: Edit view
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    Then click on the button "accountsTab"
    And click on the button "close"
    And click on the button "mergeAccount"
    When user enter into textbox "enterTextInMergeField" "Testing"
    And click on the button "findAccountsBtn"
    And click on the button "firstElement"
    And click on the button "secondElement"
    And click on the button "elementNext"
    And click on the button "elementMerge"
    Then user accepts alert
    Then user select by visible text "dropDownRecentlyViewed" "Recently Viewed"
    And click on the button "dropDownRecentlyViewed"
    Then I validate the text "checkMergeAccountName" "Testing Technologies"

  @tag14
  Scenario: Create account report
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    Then click on the button "accountsTab"
    And click on the button "close"
    And click on the button "elementLastActivity"
    And click on the button "elementDateField"
    And click on the button "elementFromDate"
    And click on the button "elementToday"
    And click on the button "elementSave"
    When user enter into textbox "elementReportName" "New Test Report April"
    When user enter into textbox "elementReportUniqueName" "CucumberTesting"
    And click on the button "elementSaveAndRunReport"
    Then I validate the text "checkReportName" "New Test Report April"
