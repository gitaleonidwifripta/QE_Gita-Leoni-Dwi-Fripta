Feature: user

  Scenario:  GET - As admin I have be able to get detail user
    Given I set the GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user


  Scenario: POST - As admin i have be able to create new user
    Given I set POST endpoint
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: PUT - As admin I have be able to update existing user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I received the correct HTTP response code which was 200
    And I receive valid data for existing user

  Scenario: DELETE - As admin I can delete data based on id
    Given I set DELETE endpoint
    When I sent the correct HTTP DELETE request
    Then I received the correct HTTP response code 200
    And I can delete data by id

