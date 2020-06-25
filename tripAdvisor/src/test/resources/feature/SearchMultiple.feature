@SearchMultiple
Feature: searching  Multiple Places

  Background:

    Given visitor at TripAdvisor Homepage


  Scenario Outline: search multiple Places
    And visitor inputs "<keyWord>" in the keyword field
    When visitor clicks on first search result button
    Then visitor should see "<ExpectedOutcome>"

    Examples:
      | keyWord    | ExpectedOutcome |
      | Dhaka City | Dhaka City      |
      | Dubai      | Dubai           |
      | Singapore  | Singapore       |
      | Florida    | Florida Keys    |