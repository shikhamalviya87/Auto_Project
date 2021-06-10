Feature: GET Functionality
  Scenario: 1To test the GET Method
    Given the user has valid URI
    When the user pass the GET method request
    Then the user should get status code as "200"

    Scenario: 2To test the body of the GET Response
      Then verify the body of GET Response

      Scenario: 3 To test the status code when the user update the body
        When the user verifies the "PUT" request by passing json data
        Then the user should get updated successfully with status code as "2xx"
