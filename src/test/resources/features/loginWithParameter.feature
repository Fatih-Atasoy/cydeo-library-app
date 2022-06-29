
Feature: Login with parameters

  @librarianParam
  Scenario: Login as librarian 49
    Given I am on the login page
    When I enter username "librarian49@library"
    And I enter password '8l9bsLAN'
    And click the sign in button
    And there should be 144 users
    Then dashboard should be displayed
      #number can be whatever you have there

  @studentParam
  Scenario: Login as student 30
    Given I am on the login page
    When I enter username "student30@library"
    And I enter password 'QX6FWzj6'
    And click the sign in button
    Then books should be displayed
      #number can be whatever you have there


  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian49@library" and "8l9bsLAN"
    Then dashboard should be displayed

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian1@library" and "qU9mrvur"
    Then dashboard should be displayed
    And there should be 144 users