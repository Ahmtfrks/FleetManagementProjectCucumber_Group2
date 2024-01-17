Feature: Access to select vehicles
  User Story : As a user, when I am in the vehicle module i can select and unselect the vehicle checkboxes.

  Background:
    Given the user is on the login page

  Scenario Outline: As a user (Sales and Store manager),I should be able to select any vehicle from the Vehicles page
    And the user enters "<user Type>" information
    When users navigates to "Fleet" and "Vehicles" modules
    Then users should see all checkboxes as unchecked
    Examples:
      | user Type     |
      | Sales Manager |
      | Store Manager |



    Scenario Outline: Verify the checkboxes
      And the user enters "<user Type>" information
      When users navigates to "Fleet" and "Vehicles" modules
      And Verify that users can check the first checkbox to select all the cars
      Examples:
      |user Type|
      |Sales Manager|
      |Store Manager|
  @ahmad
      Scenario Outline: Verify users can select any car
        And the user enters "<user Type>" information
        When users navigates to "Fleet" and "Vehicles" modules
        Then users can select any car
        Examples:
          |user Type|
          |Sales Manager|
          |Store Manager|

