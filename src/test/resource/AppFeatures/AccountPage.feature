Feature: Dashboard Page Feature

Background:
Given user has already logged in to application
|username|password|
|jmarolix@gmail.com|Jagdeesh@1|


Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My Account – Automation Practice Site"

Scenario: Accounts section count			
Given user is on Accounts page
Then user gets accounts section
|Dashboard|
|Orders|	
|Downloads|
|Addresses|
|Account Details|
|Logout|
And accounts section count should be 6