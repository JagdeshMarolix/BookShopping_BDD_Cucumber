@Login
Feature: Login page feature

@Smoke
  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "My Account – Automation Practice Site"

@Smoke
  Scenario: Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed

@Regression @skip_scenario
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "jmarolix@gmail.com"
    And user enters password "Jagdeesh@1"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "My Account – Automation Practice Site"
