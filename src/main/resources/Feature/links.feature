Feature: Automate links

  Scenario: Navigate with links text

    Given I launches page "https://demoqa.com/links"
    When i click links home
    Then the new page is show
    And verify the title page that is "Tools QA "