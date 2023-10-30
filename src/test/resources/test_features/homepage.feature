Feature: Positive testing the homepage
  @US_1
Scenario: Positive testing the homepage
  Given user opens the website user should see "TEK Insurance App" on the left side of the page
  And user should see the "Login" button on the right side of the page
  And user should see the color mode button on the right side of the page
  And user should see "Lets get you started" and "Don't have account with us??? lets create one" in the middle
  And user should see "Create Primary Account" in the middle of the screen
  And user should see "TEK Insurance App is a Customer Portal Web application" in the bottom
  And user should see "And Build and Activated for Learning Purpose only."
  And User should see the page title as "Tek Insurance UI"
  @US_2
  Scenario: testing if the body theme changes from light to dark
  Given user opens the website and clicks theme button on the right, the theme of the page should change to dark

  @US_3
  Scenario: logging it with correct user name and password
    Given user clicks on the login button
    And   user enters correct  username "supervisor" and correct password "tek_supervisor"
    And   user clicks on login
    Then  user should be taken to the main page and see page header "Customer Service Portal"
