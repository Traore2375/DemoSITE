Feature: download and upload

  Scenario: automate download file dans upload

    Given i connect on url "https://demoqa.com/upload-download"
    When  click button download
    And click button choose file
    And chose on your pc
    Then import into system