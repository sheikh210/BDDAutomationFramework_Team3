Feature: User should be able to search home listings on partner sites

  Background:
    Given user is at Real Estate Center page

  Scenario Outline: User should be able to search for available home listings by entering city
  in search input on Real Estate Center page
    And user inputs "<searchTerm>" in search input
    And user clicks on search result corresponding to "<searchTerm>" in dropdown results
    And user clicks Continue in modal container to be navigated to partner site
    Then user should be navigated to partner site with page title "Listing Search Form - Search for Real Estate Properties | Real Estate Center | Homepage"
    And user should see "<searchTerm>" in filter tag next to search bar

    Examples:
      | searchTerm    |
      | New York City |
      | Los Angeles   |
      | Austin        |