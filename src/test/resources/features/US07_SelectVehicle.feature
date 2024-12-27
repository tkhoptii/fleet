Feature: Select vehicle from the Vehicles page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Vehicles" page
    Examples:
      | userType      |
      | sales manager |
      | store manager |


#  Scenario: Verify that once the users launch on the Vehicles page, the users can see all the checkboxes
#  as unchecked
#    Given the user logged in as "<userType>"
#    When user navigate to "Fleet" and to "Vehicles" page
#    Then user can see all checkboxes as unchecked

#  Scenario: Verify that users can check the first checkbox to select all the cars
#    Then user can check first checkbox to select all the cars