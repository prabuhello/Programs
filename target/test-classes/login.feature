@login
Feature: Login feature

  Scenario Outline: Login with different credentials
    Given I open the login page
    When I enter username as "<username>" and password as "<password>"
    And I click the login button
    Then I should see the <message> message

    Examples: 
      | username | password   | message                       |
      | mayusri  | mayusri*1A | Login successful.             |
      | mayursri | mayusri*1A | Invalid username or password. |
      | anyone   | welcome    | Invalid username or password. |
      | anyone   | welcome    | Invalid username or password. |
      