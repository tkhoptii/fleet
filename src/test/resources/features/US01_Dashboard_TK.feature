Feature: Users should be accessing all the main modules of the app

  Background: User is already in the log in page
    Given the user is on the login page

  @us01
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Then the user should see the following module names:
      | Dashboards          |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType      |
      | sales manager |
      | store manager |

  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    Then the user should see the following module names:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |