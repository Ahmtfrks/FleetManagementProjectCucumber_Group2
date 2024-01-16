@B31G2-193
Feature:  As a user, I want to create a recurring (repetitive) calendar event

  Background:
    When user is on Fleet Management home page
    Then user clicks on Activities and chooses Calender Events
    Then user clicks on Creat Calender Event
    Then user marks the Repeat


  @B31G2-193-1
  Scenario: Verify that users see the number “1” by default in the Repeat Every input option.
    And  Verify that the Default value for REPEAT_EVERY is 1



  @B31G2-193-2
  Scenario: Verify that users see the error message “This value should not be blank.”
  when the Calendar event Repeat Every field is cleared (delete the number 1).
    When user the trying to Creat Calender Event
    Then verify that REPEAT_Every Value can not be Blank or Zero