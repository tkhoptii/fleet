Feature: As a user, I want to access to Vehicle Contracts page
  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Vehicle Contracts" page
    And the user should see the page URL as "https://qa1.vytrack.com/entity/Extend_Entity_Carreservation"
    And the user should see expected title as "All - Car - Entities - System - Car - Entities - System"

    Examples:
      | userType      |
      | Sales Manager |
      | Store Manager |


  Scenario: Verify that driver cannot access the Vehicle Contract page
    When the user logged in as "driver"
    When user navigate to "Fleet" and to "Vehicle Contracts" page
    Then the user should see the error message "You do not have permission to perform this action."


