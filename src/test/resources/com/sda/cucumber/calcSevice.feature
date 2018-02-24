Feature: CalcService

  Scenario: Should Add Digits In String And Produce Result
    Given I initialize CalcService
    And I pass text value to compute
    When I execute calculate method
    Then I get correct result

  Scenario: Shoult return 0 when null text i passed
    Given I initialize CalcService
    And I pass null text value
    When I execute calculate method
    Then I get 0 as result

  Scenario: Shoult return 0 when space text i passed
    Given I initialize CalcService
    And I pass space text value
    When I execute calculate method
    Then I get 0 as result