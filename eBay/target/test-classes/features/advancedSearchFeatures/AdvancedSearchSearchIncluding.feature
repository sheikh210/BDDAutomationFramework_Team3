#@AdvancedSearchSearchIncluding
#Feature: Validate user can search for item using keywords and checking "Search Including" box
#
#  Background:
#    Given user is at Ebay Homepage www.ebay.com
#    When user clicks on Advanced Search button
#
#  Scenario Outline: User should be able to search for an item
#  by entering keyword, selecting a category and checking "Search Including" checkbox
#
#    And user inputs "<keyword>" in Keywords field
#    And user selects "<category>" from Category dropdown
#    And user select "<checkbox>" from Search Including section
#    And user clicks bottom Search button
#    Then user should be navigated to "<pageTitle>" page
#
#
#    Examples:
#      | keyword        | category                      | checkbox              | pageTitle                                |
#      | jersey         | Clothing, Shoes & Accessories | Title and Description | jersey in Fashion \| eBay                |
#      | hand sanitizer | Everything Else               | Completed listings    | hand sanitizer in Everything Else \|eBay |
#      | hand soap      | All Categories                | Sold listings         | hand soap for sale \| eBay               |
