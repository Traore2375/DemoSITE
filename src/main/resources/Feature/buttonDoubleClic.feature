Feature:  Automate Action CLICK

  Scenario: Action double click

    Given connect to system "https://demoqa.com/buttons"
    When you show the page double clic button
    Then verify that message is "You have done a double click"

  Scenario: Right click
      When you show the page click Right

  Scenario: Click me
        When  you show the page click me
