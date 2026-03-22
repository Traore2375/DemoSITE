
Feature: input test data with excel file

  Scenario: use excel file to test the forms

    Given go to site demo "https://demoqa.com/login"
    And give the "login" and password " password"
    And click bouton new user
    When the page register appear
    And insert the "firstname" and "lastname" and "username" and "password"
    And click on button register
    And click back login
    Then the page login is appear
