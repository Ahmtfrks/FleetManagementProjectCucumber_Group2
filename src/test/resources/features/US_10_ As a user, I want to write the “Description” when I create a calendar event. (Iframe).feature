@B31G2-204
Feature: As a user, I want to write the “Description” when I create a calendar event. (Iframe)

  #@B31G2-200
  Background:Given the user successfully logs into Fleet Management Home Page.

  @B31G2-201
  Scenario:Login as a Driver
    When A Driver creates a calendar event.
    Then Driver wants to be able to type into the Description field.
    And Verify that Driver can type messages in to the Description field on the Calendar Events page.

  @B31G2-202
  Scenario: Login as a Store Manager
    When Store Manager create a calendar event.
    Then Store Manager wants to be able to type into the Description field.
    And Verify that Store Manager can type messages in to the Description field on the Calendar Events page.

  @B31G2-203
  Scenario: Login as a Sales Manager
    When Sales Manager create a calendar event.
    Then Sales Manager wants to be able to type into the Description field.
    And Verify that Sales Manager can type messages in to the Description field on the Calendar Events page.