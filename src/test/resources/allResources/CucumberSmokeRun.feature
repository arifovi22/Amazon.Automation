Feature: Amazon.com automation

  Background: I am on the Amazon Home page
    Given I am on the amazon home page

@Test1
  Scenario: I am on the Amazon Home page and validate the logo
    When I am on the amazon home page and validate the amazon logo

@Test2
  Scenario: I am searching on Amazon search box
    When I am searching pen in the search box and click search button
    Then  I landed on the search page I saw all the result of pen

  Scenario: I am click on specific pen
    When I select one of the pen from search result and click that pen
    Then I landed on the sepcific pen page

  Scenario: I validate the specific pen's price
    Then I validate the sepcific pens price
