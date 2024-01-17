@B31G2-204
Feature:Create A Calender Event

  Background:
    Given the user is on the login page


Scenario Outline:Verify that User Can Login and Create a calender Event

When  the user enters "<userType>" information
Then user clicks on the activities dropdown button
Then  user  selects the Calendar events option
And user clicks on Create an Event Button
Then  user would like to type a message into the Description field.
Then user Driver would like to create a calendar event that's on repeat.

Examples:
    | userType      |
    | Sales Manager |
    | Store Manager |
    | Truck Driver  |