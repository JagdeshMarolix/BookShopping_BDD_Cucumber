Feature: Subscribe Letter feature

  Scenario Outline: Subscribe Letter scenario with different email addresses
    Given user navigates to the shop page
    When user enters email address from "<SheetName>" and rownumber <RowNumber>
    And user clicks on subscribe button
    Then it shows a successful message "Thank you, your sign-up request was successful! Please check your email inbox to confirm."

    Examples: 
      | SheetName       | RowNumber |
      | SubscribeLetter |         0 |
      | SubscribeLetter |         1 |
      | SubscribeLetter |         2 |
      | SubscribeLetter |         3 |
