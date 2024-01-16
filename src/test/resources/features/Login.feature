@login
Feature: Fleet management login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: Truck Driver, Store Manager, Sales Manager

  @first
  Scenario: Login as a Truck Driver
    When the user enters Truck Driver information
    Then the user should see the dashboard

  Scenario: Login as a Store Manager
    When the user enters Store Manager information
    Then the user should see the dashboard

  Scenario: Login as a Sales Manager
    When the user enters Sales Manager information
    Then the user should see the dashboard
