Feature: Select vehicle from the Vehicles page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that users see 8 filter items on the Accounts page
    Given the user logged in as "<userType>"
    When the user navigate to "Customers" and to "Accounts" page
    Then the user should see the following filter items:
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Update At     |

    Examples:
      | userType      |
      | sales manager |
      | store manager |