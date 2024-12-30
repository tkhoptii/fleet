Feature: Car odometer info on the Vehicles Odometer page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline:  Verify that Store and Sales managers see the error message
    Given the user logged in as "<userType>"
    When the user navigate to "Fleet" and to "Vehicle Odometer" page
    Then user should see the error message "You do not have permission to perform this action."
    Examples:
      | userType      |
      | sales manager |
      | store manager |