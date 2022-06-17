Feature: Login_Nid_Mob Flow

  Scenario: Login using NID and Mobile Number
    Given Browser opens
    When User in home pages
    Then User click on login option
    Then User click on login already registered
    Then Click on NationalID & MobileNumber
    And User enter nationalid
      | nationalid |
      | 2206104107 |
    Then User enter mobileno
      | mobileno  |
      | 533862687 |
    And Click login
    Then User enter otp_0
      | otp_0 |
      |     1 |
    Then User enter otp_1
      | otp_1 |
      |     1 |
    Then User enter otp_2
      | otp_2 |
      |     1 |
    Then User enter otp_3
      | otp_3 |
      |     1 |
    And Click on submit
