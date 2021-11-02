@CarsDirect
Feature: Cars validation

  Background: Open 'Cars Direct' main page
    Given I navigate to Cars Direct main page

  @Test
  Scenario: Verify that a car is listed or not according its Make and Vehicle type
    Given I click "New Cars" option
      And select "Honda" as Make
    When I click 'Find Your Next Car' button
    Then the "Insight" model is listed
      And select "Minivan/Van" Vehicle type
      And the "Insight" model is not listed
