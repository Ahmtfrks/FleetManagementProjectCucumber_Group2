@smoke
Feature: As a user, I want to view car odometer info on the Vehicles Odometer page.

  Background: For all scenarios user is on the login page of the fleet management application
    Given the user is on the login page


  Scenario: Default page number
    Given the user is on the login page
    And the user enter the driver information
    When the user navigates "Customers" "Contacts"
    Then default page number should be 1

    Scenario Outline:Verify that <userType>s see the error message,
    “You do not have permission to perform this action.” when they click the Vehicle Odometer module.
      When the user logged in as "<userType>"
      And the user navigates to "Fleet" to "Vehicle Model"
      Then the user should be able to see below columns error message "You do not have permission to perform this action."
      And the user should be able to see below columns error message "The application is not configured properly (message consumers are not available). Please contact the system administrator."
      Examples:
        | userType |
        | Store Manager |
        | Sales Manager |

  Scenario Outline:Verify that "Driver" see the error message,
  “You do not have permission to perform this action.” when they click the Vehicle Odometer module.
    When the user logged in as "<userType>"
    And the user navigates to "Fleet" to "Vehicle Model"
    Then the user should be able to see below columns error message "You do not have permission to perform this action."
    And the user should be able to see below columns error message "The application is not configured properly (message consumers are not available). Please contact the system administrator."
    Examples:
      | userType |
      | Store Manager |
      | Sales Manager |