@RetailAccountPage
Feature: Retail Account Page

  #Note: For this feature you have to have an account and be logged in into account. Repeated steps are under Background Keyword
  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Qaishaidari570@gmail.com' and password 'Parwan@123'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @UpdateProfile
  Scenario: Verify User can update Profile Information
    And User update Name 'Aqua Man' and Phone '420420420'
    And User click on Update button
    Then User profile information should be updated

  @AddPaymentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9876543219876543 | Black Adam |              11 |           2025 |          321 |
    And User click on Add your card button
    Then A message should be displayed ‘Payment Method added successfully’

  @EditDebitCard
  Scenario: Verify User can edit Debit or Credit card
    And User click on saved card image
    And User click on Edit option of card section
    And User edit information with below data
      | CardNumber       | NameOnCard | ExpirationMonth | ExpirationYear | SecurityCode |
      | 1234567890098765 | Adam Black |              10 |           2028 |          123 |
    And User click on Update Your Card button
    Then A message should be displayed ‘Payment Method updated Successfully’

  @RemoveDebitCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on saved card image
    And User click on remove option of card section
    Then Payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill address form with below information
      | Country       | FullName   | PhoneNumber  | StreetAddress | Apt | City    | State    | ZipCode |
      | United States | Black Adam | 540 540 5440 | Winter Rd     | 321 | Henrico | Virginia |   22334 |
    And User click Add Your Address button
    Then A message should be displayed ‘Address Added Successfully’

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | Country       | FullName | PhoneNumber  | StreetAddress | Apt | City     | State   | ZipCode |
      | United States | Iron Man | 450 450 4500 | Summer Drive  | 123 | Richmond | Vermont |   98789 |
    And User click update Your Address button
    Then A message should be displayed ‘Address Updated Successfully’

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
