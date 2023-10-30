Feature: Login Page

  @tag1
  Scenario: login to application with valid username and password field should be empty
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" ""
    And click on the button "Login"
    Then I validate the outcomes "errorMsg" "Please enter your password."

  @tag2
  Scenario: login to application with valid username and password. Home page is displayed
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    And click on the button "Login"
    Given user is on "HomePage"
    Then I validate the title "title" "Home Page ~ Salesforce - Developer Edition"

  @tag3
  Scenario: login to application with valid username and password.Click Rememberme checkbox
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    Then user enter into textbox "password" "password@123"
    Then user click checkbox "rememberme"
    And click on the button "Login"
    Given user is on "HomePage"
    Then user click dropDown "userMenuDropDown"
    And user select "logout"
    Given user is on "LoginPage"
    Then I validate the outcomes "displayOfUsername" "deepika@mh.com"

  @tag4A
  Scenario: login to application with valid username and password. Home page is displayed
    Given user is on "LoginPage"
    When user enter into textbox "username" "deepika@mh.com"
    And click on the button "forgotPassword"
    Then user enter into textbox "usernameInForgotPassword" "deepika@mh.com"
    And click on the button "Continue"
    Then I validate the outcomes "passwordReset" "We’ve sent you an email with a link to finish resetting your password."

  @tag4B
  Scenario: login to application with valid username and password. Home page is displayed
    Given user is on "LoginPage"
    When user enter into textbox "username" "123"
    Then user enter into textbox "password" "22131"
    And click on the button "Login"
    Then I validate the outcomes "errorMsgIncorrectUserDetails" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

    
    
    
    
    