Feature: testing accounts page
  Background:
    Given user clicks on the login button
    And   user enters correct  username "supervisor" and correct password "tek_supervisor"
    And   user clicks on login
  @US_11
    Scenario: user sees 5 rows in the page
      Given user clicks on the accounts page
      And user should see "Show 5" rows in the page
      And number of rows should be 5
  @US_12
    Scenario Outline: User selects different row numbers in the page
      Given user clicks on the accounts page
      And user clicks on the <row_number> user should see <number_of_rows>

      Examples:
        | row_number | number_of_rows |
        | "5"        | 5              |
        | "10"       | 10             |
        | "25"       | 25             |
        | "50"       | 50             |

