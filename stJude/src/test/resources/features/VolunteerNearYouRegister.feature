@VolunteerNearYou-Register
Feature: Validate user can submit volunteer application
  User should be able to register to become a volunteer with St. Jude

  Background:
    Given user is on St. Jude Volunteer Near You page
    When user clicks on Register To Volunteer button

  Scenario Outline: User should be able to fill out application
  and register to apply to become a volunteer with St. Jude

    And user switches to the newly opened tab with title "Volunteer at a Local Event - St. Jude Children's Research Hospital"
    And user inputs "<firstName>" in First Name input field
    And user inputs "<lastName>" in Last Name input field
    And user clicks Calendar button Date of Birth input field
    And user clicks Left Arrow in calendar header section
    And user clicks "<yearRow>""<yearCell>" to select year
    And user clicks "<monthRow>""<monthCell>" to select month
    And user clicks "<dayRow>""<dayCell>" to select day
    And user selects "<ethnicity>" from Ethnicity dropdown
    And user selects "<gender>" from Gender dropdown
    And user inputs "<streetAddress>" in Street Address input field
    And user inputs "<city>" in City input field
    And user selects "<state>" from State dropdown
    And user inputs "<zipcode>" in Zip Code input field
    And user inputs "<phoneNumber>" in Primary Phone input field
    And user selects "<phoneType>" from Phone Type dropdown
    And user enters "<emailAddress>" in Email input field
    And user enters "<password>" in Password input field
    And user enters "<password>" in Verify Password input field
    And user clicks Waiver Agreements button
    And user clicks checkbox to agree to Release and Waiver of Liability
    And user clicks Submit Application button
    Then user should be navigated to url "https://volunteer.stjude.org/custom/515/#/registration_success"
    And user should see "Thank you for registering as a volunteer!"
    And user should see "Hello, ""<firstName>" in top right of header

    Examples:
      | firstName | lastName | yearRow | yearCell | monthRow | monthCell | dayRow | dayCell | ethnicity            | gender | streetAddress         | city         | state          | zipcode | phoneNumber | phoneType           | emailAddress   | password    |
      | Sam       | Shake    | 2       | 5        | 1        | 2         | 2      | 7       | Asian-American       | Male   | 89 North Helen Avenue | West Babylon | New York       | 11704   | 7185643216  | Personal - Cell     | pnt10@piit.pnt | Fo!3l$5pNrR |
      | Elyamine  | Adjoudj  | 2       | 3        | 4        | 3         | 5      | 2       | Middle-Eastern       | Male   | 33 Sherwood Street    | Helotes      | Texas          | 78023   | 5665855066  | Business - Cell     | pnt11@piit.pnt | cRiJ$309lKm |
      | Kazi      | Maoya    | 4       | 1        | 2        | 1         | 4      | 5       | Other                | Female | 98 Rockaway Ave.      | Glenside     | Pennsylvania   | 19038   | 6655566655  | Home - Landline     | pnt12@piit.pnt | vB20@9*nMqZ |
      | Davis     | Michael  | 3       | 5        | 3        | 2         | 1      | 6       | Prefer Not to Answer | Male   | 63 Bishop Dr.         | Sumter       | South Carolina | 29150   | 3035894211  | Business - Landline | pnt13@piit.pnt | lIu3)e!eWrP |
      | Mahmudul  | Hasan    | 4       | 3        | 2        | 3         | 4      | 4       | Lebanese             | Male   | 25 Old Lake St.       | Matawan      | New Jersey     | 07747   | 6468961245  | Personal - Cell     | pnt14@piit.pnt | oE2#fh56NsQ |