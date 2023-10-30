Feature: Contacts Page

  @tag25
  Scenario: Create new contact
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    And click on the button "elementNew"
    Then user enter into textbox "elementLastName" "Ramkumar"
    Then user enter into textbox "elementAccountName" "Harsh"
    And click on the button "clickSaveAccount"
    Then I validate the title "title" "Contact: Ramkumar ~ Salesforce - Developer Edition"

  @tag26
  Scenario: Create new view in the Contact Page
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    And click on the button "elementCreateNewViewLink"
    When user enter into textbox "elementViewName" "Cucumber"
    When user enter into textbox "elementUniqueName" "Cucumber"
    And click on the button "elementSaveNewView"
    Then validate selected text "elementContactsDropDown" "Cucumber"

  @tag27
  Scenario: Check recently created contact in the Contact Page
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    Then user select by visible text "elementDropDownRecentlyCreated" "Recently Created"

  @tag28
  Scenario: Check My contacts view in the Contact Page
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    Then user select by visible text "elementContactsDropDown" "My Contacts"
    Then I validate the title "title" "Contacts: Home ~ Salesforce - Developer Edition"

  @tag29
  Scenario: View a contact in the contact Page
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    Then I validate the actual and expected text "elementContactListName" "eleemntContactListNameDetails"

  @tag30
  Scenario: Check the Error message if, the required information is not entered while creating a New view in Contacts
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    And click on the button "elementNewViewLink"
    When user enter into textbox "elementUniqueName" "EFGH"
    And click on the button "elementSaveNewViewContact"
    Then I validate the text "elementErrorMsg" "Error: You must enter a value"

  @tag31
  Scenario: Check the Cancel button works fine in Create New View
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    And click on the button "elementNewViewLink"
    When user enter into textbox "elementViewName" "ABCD"
    When user enter into textbox "elementUniqueName" "EFGH"
    And click on the button "elementCancel"
    Then I validate the text "elementContactsText" "Ramkumar"

  @tag32
  Scenario: Check the Save and New button works in New Contact page
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    And click on the button "elementContacts"
    Then click on the button "close"
    And click on the button "elementNewContact"
    When user enter into textbox "elementLastName" "Indian"
    Then user enter into textbox "elementAccountName" "Global Media"
    And click on the button "elementSaveNewContactPage"
    Then I validate the text "titlePage" "Contact Edit"
