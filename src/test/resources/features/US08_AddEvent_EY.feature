@all
Feature: Recurring Calendar Event
  As a user, I want to create a recurring (repetitive) calendar event.
  As a user, I get error message when the Repeat Every box is cleared.

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify that <userType> see the number "1" by default in the Repeat Every input option.
    When the user logged in as "<userType>"
    And users navigate to "Activities" and to "Calendar Events" page
    And users create calendar event click create calendar event button
    And users choose to create a recurring event to click repeat checkbox
    And users confirm Repeat Every is set to 1 as default
    Then users should see "1" by default in the Repeat Every input field

    Examples:
      | userType      |
      | driver        |
      | Sales Manager |
      | Store Manager |

  Scenario Outline: Verify that <userType> see the error message "This value should not be blank." when the Calendar
  event Repeat Every field is cleared (delete the number 1).
    When the user logged in as "<userType>"
    And users navigate to "Activities" and to "Calendar Events" page
    And users create calendar event click create calendar event button
    And users choose to create a recurring event to click repeat checkbox
    When I clear the Repeat Every field
    Then I should see the error message "This value should not be blank."

    Examples:
      | userType      |
      | driver        |
      | Sales Manager |
      | Store Manager |

