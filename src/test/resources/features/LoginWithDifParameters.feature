Feature: Fleet management login with different parameters feature

  Scenario Outline: Login as a <userType>
    Given the user is on the login page
    When the user enters "<userType>" information
    Then the user should see the dashboard
    Examples:
      | userType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |