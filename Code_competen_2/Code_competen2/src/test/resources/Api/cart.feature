@cart
Feature: cart
  Scenario: GET - I as an admin can add and edit products
    Given I set the GET api endpoint
    When I am sending HTTP Api GET request
    Then I received a valid HTTP response code 200 for Get All data Cart
    And I received valid data for all carts

  @cartB
  Scenario: POST - As admin I have been able to create new cart
    Given I set the POST endpoint cart
    When I send POST HTTP request cart
    And I received a valid HTTP response code 200 on the cart
    Then I received valid data for new cart

  @cartC
  Scenario: PUT - As admin I need to be able to update existing cart
    Given I set PUT endpoints cart
    When I send PUT HTTP request cart
    And I receive valid HTTP response code 200 on the cart
    Then I received valid data for an existing cart

  @cartD
  Scenario: DELETE- As admin I have be able to to delete existing cart
    Given I set DELETE endpoints cart
    When I send DELETE HTTP request cart
    And I received a valid HTTP response code 200 on a product DELETE cart