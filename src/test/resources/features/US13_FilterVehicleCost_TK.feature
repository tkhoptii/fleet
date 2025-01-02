@us13
Feature: Managing filters on the Vehicle Cost page

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Costs" page,
    Then user should be able to see the following modules

      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | userType      |
      | sales manager |
      | store manager |

  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When user navigate to "Fleet" and to "Costs" page,
    Then user can check first checkbox to select all vehicle cost
    Examples:
      | userType      |
      | sales manager |
      | store manager |
