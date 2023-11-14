Feature: Testing profile functionality after login

  Background:
    Given user clicks on the login button
    And   user enters correct  username "supervisor" and correct password "tek_supervisor"
    And   user clicks on login
    @@US_9
    Scenario: testing profile assertions
      Given user click on profile button
      Then   user should see the "Profile" text
      And user should see status "Status" and "Active"
      And user should see user type "User Type"
      And user should see name "Name" and "Supervisor"
      And user should see username "Username" "supervisor"
      And user should see Authorities "Authorities" and "admin"
      And user should see logout button "Logout"
  @US_10
   Scenario: Testing profile buttons
     Given user click on profile button
     Then user clicks on the close button
     And user click on profile button
     And user clicks on logout button
     Then user should be logged out