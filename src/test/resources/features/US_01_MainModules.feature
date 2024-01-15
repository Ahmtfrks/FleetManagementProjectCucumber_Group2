@B31G2-213
Feature: Access to all main modules of the application
  User Story: As a user, when I'm on the login page of the fleet management application
  I should be accessing all the main modules of the app.

  User Story :
  As a user, I should be accessing all the main modules of the app.

  AC #1: Verify that Store and Sales managers see 8 module names
  Expected module names:
  Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

  AC #2: Verify that Truck Drivers see 4 module names.
  Expected module names:
  Fleet, Customers, Activities, System

#  TODO: Remove login from hook, instead of it use this:
#  @Background:
#  Given the user is on the login page

  @B31G2-211
  Scenario Outline: Verify user who has "<userType>" access can see 8 module names
    When the user enters "<userType>" information
    Then the user should see the following modules:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

  @B31G2-212
  Scenario: Verify that Truck Drivers see 4 module names
    When the user enters "Truck Driver" information
    Then the Truck Driver user should see the following modules:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


