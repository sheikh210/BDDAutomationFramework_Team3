@AdvancedSearch-Price
Feature: Validate user can search for item using Advanced Search + Price limits
  User should be able to search by entering a keyword
  and selecting a category from the dropdown
  and selecting "Show items priced from" checkbox
  and entering minimum price
  and maximum price

  Background: Navigate to Advanced Search Page
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Advanced Search button

  Scenario Outline: User should be able to search for an item
  by entering keyword, selecting a category, and setting minimum/maximum price ranges
    And user inputs "<keyword>" in Keywords field
    And user selects "<category>" from Category dropdown
    And user selects 'Show Items Priced From' checkbox
    And user inputs "<minPrice>" in Minimum Price input field
    And user inputs "<maxPrice>" in Maximum Price input field
    And user clicks bottom Search button
    Then user should be navigated to "<pageTitle>" page
    And user should see "<priceRange>" above search results

    Examples:
      | keyword       | category             | minPrice | maxPrice | pageTitle                                | priceRange                  |
      | mixer         | Consumer Electronics | 50       | 200      | mixer in Electronics \| eBay             | US $50.00 - US $200.00      |
      | king mattress | Home & Garden        | 300      | 1000     | king mattress in Home and Garden \| eBay | US $300.00 - US $1,000.00   |
      | rolex         | Jewelry & Watches    | 1000     | 3000     | rolex in Jewelry and Watches \| eBay     | US $1,000.00 - US $3,000.00 |