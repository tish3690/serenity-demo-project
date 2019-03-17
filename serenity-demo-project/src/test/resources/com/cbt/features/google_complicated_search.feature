@search @STAYTEST_36
Feature: Google simple search
  As a user,
  when I seach for an item,
  then I should be able to see the results

  @books
  Scenario: Search for one item
    Given I search for selenium
    When I sort the results by Books
    Then results should only include books

    
      @books
  Scenario: Search last item
    Given I search for job
    When I sort the results by Books
    Then results should only include books