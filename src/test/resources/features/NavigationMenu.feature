Feature: Navigation Menu

  Scenario Outline: Navigation Fleet -- Vehicles
    Given the user is on the login page
    When the user enters "<userType>" information
    And the user navigates "<tab>" "<module>"
    Then the title contains "<title>"
    Examples:
      | userType | tab | module | title |
      | Truck Driver  |Fleet|Vehicles|Car - Entities - System - Car - Entities - System|
      | Sales Manager  |Fleet|Vehicles|Car - Entities - System - Car - Entities - System|
      | Store Manager  |Fleet|Vehicles|Car - Entities - System - Car - Entities - System|
