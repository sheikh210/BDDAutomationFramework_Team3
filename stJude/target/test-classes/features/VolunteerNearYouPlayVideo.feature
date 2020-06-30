@VolunteerNearYou-Video
Feature: Validate user can play embedded video on Volunteer Near You page

  Background:
    Given user is on St. Jude Volunteer Near You page

  Scenario: User should be able to play embedded video on Volunteer Near You page

    When user clicks play button on embedded video
    Then user should be able to pause video while it's playing