@CarsDirect
Feature: Cars validation

  Background: Open 'Cars Direct' main page
    Given I navigate to Cars Direct main page

  @Test
  Scenario: Verify that a car is listed or not according its Make
    Given I click "New Cars" option
      And select "Honda" as Make
    When I click 'Find Your Next Car' button
    Then the "Insight" model is listed

  @Test
  Scenario: Verify that a car is listed or not according its Vehicle type
    Given I click "New Cars" option
      And select "Honda" as Make
      And click 'Find Your Next Car' button
    When I select "Minivan/Van" Vehicle type
    Then the "Insight" model is not listed
