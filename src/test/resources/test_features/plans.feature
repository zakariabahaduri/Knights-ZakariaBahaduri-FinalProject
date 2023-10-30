Feature: testing plans page
  Background:
    Given user clicks on the login button
    And   user enters correct  username "supervisor" and correct password "tek_supervisor"
    And   user clicks on login

    Scenario: user clicks on plans and validate that there are 4 rows of data
      Given user clicks on plans link
      And  user should see 4 rows of data

     Scenario: user should see Date Created as today`s date and date expired as tomorrow`s date.
       Given user clicks on plans link
       Then user should see today`s date as date created
       And user should see tomorrow`s date as date expired