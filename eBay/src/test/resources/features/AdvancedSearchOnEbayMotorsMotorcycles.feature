@AdvancedSearch-OnEbayMotors-Motorcycles
Feature: Validate user can search for Motorcycles using Advanced Search - On Ebay Motors
  User should be able to search for a Motorcycle
  by selecting vehicle type, vehicle make, vehicle model and vehicle year,
  from the "On Ebay Motors" page

  Background:
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Advanced Search button

  Scenario Outline: User should be able to search for a motorcycle
  by selecting vehicle type, vehicle make, vehicle model, and vehicle year

    And user clicks on On Ebay Motors button
    And user selects "<vehicleType>" from Vehicle Type select menu
    And user selects "<vehicleMake>" from Vehicle Make dropdown
    And user selects "<vehicleModel>" from Vehicle Model dropdown
    And user inputs "<lowYear>" in From Year input field
    And user inputs "<highYear>" in To Year input field
    And user selects "<sort>" from Sort By field
    And user clicks On Ebay Motors Search button
    Then user should see "<vehicleMake>" to the left of vehicle search results


    Examples:
      | vehicleType | vehicleMake     | vehicleModel | lowYear | highYear | sort                    |
      | Motorcycles | Ducati          | Superbike    | 2008    | 2012     | Price: lowest first     |
      | Motorcycles | Harley-Davidson | Softail      | 2002    | 2018     | Distance: nearest first |
      | Motorcycles | Yamaha          | V Max        | 2009    | 2017     | Time: newly listed      |