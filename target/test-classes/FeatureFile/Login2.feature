Feature: To validate login functionality

  Background: 
    Given user is in facebook  login page

  Scenario Outline: To validate searching the account using invalid mobile number
    When user click fotgot password link
    And user searches the account using invalid mobilenumber "<mobile number>"
    Then user is displayed with error message

    Examples: 
      | mobile number |
      |          4512 |
