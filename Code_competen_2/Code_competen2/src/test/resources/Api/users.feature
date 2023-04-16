Feature: users

  @usersA
  Scenario: GET - As admin I can get user details
    Given I set the GET api endpoint for the user
    When I am sending HTTP Api GET requests for users
    And I received a valid HTTP response code 200 for Get All data users
    Then I received valid data for user details

  @usersB
  Scenario: POST - As admin I have been able to create new users
    Given I set the POST endpoint users
    When I send POST HTTP request users
    And I received a valid HTTP response code 200 on the users
    Then I received valid data for new user

  @usersC
  Scenario: PUT - As admin I need to be able to update existing users
    Given I set PUT endpoints users
    When I send PUT HTTP request users
    And I receive valid HTTP response code 200 on the users
    Then I received valid data for an existing user

  @userD
  Scenario: DELETE- As admin I have be able to to delete existing user
    Given I set DELETE endpoints users
    When I send DELETE HTTP request users
    And I received a valid HTTP response code 200 on a product DELETE users


