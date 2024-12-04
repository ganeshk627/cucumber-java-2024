Feature: As a registered user, I want login and I should be navigated to the dashboard page.

  Background:
    Given open the browser
    Given navigate to OrangeHRM application

  Scenario: Verify that I am a able to login with Admin credentials
#    Given open the browser
#    Given navigate to OrangeHRM application
    When enter the username as 'admin'
    And enter the password as 'admin123'
    And click the Login button
    Then should be navigate to dashboard page
    And close the browser


  Scenario: Verify that I am a able to login with regular user credentials
#    Given open the browser
#    Given navigate to OrangeHRM application
    When enter the username as 'ganeshk'
    And enter the password as 'admin123'
    And click the Login button
    Then should be navigate to dashboard page
    And close the browser


  Scenario: Verify that I am a able to login with regular user credentials
#    Given open the browser
#    Given navigate to OrangeHRM application
    When enter the username as 'ganeshk'
    And enter the password as 'admin@123'
    And click the Login button
    Then user should get invalid password message
    And close the browser