@smoke
Feature: Vehicle Page Feature

  User Story :  As a user, I want to see edit car info icons from the Vehicles page.


#  Scenario Outline: Verify that users see “view, edit, delete” options
#  when they hover the mouse over the 3 dots “…”
#    Given the user is on the login page
#    When the user enters <userType> information
#    And the user navigates "<tab>" "<module>"
#    Then the user should see <options>
#    Examples:
#      | userType      | tab   | module   | options |
#      | Truck Driver  | Fleet | Vehicles | view    |
#      | Sales Manager | Fleet | Vehicles | edit    |
#      | Store Manager | Fleet | Vehicles | delete  |



  Scenario Outline: Verify that users see “view, edit, delete” options when they hover the mouse over the 3 dots “…”
    Given the user is on the login page
    When the user enters "<userType>" information
    And the user navigates "<tab>" "<module>"
    Then the user should be able to see options as "view,edit,delete"
    Examples:
      | userType      | tab   | module   |
      | Truck Driver  | Fleet | Vehicles |
      | Sales Manager | Fleet | Vehicles |
      | Store Manager | Fleet | Vehicles |

#updaate





















































































