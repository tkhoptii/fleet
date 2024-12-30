@smoke
Feature: Select vehicle from the Vehicles page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Vehicles" page
    Then user can see all checkboxes as unchecked
    Examples:
      | userType      |
      | sales manager |
      | store manager |


  Scenario Outline: Verify that users can check the first checkbox to select all the cars
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Vehicles" page
    Then user can check first checkbox to select all the cars
    Examples:
      | userType      |
      | sales manager |
      | store manager |


  Scenario Outline: Verify that users can select any car
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Vehicles" page
    Then user can select any car
    Examples:
      | userType      |
      | sales manager |
      | store manager |
