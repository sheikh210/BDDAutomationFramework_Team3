@AdvancedSearch-FindStores
Feature: Validate user can search for item using Advanced Search - Find Stores
  User should be able to search for item by store

  Background: Navigate to Advanced Search Page
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Advanced Search button

  Scenario Outline: User should be able to search for an item listed on eBay
  using the Find Store option within Advanced Search

    And user clicks on Find Stores button
    And user inputs "<storeName>" in Enter Store Name input field
    And user clicks Find Store Search button
    Then user should be navigated to "Search eBay Stores | eBay" page

    Examples:
      | storeName |
      | tech      |
      | pet       |
      | fly       |