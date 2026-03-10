Feature: automate checkbox

  Scenario: automate chekcbox on my demo
    Given go to url"https://demoqa.com/elements"
    Then click elements
    And choice tesbox
    And input fullname "Oumarou"
    And input email "traoreoumarou97@gmail.com"
    And input currentadress "traoreoumarou97@gmail.com"
    And input permanent adress "traoreoumarou97@gmail.com"
    Then click button submit
    And verify the message to :
      | Name           | Oumarou                   |
      | Email          | traoreoumarou97@gmail.com |
      | Current Address| traoreoumarou@gmail.com |
      | Permanent Address | tooumarou@gmail.com |