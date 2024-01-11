Feature: Fleet management different user type login feature

    Scenario Outline: Login as a <userType>
      Given the user is on the login page
      When the user enters "<userType>" information 
      Then the user should see the dashboard
      Examples:
        | userType |
        | Truck Driver  |
        | Sales Manager  |
        | Store Manager  |

