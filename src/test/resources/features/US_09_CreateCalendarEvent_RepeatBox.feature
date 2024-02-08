@B31G2-225
Feature: As a user, I should see error messages when I enter an invalid integer number into the calendar Repeat Every input box.

  Background:
    Given the user is on the login page

  @B31G2-223
  #Store_SalesManager
  Scenario Outline: Verify that <userType> see error messages when enter invalid integers.
  If enter less than 1 —> users should see "The value have not to be less than 1."
  If enter more than 99 —> users should see "The value have not to be more than 99."
    When the user enters "<userType>" information
    And the user navigates to to Activities to Calendar Events
     And the user clicks create calendar event
     And the user checks Repeat checkbox
     And the user enter the value 134 Calendar event Repeat Every field
     Then the user should be able to see the error message as "The value have not to be more than 99."
     And the user enter the value -2 Calendar event Repeat Every field
     Then the user should be able to see the error message as "The value have not to be less than 1."
    Examples:
      | userType      |
      | Sales Manager |
      | Store Manager |



    @B31G2-224
    #TruckDriver
  Scenario: Verify that Truck Driver see error messages when enter invalid integers.
  If enter less than 1 —> users should see "The value have not to be less than 1."
  If enter more than 99 —> users should see "The value have not to be more than 99."
    When the user enters "Truck Driver" information
    And the TDriver navigates to to Activities to Calendar Events
    And the TDriver clicks create calendar event
    And the TDriver checks Repeat checkbox
    And the user enter the value 134 Calendar event Repeat Every field
    Then the user should be able to see the error message as "The value have not to be more than 99."
    And the user enter the value -2 Calendar event Repeat Every field
    Then the user should be able to see the error message as "The value have not to be less than 1."








