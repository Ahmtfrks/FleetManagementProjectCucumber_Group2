Feature: Navigation Menu


  Scenario Outline: Navigating Fleet -- Vehicles
    Given the user is on the login page
    When the user enters "<userType>" information
    And the user navigates "<tab>" "<module>"
    Then the title contains "<title>"
    Examples:
      | userType     | tab   | module           | title                                                          |
      | Truck Driver | Fleet | Vehicle Odometer | Vehicle Odometer - Entities - System - Car - Entities - System |


