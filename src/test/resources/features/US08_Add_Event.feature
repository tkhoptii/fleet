@all
Feature: Recurring Calendar Event
  As a user, I want to create a recurring (repetitive) calendar event.
  As a user, I get error message when the Repeat Every box is cleared.

  Background: User is already in the log in page
    Given the user is on the login page

  @wipEY
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
 #   Given the user logged in with username as "User1" and password as "UserUser123"


#  Scenario: Default value for "Repeat Every" is 1
    Given users navigate to "Activities" and to "Calendar Events" page
    When users create calendar even click create calendar event button
    When users choose to create a recurring event to click repeat checkbox
    And users confirm Repeat Every is set to 1 as default
    Then users should see "1" by default in the Repeat Every input field
    When I clear the Repeat Every field
    Then I should see the error message "This value should not be blank."

    Examples:
      | userType      |
      | driver        |
      | Sales Manager |
      | Store Manager |

#  Scenario: Verify that users see the error message
#    Given users are on the create event page
#    When users clear the repeat every box





  #Scenario: Login as user1
   # Given I am on the login page
    #When I enter the user1 credentials
    #Then I should be able to login

  #Scenario: Click Activities module and Calendar event submodule
   # When I click Activities and Calendar event submodule
    #And I click create calendar event button
    #Then I should be able to access calendar event site
