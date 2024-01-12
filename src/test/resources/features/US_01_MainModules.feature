Feature: Access to all main modules of the application
  User Story: As a user, when I'm on the login page of the fleet management application
  I should be accessing all the main modules of the app.

  User Story :
  As a user, I should be accessing all the main modules of the app.

  AC #1: Verify that Store and Sales managers see 8 module names
  Expected module names:
  Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

  AC #2:
  Verify that ** Drivers see 4 module names.
  Expected module names:
  Fleet, Customers, Activities, System

  Scenario Outline: All ain Modules
    Given the user is on the login page
    When the user enters "<userType>" information
    Then the user that are Store and Sales managers see 8 <module> names
    |Dashboards|
    |Fleet|
    |Customers|
    |Sales|
    |Activities|
    |Marketing|
    |Reports & Segments|
    |System|
    Examples:
    |userType|
    |Store Manager|
    |Sales Manager|

    Scenario: All ain Modules
      Given the user is on the login page
      When the user enters "<Truck Driver>" information
      Then the user that is Truck Driver sees 4 <module> names
        |Fleet|
        |Customers|
        |Activities|
        |System|


