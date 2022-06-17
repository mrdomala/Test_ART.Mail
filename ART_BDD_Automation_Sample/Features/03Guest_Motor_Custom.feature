#Feature: Guest_Motor_Custom
#
  #Scenario Outline: Motor Flow for Guest User Custom Flow Comprehensive sadad payment
    #Given user opens the browser for motor guest flow
    #When user in home page for motor guest flow
    #Then user clicks on the product motor
    #Then user verifies the header "<Expected Header>" at product page
    #And user selects the purpose of insurance as Custom Number
    #Then user enters the NID as "<National Id>"
    #Then user enters the DOB as "<Date of Birth>"
    #Then user enters the Mobile No. as "<Mobile>"
    #Then user enters the Email as "<Email>"
    #And user also enters the Custom No. as "<Custom Number>"
    #Then user enters the vehicle production year as "<Year>"
    #And user selects the checkbox and click on the Get a Quote button.
    #Then user clicks on the Comprehensive plan for motor flow
    #And user selects the addons for comprehensive plans
    #Then user clicks on the Recalculate button
    #And user after that clicks on the Proceed button
    #Then user enters otp in the first field as "<Otp0>"
    #Then user enters otp in the second field as "<Otp1>"
    #Then user enters otp in the third field as "<Otp2>"
    #Then user enters otp in the fourth field as "<Otp3>"
    #And user clicks on the submit otp button
    #Then user selects the Sadad payment method
    #And user clicks on the confirm and pay button
    #Then user clicks on the download quotation button
#
    #Examples: 
      #| Expected Header                                | National Id | Date of Birth | Mobile    | Email                            | Custom Number | Year | Otp0 | Otp1 | Otp2 | Otp3 |
      #| Motor insurance policies from Al Rajhi Takaful |  2406132841 | 25-05-1989    | 555555555 | madhavi.bisen@alrajhitakaful.com |    1020364518 | 2021 |    1 |    1 |    1 |    1 |
