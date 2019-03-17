@search 
Feature: Google simple search
  As a user,
  when I seach for an item,
  then I should be able to see the results



      @books @runthis
  Scenario: Search second item
    Given I search for serenity
    When I sort the results by Books
    Then results should only include books
    
    

      @books @skip
  Scenario: Search second item
    Given I quietly search for serenity
    When I sort the results by Books
    Then results should only include books
    