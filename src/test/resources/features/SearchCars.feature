@Search
Feature: Validate search car is working


  Scenario: Search new and used car
    Given I am on the home page of cars guide
    When I click on menu and click on Search cars
    And select car brand as "Ford" from Anymake dropdown
    And select car model as "Cougar" from model dropdown
    And select location as "NSW - Hunter" from location dropdown
    Then I click on Find my new car
    #And validate the title 


