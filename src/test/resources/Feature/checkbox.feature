
Feature: Automation checkbox

  Scenario: Click checkbox
    Given go to checkbox section and click "https://demoqa.com/elements"
    And select button plus
    And click button desktop
    And choise notes
    And choise commands
    Then  verify that the message "commands notes desktop"
