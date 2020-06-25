@FindAForm
Feature: user are in Homepage

  Background: User click on Find A Form
    Given user are in Find A Form page

  Scenario:
    And user clicks on tri angle One button
    When user click on Online provider button
    Then user would see Request Changes to Provider Data page


  Scenario:
    And user clicks on tri angle One button
    When user click on Online provider button
    Then user would see expected Text


  Scenario:
    When user click on Behavioral Health Precertification
    Then user would see ABA Request Button


  Scenario:
    When user click on Behavioral Health Precertification
    And user click on ABA Request Button
    Then user will see the page

  Scenario:
    When user click on Behavioral Health Precertification
    Then user would see Transcranial Magnetic Stimulation Button


  Scenario:
    When user click on EAP menu button
    Then user will see Dispute Resulation Request is displayed