@wip
Feature: DDT example with CloudTables
  Scenario: Adding one person
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "fadd" to firstname field
    And User enters "afda" to lastname field
    And User enters "unknow" to position field
    And User enters 2000 to salary field
    And User clicks on create button
    Then User should be able to find person at the search box


#
#Scenario Outline:
#    Given User is on cloudTables homepage
#    When User clicks on New button
#    When User enters "<firstname>" to firstname field
#    And User enters "<lastname>" to lastname field
#    And User enters "<position>" to position field
#    And User enters "<salary>" to salary field
#    And User clicks on create button
#    Then User should be able to find person at the search box
#    Examples:
#    |   firstname |lastname|position  |