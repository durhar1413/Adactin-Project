Feature: To validate top to end navigitation functionalities
@login
  Scenario Outline: To validate the flow of functionality with valid credentials data
    Given user is in adactin login page
    When user enter valid "<username>" and "<password>" and click login button
    And user select "<location>","<hotel name>","<room type>","<room number>","<Checkin>","<Checkout>","<Adults>","<Child>" and click search button
    And User "<firstname>","<lastname>","<address>","<card number>","<expmonth>","<expyear>","<cvv>" and click book btn
    Then user should be in valid credentials page

    Examples: 
      | username     | password   | location | hotel name  | room type | room number | Checkin    | Checkout   | Adults  | Child   | firstname | lastname | expmonth | expyear | cvv | address  | card number      |
      | durairaj1314 | 9840441438 | London   | Hotel Creek | Standard  | 1- one      | 13/04/2021 | 14/04/2021 | 2 - Two | 1 - One | Dura      | raja     | June     |    2022 | 123 | 589-west | 1234567890123456 |
