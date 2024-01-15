Feature:Fleet management Vehicle Contracts page feature

  User Story:
  As a user,I want to access to Vehicle contracts page And the record should be displayed.
  Accounts are: Truck Driver, Store Manager, Sales Manager

  Background:For all scenarios user is on the login page of the fleet management application
    Given the user is on the login page

  Scenario Outline : Verify that Store managers and Sales managers can access the Vehicle Contracts page
    When the user logged in as "<userType>"
    And the user navigates to "Fleet" to "Vehicle Contracts"
    Then the user should be able to see the expected url as "https://qa.xfleetsolutions.com/entity/Extend_Entity_VehicleContract"
    And the user should be able to see expected title as "All - Vehicle Contract - Entities - System - Car - Entities - System"
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Truck Driver  |

  Scenario : Verify that Drivers can NOT access the Vehicle Contracts  page and the app displays
    When the user logged in as "Truck driver"
    And the user navigates to "Fleet" to "Vehicle Contracts"
    Then the user should be able to see message as "You do not have permission to perform this action."
