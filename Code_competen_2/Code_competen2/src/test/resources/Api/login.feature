Feature: as a user I can login

  Scenario: POST - I as a user successfully logged in
    Given I set POST endpoints
    When I send POST HTTP request
    And I receive valid HTTP response code Login 200
    Then I received the correct data

