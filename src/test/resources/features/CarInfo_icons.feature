Feature: Vehicle Page Feature

  User Story :  As a user, I want to see edit car info icons from the Vehicles page.


  Scenario Outline: Verify that users see “view, edit, delete” options
  when they hover the mouse over the 3 dots “…”
    Given the user is on the login page
    And the user enters <userType> information

    Then the user should see "<options>"
    Examples:
      | userType      | options |
      | Truck Driver  | view    |
      | Sales Manager | edit    |
      | Store Manager | delete  |
