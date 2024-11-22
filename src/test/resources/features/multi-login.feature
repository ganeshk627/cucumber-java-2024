Feature: As the registered users, I want login and I should be navigated to the dashboard page.


  Scenario Outline: Verify that I am a able to login with multiple registered user credentials
    Given open the browser
    Given navigate to OrangeHRM application
    When enter the username as '<username>'
    And enter the password as '<password>'
    And click the Login button
    Then should be navigate to dashboard page
    And close the browser
    Examples:
      | username | password |
      | admin    | admin123 |
      | Admin    | admin123 |
      | ADMIN    | admin123 |
      | ganeshk  | admin123 |

