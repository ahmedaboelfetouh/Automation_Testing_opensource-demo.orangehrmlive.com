Feature: Validate login Functionality

  Scenario Outline: Login with valid credentials
    Given user in login page
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then show message successfully registered

    Examples:
      | username | password |
      | admin    | admin123 |
      | user     | user123  |


