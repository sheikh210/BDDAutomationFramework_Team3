@VolunteerNearYou-SearchRegional
Feature: Validate user can search for regional offices

  Background:
    Given user is on St. Jude Volunteer Near You page

  Scenario Outline: User should be able to search for St. Jude regional offices
  by typing in the name of the state in which they live

    When user inputs "<state>" in search input field
    And user clicks on "<state>" in the dropdown that appears
    Then user should see "<state>" on the next page

    Examples:
      | state        |
      | New York     |
      | California   |
      | Florida      |
      | Texas        |
      | Georgia      |
