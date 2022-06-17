Feature: Logged In User Flow

  Background: Login using Username and Password
    Given Browser is open for login
    When User is in home page of application
    Then User click on the login option
    Then User click on the login on already registered
    And User enter username
      | username   |
      | testmotor3 |
    Then User enter password
      | password  |
      | Test12345 |
    And Click on Login
    Then User enter OTP0
      | otp0 |
      |    1 |
    Then User enter OTP1
      | otp1 |
      |    1 |
    Then User enter OTP2
      | otp2 |
      |    1 |
    Then User enter OTP3
      | otp3 |
      |    1 |
    And Click on Submit

  Scenario Outline: Dashboard Verification Page
    Then Verify the header with "<Expected text>"
    Then Verify All policy Text with "<expected text>"

    Examples: 
      | Expected text              | expected text |
      | We are here for you , 24/7 | All Policies  |

  Scenario Outline: Verify My Profile Page
    When Click on My Profile
    Then Verify Profile Text with "<Expected text>"
    Then Click Contact Information

    Examples: 
      | Expected text        |
      | Personal Information |

  Scenario Outline: Update Mobile Number and Email Address Page
    When User clicks on My Profile
    Then Click on Contact Information
    Then Click on Update mobile number
    Then Click inside text box
    And User enter updated Mobile Number as "<Mobile Number>"
    Then Click on verify
    Then User enters OTP_0
      | otp_0 |
      |     1 |
    Then User enters OTP_1
      | otp_1 |
      |     1 |
    Then User enters OTP_2
      | otp_2 |
      |     1 |
    Then User enters OTP_3
      | otp_3 |
      |     1 |
    And User clicks on submit

    Examples: 
      | Mobile Number |
      |     510092257 |
