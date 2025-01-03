Feature: User should access to the Oroinc Documentation page.

  Background: User is already in the log in page
    Given the user is on the login page

@us02
  Scenario Outline: Verify login with different user types
    When the user logged in as "<userType>"
    And user clicks the question mark icon
    And user switch to the "Welcome to Oro Documentation"
    Then the user sees URL "https://doc.oroinc.com/"
    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |

