Feature: To validate login functionality

  Scenario Outline: To validate login functionality with different credentials
    Given user is in facebook  login page
    When user enter invalid "<username>" and "<password>"
    And user click login button
    Then user should be in invalid credentials page

    Examples: 
      | username | password |
      | raja     |      123 |
      | durai    | 12qw3    |
      | raj      |      789 |
      | abde     |      789 |
