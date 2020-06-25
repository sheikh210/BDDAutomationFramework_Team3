@SignUp

Feature: SignUp Multiple Clients

  Background: Clients input their information in signUp form

    Given Clients are in SignUp page



  Scenario Outline: Sign up multiple Clients

    Then Clients input "<firstName>"

    And Clients input "<lastName>"

    And Clients input "<mobilePhoneNumber>"

    And Clients inputs their "<eMail>"

    When Clients Click on submitButton

    Then Clients would see expectedText

    Examples:

      | firstName | lastName  | mobilePhoneNumber | eMail                    |
      | Sumon     | Miah      | 3474468850        | smhrdds@gmail.com        |
      | Mamun     | Miah      | 3473206633        | smhfds@gmail.com         |
      | Masud     | Miah      | 3474463350        | smhsdvdds@gmail.com      |
      | Adnan     | Miah      | 3273206633        | smhf5ds@gmail.com        |
      | Sumon     | Miazee    | 3474438850        | smhrdds@gmail.com        |
      | Mamun     | Miazee    | 3473206633        | smhfdsew@gmail.com       |
      | Razon     | Miazee    | 3474468854        | smhrwedds@gmail.com      |
      | Kanon     | Miazee    | 3473206333        | smhfdsds@gmail.com       |
      | Sumon     | Chowdhury | 3474460850        | smhr32dds@gmail.com      |
      | Mamun     | Raffie    | 3173206633        | smxhfds@gmail.com        |
      | Masud     | Parvez    | 3471463350        | smhdvdds@gmail.com       |
      | Adnan     | Sharif    | 3243206633        | smqahf5ds@gmail.com      |
      | Sumon     | Khan      | 3744387850        | smhrdds@gmail.com        |
      | Mamun     | khan      | 3473206433        | smhfdsew@gmail.com       |
      | Razon     | Sarker    | 3474462854        | smhrggfmndds@gmail.com   |
      | Kanon     | Rabbani   | 3400206333        | smhwdfbfdsds@gmail.com   |
      | Mamun     | Razzak    | 3093206433        | smhfdsexz@gmail.com      |
      | Razon     | Patwari   | 3476562854        | smhrgsafedds@gmail.com   |
      | Kanon     | Hasani    | 3432106333        | smhwcxzfdsds@gmail.com   |
      | Jabed     | Miadad    | 3432106553        | smhwcxzfdsrcds@gmail.com |