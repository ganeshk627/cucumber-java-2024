Feature: As an existing user, I want to reset my password.


  Scenario: Verify that I am a able to reset my with Admin password
    Given open the browser
    Given navigate to OrangeHRM application
    When click the Forgot password
    When enter the username as 'admin'

    Then should be navigate to dashboard page
    And close the browser


