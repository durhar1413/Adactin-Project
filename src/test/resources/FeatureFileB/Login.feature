Feature: To validate the flow of booking hotel
  Scenario: To validate the flow of functionality
    Given user sholud be in login page
    When user enter valid username and password
      
      | durairaj1314 | 9840441438 |
      
    And user select location,hotels
      | London      | Melbourne      | Brisbane     | Adelaide      |
      | Hotel Creek | Hotel Sunshine | Hotel Hervey | Hotel Cornice |
    And user select no of rooms and room type
      | 1 - One  | 2 - Two | 3 - Three | 4 - Four     |
      | Standard | Double  | Deluxe    | Super Deluxe |
    And user is in checkin and checkout
      | 13/04/2021 | 14/04/2021 |
    And user select adults and child and click search button
      | 1 - One  | 2 - Two | 3 - Three | 4 - Four  |
      | 0 - None | 1 - One | 2 - Two   | 3 - Three |
    And user select and click continue button
    And user enter firstname,lastname and address
      | firstname | durai           |
      | lastname  | harini          |
      | address   | 865-west london |
    And user enter card no,card type,expmonth,expyear,cvv number and click book now button
      | cardno           | cardtype | expmonth | expyear | cvv |
      | 1234567890123456 | VISA     | June     |    2022 | 145 |
      | 7894561230123456 | VISA     | April    |    2022 | 456 |
    Then user is in valid credential page
