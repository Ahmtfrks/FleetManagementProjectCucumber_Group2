Feature: As a user, I want to view car odometer info on the Vehicles Odometer page.


  Scenario Outline:Verify that <userType>s see the error message,
  “You do not have permission to perform this action.” when they click the Vehicle Odometer module.



    Given the user is on the login page
    And the user enters "<userType>" information
    When the user navigates "Fleet" "Vehicle Odometer"
    Then the user should be able to see below columns error message "<errorMessages>"
    Examples:
      | userType      | errorMessages                                                                                                              |
      | Store Manager | You do not have permission to perform this action.                                                                         |
      | Sales Manager | The application is not configured properly (message consumers are not available). Please contact the system administrator. |


  Scenario: Default page number
    Given the user is on the login page
    And the user enters "Truck Driver" information
    When the user navigates "Fleet" "Vehicle Odometer"
    Then default page number should be 1


  Scenario: Default view per page number
    Given the user is on the login page
    And the user enters "Truck Driver" information
    When the user navigates "Fleet" "Vehicle Odometer"
    Then default view per page number should be 25


