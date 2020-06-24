@CruisesSearch
Feature:Validate user can select a destination from Where to drop down
  and a Departure Month from Calender menu and clicking search.

  Background: Navigate to Cruises page
    Given user is at trip advisors homepage www.tripadvisor.com
    When user clicks More dropdown and selects Cruises option

  Scenario Outline: User should be able to search for cruises by select a destination from
  Where to drop down and a Departure Month from Calender menu
    And user selects "<destination>" from where to dropdown
    And user selects "<month>" from calender menu
    And user clicks Search button
    Then user should be navigated to "<pageTitle>" page

    Examples:
      | destination      | month       | pageTitle       |
      | Caribbean        | Jun         | Caribbean Cruises 2020 (from $219): Compare Best Deals on Cruises to Caribbean \| Cheap Caribbean Cruises - Tripadvisor |
      | Bahamas        | Jul         | Bahamas Cruises 2020 (from $99): Compare Best Deals on Cruises to Bahamas \| Cheap Bahamas Cruises - Tripadvisor |
      | Mexico        | Aug         | Mexico Cruises (2020): Compare Best Deals on Cruises to Mexico \| Cheap Mexico Cruises - Tripadvisor |
      | Alaska        | Sep         | Alaska Cruises 2020 (from $109): Compare Best Deals on Cruises to Alaska \| Cheap Alaska Cruises - Tripadvisor |
