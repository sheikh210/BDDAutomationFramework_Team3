@HelpPage
Feature: Validate Help & Contact page

  Background:
    Given user is at Ebay Homepage www.ebay.com
    When user clicks on Help & Contact button

  Scenario: User should be able to input text in search box and search for a specific topic

    And user inputs "Return an item for a refund" in search field
    And user selects specific topic from suggested topics
    Then user should be navigated to "Return an item for a refund | eBay"


  Scenario: :User should be able to click "Sign in" button.
    And user clicks on Sign in
#    Then user should be navigated to "Security Measure"
    Then  user should see please verify your self to continue

  Scenario: user should be able to click "Register" button
    And user click register button
    Then user should see please verify your self to continue


  Scenario: user should be able to click popular article
    And user click on Additional Support during COVID19
    Then user should be navigated to "Additional support during COVID-19 for buyers and sellers | eBay"


  Scenario: user should be able to click on buying as a guest
    And user clicks on buying as a guest
    Then user should be navigated to "Buying as a guest | eBay"


  Scenario Outline: user should be able to browse HelpArticles
    And user clicks on "<HelpArticles>"
    Then user should be navigated to "<PageTitle>"
    Examples:
      | HelpArticles        | PageTitle                   |
      | Returns & Refunds   | Returns & Refunds \| eBay   |
      | Shipping & Tracking | Shipping & Tracking \| eBay |
      | Selling             | Selling \| eBay             |
      | Buying              | Buying \| eBay              |
      | Account             | Account \| eBay             |
      | Fees & Invoices     | Fees & Invoices \| eBay     |


  Scenario: user should be able to click contact us button
    And user clicks on contact us button
    Then user should be navigated to "Call Us | eBay"

  Scenario: user should be able to report an item that has not arrived
    And user click on Report and item that hasn't arrived
    Then user should see please verify your self to continue

    Scenario: user should be able to start a return
      And user clicks on Start a return
     Then user should see please verify your self to continue

    Scenario: user should be able to click AboutEbay in footer section
      And user clicks on About Ebay 
      Then user should be navigated to "About eBay: Company Info, News, Careers, Investor Relations"

    Scenario: user should be able to click Announcement
    And user clicks Announcements
    Then user should be navigated to "Announcements - The eBay Community"
    
    Scenario: user should be able to click Community in footer section
      And user clicks on Community
      Then user should be navigated to "Home - The eBay Community"
      
      Scenario: User should be able to click Security center in footer section
        And user clicks on security center
        Then user should be navigated to "eBay Security Center"
        
        Scenario:user should be able to click resolution center in footer section
          And user clicks on resolution center
          Then user should be navigated to "Resolution Center - eBay"
          



