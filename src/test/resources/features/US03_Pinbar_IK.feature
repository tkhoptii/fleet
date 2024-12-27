Feature: As a user, I want to learn how to use the pinbar

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
 #   Given the user logged in with username as "User1" and password as "UserUser123"



     When the user clicks to the "Learn how to use this space"
     And the user see “How To Use Pinbar”
     Then the user can see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”

    Examples:
      | userType      |
      | driver        |
      | Sales Manager |
      | Store Manager |