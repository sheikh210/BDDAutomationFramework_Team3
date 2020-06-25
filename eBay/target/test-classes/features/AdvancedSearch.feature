@AdvancedSearch
Feature: Validate user can search for item using keywords

  Background: Navigate to Advanced Search Page
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Advanced Search button


  Scenario Outline: User should be able to search for an item by entering keyword, and selecting a category
    And user inputs "<keyword>" in Keywords field
    And user selects "<category>" from Category dropdown
    And user clicks Search button
    Then user should be navigated to "<pageTitle>" page

    Examples:
      | keyword        | category                      | pageTitle                                 |
      | jersey         | Clothing, Shoes & Accessories | jersey in Fashion \| eBay                 |
      | hand sanitizer | Everything Else               | hand sanitizer in Everything Else \| eBay |
      | hand soap      | All Categories                | hand soap for sale \| eBay                |

