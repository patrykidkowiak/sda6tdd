Feature: PostOffice scenatios

  Scenario: Should create a new user
    Given I instantiate PostOffice
    And I mock userStorage to return true when createUser method called
    When I create new user with nickname qwert
    Then User with nickname qwert is present