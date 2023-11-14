Feature:  Creating primary account
  @US_13
  Scenario: Creating primary account with proper data
    Given user clicks on create primary account button
    And user enters email address "Bob@gmail.com"
    And user enters firstname "Bob" and lastname "Thompson"
    And user selects title "Mr."
    And user selects gender "Male"
    And user eneters Employment status "employed"
    And user selects marital status "Single"
    And user selects date of birth "03/03/1990"
    And user clicks on Create account
    Then new user should be created "Sign up your account"
    Given user enters Username "" and password "tek@1234" , and confirms password "tek@1234"
    And user clicks on submit button
