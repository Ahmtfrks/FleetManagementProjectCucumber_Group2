@B31G2-220
Feature: View columns on the Vehicle models page

  Background:
    Given the user is on the login page

  @B31G2-218
  Scenario Outline: Verify that user type can see 10 columns on the Vehicles Model page
    When the user enters "<userType>" information
    And User navigates to "Fleet" to "Vehicles Model"
    Then User should sees options:
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
      | userType      |
      | Store Manager |
      | Sales Manager |

  @B31G2-219
  Scenario: Drivers cannot access the Vehicles Model page and see “You do not have permission to perform this action.” message on the screen.
    When the user enters "Truck Driver" information
    And User navigates to "Fleet" to "Vehicles Model"
    Then User should sees  “You do not have permission to perform this action.” message on the screen
