Feature: User should be able to search home prices

  Background:
    Given user is at Real Estate Center page

  Scenario Outline: User should be able to search for home prices & trends
  by entering home address in search input on Real Estate Center page
    And user clicks Home Value button in Home Search interface
    And user inputs "<searchTerm>" in search input
    And user clicks on search result corresponding to "<searchTerm>" in dropdown results
    And user switches to newly opened tab
    Then user should be navigated to partner site with page title "Find out how much your home is worth at Bank of America"
    And user should see "<searchTerm>" to the left of property picture

    Examples:
      | searchTerm                                 |
      | 27926 148th Pl, Duvall, WA 98019           |
      | 1311 Timber Ct, Murrells Inlet, SC 29576   |
      | 10925 Owensmouth Ave, Chatsworth, CA 91311 |