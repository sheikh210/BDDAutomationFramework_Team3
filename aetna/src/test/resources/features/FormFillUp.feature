@SmokeTest
Feature: user are in Homepage

  Background:
    Given user are in home page


  Scenario Outline:

    When user click on Find a form button

    Then user click on Network Application Requests menu
    And user click on Medical requests Button
    And user write last name in the field "<lastName>"
    And user write first name in the field "<firstName>"
    And user write month of birth in the field"<dayOfBirth>"
    And user write date of birth in the field"<monthOfBirth>"
    And user write year of birth in the field"<yearOfBirth>"
    And user write Email in the field"<eMail>"
    And user write again Email in the field"<confirmEmail>"
    And user click on tax type button
    And user select Select social security button
    And user click on Specialist button
    When user click on submit button
    Then user will see the text

    Examples:
      | lastName | firstName | dayOfBirth | monthOfBirth | yearOfBirth | eMail              | confirmEmail       |
      | Rash     | Sarker    | 20         | 06           | 1985        | smh@gmail.com      | smh@gmail.com      |
      | Kazi     | Maoya     | 23         | 06           | 1990        | kazi@gmail.com     | kazi@gmail.com     |
      | Hasan    | Salim     | 05         | 12           | 1945        | hasan@gmail.com    | hasan@gmail.com    |
      | Alamgir  | Kabir     | 16         | 11           | 1979        | alamgir@gmail.com  | alamgir@gmail.com  |
      | Sima     | Hawlader  | 24         | 12           | 1975        | hawlader@gmail.com | hawlader@gmail.com |
      | Ripon    | Md A      | 30         | 10           | 1999        | ripon@gmail.com    | ripon@gmail.com    |
      | Hossain  | Tanvir    | 21         | 06           | 1990        | tanvir@gmail.com   | tanvir@gmail.com   |
      | Mostafa  | Suborna   | 31         | 01           | 1998        | suborna@gmail.com  | suborna@gmail.com  |
      | Hasan    | Tomal     | 30         | 07           | 1994        | tomal@gamail.com   | tomal@gmail.com    |
      | Abul     | Kalam     | 07         | 08           | 1977        | abul@gmail.com     | abul@Gmail.com     |
      | Sormila  | Farjana   | 09         | 11           | 1970        | sormila@gmail.com  | sormila@gmail.com  |
      | Boumiok  | Ruposri   | 03         | 02           | 1979        | ruposri@gmail.com  | ruposri@gmail.com  |
      | Moumita  | Kundo     | 09         | 11           | 1990        | moumita@Gmail.com  | moumita@gmail.com  |
      | Islam    | Borna     | 05         | 02           | 1970        | borna@gmail.com    | borna@gmail.com    |