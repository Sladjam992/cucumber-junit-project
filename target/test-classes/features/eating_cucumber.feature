Feature: Eating too many cucumbers may not be good for you
  user story: Easting too much of anything may not be good for you

  Scenario: Eating a few is not a problem.
    Given Jhon is hungry.
    When he eats some cucumbers
    Then he will be full.