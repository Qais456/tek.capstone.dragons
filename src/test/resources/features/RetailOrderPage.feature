@RetailOrderPage
Feature: 

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Qaishaidari570@gmail.com' and password 'Parwan@123'
    And User click on login button
    And User should be logged in into Account

  @AddItemToCart
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity adding '2’
    And User click add to Cart button
    Then The cart icon quantity should change to '2’

  @PlaceOrderWithShipping
  Scenario: Verify User can place an order with Shipping address and payment Method on file​​​​​​​
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity ordering '5’
    And User click add to Cart button
    Then The cart icon quantity should change to ordering '5’
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then A message should be displayed 'Order Placed Thanks'

  #Note: For the below scenarios, you need to first have orders in place. At least one order must be present
  @ReturnOrder
  Scenario: Verify User can Return the order
    And User click on Orders section
    #And User click on first order in list once you click on first order you have to navigate back to previous page to click on return order button
    And User click on Return Items button
    And User select the Return Reason 'Item damaged’
    And User select the drop off service 'FedEx’
    And User click on Return Order button
    Then A cancelation message should be displayed 'Return was successful’

  @CancelOrder
  Scenario: Verify User can cancel the order
    And User click on Orders section
    #And User click on first order in list once you click on first order you have to navigate back to previous page to click on cancel order button
    And User click on Cancel The Order button
    And User select the cancelation Reason ‘Bought wrong item’
    And User click on Cancel Order button
    Then a cancelation message should be displayed ‘Your Order Has Been Cancelled’

  @WriteReview
  Scenario: Verify User can write a review on order placed
    And User click on Orders section
    #And User click on first order in list => once you click on first order you have to navigate back to previous page to click on review button
    And User click on Review button
    And User write Review headline 'Satisfied with purchase’
    And User click Add your Review button
    Then A review message should be displayed 'Your review was added successfully’
