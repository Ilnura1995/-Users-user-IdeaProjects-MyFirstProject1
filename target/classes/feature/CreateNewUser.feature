
Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page
    Given Enter "bilnura8" in userName or Email input field
    And Enter "bilnura8" in password input field
    When  user click on login button
    Then user should successfully logged in


  Scenario: Positive: Create new user
      Given user should click Add user button in Admin Home page
    And verify following field names are displayed
      | First name | Last name | Email address | Username | Password | Bio |User type | Time zone | Language |
    And enter following date to create new user
      | firstName| lastName | emailAddress |userName| password|
      |Elon      | Mask     |musk@tesla.com|elaon   | VeryH@rd@$$312|
      |Leo       |Messi     |messi.@psq.com|messi   |VeryH@rd@$$312 |

