@us14
Feature: Manage filters on the Marketing page
  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When the user navigate to "Marketing" and to "Campaigns" page
    And user should wait 5 seconds
    And the user will click the filter message
    And the user will click the manage filter
    Then user can see all checkboxes as checked by default


    Examples:
      | userType      |
      | sales manager |
      | store manager |

  Scenario Outline: Verify login with different user types

    Given the user logged in as "<userType>"
    When the user navigate to "Marketing" and to "Campaigns" page
    And user should wait 5 seconds
    And the user will click the filter message
    And the user will click the manage filter
    And user should wait 3 seconds
  Then user is able to uncheck any amount of boxes



    Examples:
      | userType      |
      | sales manager |
      | store manager |
