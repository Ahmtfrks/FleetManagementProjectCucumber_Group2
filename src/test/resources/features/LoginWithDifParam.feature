@loginWithDifferentParam
Feature: Login as a different future

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: Truck Driver, Store Manager, Sales Manage

  Background: For all scenarios user is on the login page of the fleet management application
    Given the user is on the login page

  Scenario: login as a driver user
    When the user logs in using "user1" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"


  Scenario: login as a store manager user
    When the user logs in using "storemanager51" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

  Scenario: login as a sales manager user
    When the user logs in using "salesmanager101" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"
