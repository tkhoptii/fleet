Feature: Select vehicle from the Vehicles page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that user, I should see error messages when I enter an invalid integer number
  into the calendar Repeat Every input box.
    Given the user logged in as "<userType>"
    And users navigate to "Activities" and to "Calendar Events" page
    And users create calendar event click create calendar event button
    And users choose to create a recurring event to click repeat checkbox
    Then users if enter less than one should see "The value have not to be less than one.”


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


  Scenario Outline: Verify that user, I should see error messages when I enter an invalid integer number
  into the calendar Repeat Every input box.
    Given the user logged in as "<userType>"
    And users navigate to "Activities" and to "Calendar Events" page
    And users create calendar event click create calendar event button
    And users choose to create a recurring event to click repeat checkbox
    Then users if enter more than 99 should see “The value have not to be more than 99.”


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |