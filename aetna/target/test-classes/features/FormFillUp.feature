
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
| lastName | firstName | dayOfBirth | monthOfBirth | yearOfBirth | eMail          | confirmEmail  |
| Rash     | Sarker    | 20         | 06           | 1985        | smh@gmail.com  | smh@gmail.com  |
| Kazi     | Maoya     | 23         | 06           | 1990        | kazi@gmail.com | kazi@gmail.com |