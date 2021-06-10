
Feature: Flight Booking functionality
  Scenario: To test the flight registration page
    Given user logged into site
    Then the "Welcome to the Simple Travel Agency!" page should be displayed
    And the user should be able to see the below drop downs:
    |Drop Downs|
    |CHOOSE YOUR DEPATURE CITY|
    |CHOOSE YOUR DESTINATION CITY|
    And the "Find Flights" button should be displayed and enabled

  Scenario: 2 Verify the user should be able to see correct departure and destination cities while choosing flight
    When the user select <depature city> option from "Choose Your Deapture City" drop down
    And the user select <destination city> option from "Choose Your Destination City" drop down
    And click on "Find Flight" button
    Then the user should be able to see the flights list for respective selection of cities


  Scenario: 3 Verify the user should be able to reserve flight successfully
      When the user select <depature city> option from "Choose Your Deapture City" drop down
      And the user select <destination city> option from "Choose Your Destination City" drop down
      And click on "Find Flight" button
      Then the user should be able to see the flights list for respective selection of cities
      When the user select one option
      Then the user should get navigated to passenger details page
      When user enters the details
      And click on "Purchase Flight" button
      Then the user should get flight reserved successfully and confirmation id should be displayed

      Scenario: 4 Verify that the user shouldnot be able to book flight without providing name and credit card details
        When the user select <depature city> option from "Choose Your Deapture City" drop down
        And the user select <destination city> option from "Choose Your Destination City" drop down
        And click on "Find Flight" button
        Then the user should be able to see the flights list for respective selection of cities
        When the user select one option
        Then the user should get navigated to passenger details page
        When user enters the details without providing "Name" and "CREDIT CARD" details
        And click on "Purchase Flight" button
        Then the user shouldnot get flight reserved

  Scenario: 5 Verify that the user shouldnot be able to book flight with same details again
    When the user select <depature city> option from "Choose Your Deapture City" drop down
    And the user select <destination city> option from "Choose Your Destination City" drop down
    And click on "Find Flight" button
    Then the user should be able to see the flights list for respective selection of cities
    When the user select one option
    Then the user should get navigated to passenger details page
    When user enters the details
    And click on "Purchase Flight" button
    Then the user shouldnot get flight reserved

  Scenario: 6 Verify the user shouldnot be able to reserve flight successfully for another flight with exact same details
    When the user select <depature city> option from "Choose Your Deapture City" drop down
    And the user select <destination city> option from "Choose Your Destination City" drop down
    And click on "Find Flight" button
    Then the user should be able to see the flights list for respective selection of cities
    When the user select "second" option
    Then the user should get navigated to passenger details page
    When user enters the details
    And click on "Purchase Flight" button
    Then the user shouldnot get flight reserved

  Scenario: 7 Verify the user shouldbe able to reserve all flights successfully
    When the user select <depature city> option from "Choose Your Deapture City" drop down
    And the user select <destination city> option from "Choose Your Destination City" drop down
    And click on "Find Flight" button
    Then the user should be able to see the flights list for respective selection of cities
    When the user select "all" options one by one
    And user enters the details
    Then the user should get flight reserved successfully

  Scenario: 8 Verify the user should be able to select and book flights for any combination of cities
    When the user select <depature city> option from "Choose Your Deapture City" drop down
    And the user select <destination city> option from "Choose Your Destination City" drop down
    And click on "Find Flight" button
    Then the user should be able to see the flights list for respective selection of cities
    When the user select "one" option
    And user enters the details
    Then the user should get flight reserved successfully








