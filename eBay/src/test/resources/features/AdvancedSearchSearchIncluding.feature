@AdvancedSearch-SearchIncluding
Feature: Validate user can search for item using Advanced Search + Search Including Checkbox
  User should be able to search by entering a keyword
  and selecting a category from the dropdown
  and selecting a checkbox within the "Search Including" section

  Background:
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Advanced Search button

  Scenario Outline: User should be able to search for an item
  by entering keyword, selecting a category and checking "Search Including" checkbox

    And user inputs "<keyword>" in Keywords field
    And user selects "<category>" from Category dropdown
    And user selects "<checkbox>" from Search Including section
    And user clicks bottom Search button
    Then user should be navigated to "<pageTitle>" page


    Examples:
      | keyword      | category                  | checkbox              | pageTitle                                     |
      | iphone       | Cell Phones & Accessories | Title and Description | iphone in Cell Phones and Accessories \| eBay |
      | cat food     | Pet Supplies              | Completed listings    | cat food in Pet Supplies \| eBay              |
      | toddler toys | Baby                      | Sold listings         | toddler toys in Baby \| eBay                  |
