Feature: Access to the Oroinc Documentation page
  User story: As a user, I should access to the Oroinc Documentation page. (Window handle)

  Background: For all scenarios user is on the Dashboard page of the fleet management application
    Given the user is on the Dashboard page

  @TruckDriver
  Scenario:Verify that users access to the Oroinc Documentation page by clicking the question mark icon
    When the user enters Truck Driver information
    Then the user should see the dashboard page and Fleet Management bar
    And the user click the GetHelp button on the Fleet Management bar
    And the new browser tab is open
    Then the user should see the Oroinc Documentation page

  @StoreManager
  Scenario:Verify that Store Manager access to the Oroinc Documentation page by clicking the question mark icon
    When the user enters Store Manager information
    Then the user should see the dashboard page and Fleet Management bar
    And the user click the GetHelp button on the Fleet Management bar
    And the new browser tab is open
    Then the user should see the Oroinc Documentation page

  @SalesManager
  Scenario:Verify that Sales Manager access to the Oroinc Documentation page by clicking the question mark icon
    When the user enters Sales Manager information
    Then the user should see the dashboard page and Fleet Management bar
    And the user click the GetHelp button on the Fleet Management bar
    And the new browser tab is open
    Then the user should see the Oroinc Documentation page