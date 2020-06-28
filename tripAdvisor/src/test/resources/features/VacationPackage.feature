@VacationPackage
Feature:Validate vacation package
  As a user,I should be able to search for vacation
  Based on from,to,dates,guests,find packages

  Background:Navigate to Trip advisor homepage https://www.tripadvisor.com/

  Scenario Outline: As a user,I should be able to search for vacation package based on from,to,find package
    Given user is in trip advisor homepage
    When user clicks on more button
    Then user click on vacation package
    And user write departure place "<departurePlace>"
    And user write destination palce "<destinationPlace>"
    When user click on find packages
    Then user should see "<ExpectedText>"

    Examples:
      | departurePlace | destinationPlace | ExpectedText                 |
      | NewYork        | Dhaka            | Dhaka City Vacation Packages |
      | NewYork        | Hawaii           | Hawaii Vacation Packages     |
      | NewYork        | NewJersey        | New Jersey Vacation Packages |
      | NewYork        | India            | India Vacation Packages      |
      | NewYork        | Dubai            | Dubai Vacation Packages      |


