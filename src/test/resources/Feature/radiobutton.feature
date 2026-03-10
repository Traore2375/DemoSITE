Feature: automate radio button

  Scenario: go to radio button

    Given  search button radio "https://demoqa.com/elements"
    When I see button radio click
    And choice the button yes
    Then verify that message "Yes" is correct