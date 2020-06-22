@AdvancedSearch-OnEbayMotors-CarsAndTrucks
Feature: Validate user can search for Cars & Trucks using Advanced Search - On Ebay Motors
  User should be able to search for a Car or Truck
  by selecting vehicle type, vehicle make, vehicle model, vehicle year,
  and vehicle transmission from the "On Ebay Motors" page

  Background:
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Advanced Search button

  Scenario Outline: User should be able to search for a car or a truck
  by selecting vehicle type, vehicle make, vehicle model, vehicle year,
  and vehicle transmission

    And user clicks on On Ebay Motors button
    And user selects "<vehicleType>" from Vehicle Type select menu
    And user selects "<vehicleMake>" from Vehicle Make dropdown
    And user selects "<vehicleModel>" from Vehicle Model dropdown
    And user inputs "<lowYear>" in From Year input field
    And user inputs "<highYear>" in To Year input field
    And user selects "<transmission>" from Vehicle Transmission dropdown
    And user selects "<sort>" from Sort By field
    And user clicks On Ebay Motors Search button
    Then user should see "<vehicleMake>" to the left of vehicle search results


    Examples:
      | vehicleType   | vehicleMake  | vehicleModel | lowYear | highYear | transmission | sort                 |
      | Cars & Trucks | BMW          | M3           | 2010    | 2020     | Manual       | Best Match           |
      | Cars & Trucks | Porsche      | 911          | 2015    | 2018     | Automatic    | Price: highest first |
      | Cars & Trucks | Aston Martin | DB9          | 2008    | 2016     | Any          | Time: newly listed   |