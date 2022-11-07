Feature: Wikipedia Search Functionality and verification
  Scenario: Wikipedia Search FunctionalityTitle Verification
    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title
@wip @smoke
  Scenario: Wikipedia Search FunctionalityTitle Verification
    Given User is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box and clicks enter
    And User clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title
