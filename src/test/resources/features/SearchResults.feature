@wip
Feature: Login with parameters

Scenario: Login as librarian same line
Given I am on the login page
When I login using "librarian1@library" and "qU9mrvur"
Then dashboard should be displayed
And there should be 144 users
When I go to Users page,
Then table should have following columns
|Actions|
|User ID|
|Full Name|
|Email|
|Group|
|Status|