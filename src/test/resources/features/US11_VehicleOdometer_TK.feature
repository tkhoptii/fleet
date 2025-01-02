Feature: Car odometer info on the Vehicles Odometer page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline:  Verify that Store and Sales managers see the error message
    Given the user logged in as "<userType>"
    When both users navigate to "Fleet" and to "Vehicle Odometer" page
    Then both users should see the error message "You do not have permission to perform this action."
     Examples:
      | userType      |
      | sales manager |
      | store manager |

    Scenario: Verify that Drivers see the default page as 1.
      Given the user logged in as "driver"
      When user navigate to "Fleet" and to "Vehicle Odometer" page.
      Then user should see default page as "1"
      And drivers see the View Per Page as "25" by default