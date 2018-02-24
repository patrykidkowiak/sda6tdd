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