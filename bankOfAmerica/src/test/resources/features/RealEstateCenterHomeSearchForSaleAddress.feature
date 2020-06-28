Feature: User should be able to search home listings on partner sites

  Background:
    Given user is at Real Estate Center page

  Scenario Outline: User should be able to search for available home listings by entering address
  in search input on Real Estate Center page
    And user inputs "<searchTerm>" in search input
    And user clicks on search result corresponding to "<searchTerm>" in dropdown results
    And user clicks Continue in modal container to be navigated to partner site
    Then user should be navigated to partner site with page title "<pageTitle>"

    Examples:
      | searchTerm                      | pageTitle                                                                    |
      | 172 Asbury Avenue, Freehold, NJ | 172 Asbury Avenue, Freehold, NJ 07728 \| MLS 22019875 \| Listing Information |
      | 503 San Jose St, Austin, TX     | 503 San Jose St, Austin, TX 78753 \| MLS 9950349 \| Listing Information      |
      | 1270 NE 82nd St, Miami, FL      | 1270 NE 82nd St, Miami, FL 33138 \| MLS A10474860 \| Listing Information     |
