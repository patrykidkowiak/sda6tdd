Feature: CalcService

  Scenario: Should Add Digits In String And Produce Result
    Given I initialize CalcService
    And I pass text value to compute
    When I execute calculate method
    Then I get correct result

  Scenario: Should return 0 when null text i passed
    Given I initialize CalcService
    And I pass null text value
    When I execute calculate method
    Then I get 0 as result

  Scenario: Should return 0 when space text i passed
    Given I initialize CalcService
    And I pass space text value
    When I execute calculate method
    Then I get 0 as result

  Scenario: Should return 0 when blank text i passed
    Given I initialize CalcService
    And I pass blank text value
    When I execute calculate method
    Then I get 0 as result

  Scenario: Should Add Digits In String And Produce Result
    Given I initialize CalcService
    And I pass text with letters value
    When I execute calculate method
    Then I get correct result for text with letters

  Scenario Outline: Should check mixed values
    Given I initialize CalcService
    And I pass <text> value
    When I execute calculate method
    Then I get <result> as result
    Examples:
      | text                        | result |
      | 2 jablka;3jajka;5ziemniakow | 10     |
      | 3a;2;4;5b                   | 14     |
