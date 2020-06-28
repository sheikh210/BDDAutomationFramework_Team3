@VolunteerNearYou-SearchOpportunities
Feature: Validate user can search for local volunteer opportunities

  Background:
    Given user is on St. Jude Volunteer Near You page
    When user clicks on Search Volunteer Opportunities button

  Scenario Outline: User should be able to search for local volunteer opportunities
  by location (city/zipcode), distance and keyword

    And user switches to the newly opened tab
    And user inputs "<zipcodeOrCity>" in Location input field
    And user selects "<distance>" from Distance dropdown
    And user clicks Search button
    Then user should see "Opportunity Search" on top left

    Examples:
      | zipcodeOrCity | distance    |
      | 11501         | 25 miles    |
      | Los Angeles   | 50 miles    |
      | Baltimore     | Exact Match |
      | Boston        | 100 miles   |
      | New York City | 5 miles     |
      | 60007         | 10 miles    |