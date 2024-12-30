@datatable
Feature: View columns on the Vehicles Model page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify view columns on the Vehicles Model page.
    Given the user logged in as "<userType>"
    When user navigates to "Fleet" and to "Vehicles Model" page


    Then user should be able to see following modules

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

        Examples:
      | userType |
      |  store manager |
      |  sales manager |

  Scenario: Verify Drivers cannot access Vehicles Model page
   Given the user logged in as "Driver"
    Then user should see the error message "You do not have permission to perform this action."


