Feature: Negative testing the login
  @US_4
  Scenario Outline: Using negative data to test login
    Given user clicks on the login button
    And user enters incorrect "<username>" and corrcet "<password>"
    And user clicks on login
    Then user should see the "<message>"

    Examples:
      | username      | password       | message                      |
      | wrongusername | tek_supervisor | User wrongusername not found |
      | supervisor    | wrongpassword  | Password not matched         |

  @US_5
  Scenario:  Using negative data on single username
    Given user clicks on the login button
    And User does not enter username and enters "password"
    And user clicks on login
    Then user should see the error message "Enter username"


  @US_6
  Scenario:  Using negative data on single password
    Given user clicks on the login button
    And User   enters "username" and does not enters password
    And user clicks on login
    Then user should see the error "Password should contain 8 or more character"
