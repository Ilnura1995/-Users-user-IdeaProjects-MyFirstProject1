Feature: Login functionality

  Background: Land to Home page
    Given Go to login page

    @Smoke
    Scenario:Positive: Login with valid credentials as Admin
      Given Enter "bilnura8" in userName or Email input field
      And Enter "bilnura8" in password input field
      When  user click on login button
      Then user should successfully logged in


#
#      @smoke
#      Scenario: Positive: Creating user
#        Given Enter "bilnura8" in userName or Email input field
#        And Enter "bilnura8" in password input field
#        When  user click on login button
#        Then user should successfully logged in
#        When user  clicks "add user" button
#        Then user should be in add user page
#        And user should see following field names
#        |First name| Last name| Email address | User name|Password|Bio|
#        |User type |Time zone| Language|
#
