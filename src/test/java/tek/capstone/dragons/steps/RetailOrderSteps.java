package tek.capstone.dragons.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	  click(factory.retailOrderPage().searchButton);
	  logger.info("Search icon clicked");
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	   click(factory.retailOrderPage().addToCardButton);
	   logger.info("Add to cart button clicked");
	}
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	 click(factory.retailOrderPage().orderButtonLink);
	 logger.info("Order section clicked");
	}
	@When("User click on item")
	public void userClickOnItem() {
	 click(factory.retailOrderPage().clickOnSearchedItem);
	 logger.info("Searched item clicked");
	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		click(factory.retailOrderPage().allDeptDropdown);
	   selectByVisibleText(factory.retailOrderPage().allDeptDropdown, string);
	   logger.info("Electronic selected");
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
	  sendText(factory.retailOrderPage().searchTextBox, string);
	  logger.info("Text entered into search box");
	}
	@When("User select quantity adding '{int}’")
	public void userSelectQuantity(int int1) {
	    selectByValue(factory.retailOrderPage().allDeptDropdown, "2");
	    logger.info(int1 + " was selected");
	}

	@Then("The cart icon quantity should change to '{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		int expectedQuantity = int1;
		Assert.assertEquals(expectedQuantity, 2);
		logger.info("Department changed to " + int1); 
	}
	@When("And User search for an item {string}")
	public void userSearchForAnItem1(String string) {
		sendText(factory.retailOrderPage().searchTextBox, string);
		logger.info(string+" was entered to be searched");
		
	}
	@When("User select quantity ordering '{int}’")
	public void userSelectQuantityOrdering(Integer int1) {
		selectByValue(factory.retailOrderPage().quantitySelectDropdown, "5");
		logger.info(int1+" was selected for quantity");
	    
	}
	@Then("The cart icon quantity should change to ordering '{int}’")
	public void theCartIconQuantityShouldChangeToOrdering(Integer int1) {
		int expectedQuantity = int1;
		Assert.assertEquals(expectedQuantity, 5);
		logger.info("Quantity validated");
	  
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.retailOrderPage().cartOption);
	   logger.info("Cart option was clicked");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.retailOrderPage().proceedToCheckOut);
	    logger.info("Procceed to checkout button was clicked");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	  click(factory.retailOrderPage().placeOrderButton);
	  logger.info("Place your order button was clicked");
	}
	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
	System.out.println(string);
	}
//	@When("User click on first order in list cancel")
//	public void userClickOnFirstOrderInListCancel() {
//	 click(factory.retailOrderPage().firstOrderDetail);
//	 logger.info("First order clicked");
//	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	  click(factory.retailOrderPage().cancelOrderButton);
	  logger.info("Cancel order button was clicked");
	}
	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
	  selectByValue(factory.retailOrderPage().cancelReasonSelect, "wrong");
	  logger.info("Cancelation reason selected");
	}
	
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	 click(factory.retailOrderPage().orderCancelButton2);
	 logger.info("Cancel order button was clicked");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedCancelYourOrderHasBeenCancelled() {
	  System.out.println("Cancelation message displayed");
	}
	@When("User click on first order in list return")
	public void userClickOnFirstOrderInListReturn() {
	  click(factory.retailOrderPage().firstOrderLink);
	  logger.info("First order was selected");
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	 click(factory.retailOrderPage().returnItemButton);
	 logger.info("Return item button was clicked");
	}
	@When("User select the Return Reason 'Item damaged’")
	public void userSelectTheReturnReason() {
	 selectByVisibleText(factory.retailOrderPage().returnReasonSelect, "Bought wrong item");
	 logger.info("Return reason was selected");
	}
	@When("User select the drop off service 'FedEx’")
	public void userSelectTheDropOffService() {
		selectByVisibleText(factory.retailOrderPage().dropOffSelect, "FedEx");
		logger.info("Drop off method was selected");
	
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	 click(factory.retailOrderPage().returnOrderButton);
	 logger.info("Return order button was clicked");
	}
	@Then("A cancelation message should be displayed 'Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturn() {
	System.out.println("Return was successfull");
	}
	@When("User click on first order in list review")
	public void userClickOnFirstOrderInListReview() {
	click(factory.retailOrderPage().firstOrderLink);
	logger.info("First order was selected");
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	  click(factory.retailOrderPage().reviewButton);
	  logger.info("Review button was clicked");
	}
	@When("User write Review headline 'Satisfied with purchase’")
	public void userWriteReviewHeadline() {
	 sendText(factory.retailOrderPage().reviewHeadlineBox, "Satisfied with purchase");
	 logger.info("Review headline entered");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	 click(factory.retailOrderPage().addYourReviewButton);
	 logger.info("Review button was clicked");
	}
	@Then("A review message should be displayed 'Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayed() {
		System.out.println("Your reiew was added successfully");
	}
	
	@When("User search for an items {string}")
	public void userSearchForAnItems(String string) {
	  sendText(factory.retailOrderPage().searchTextBox, string);
	  logger.info(string + " was entered for search");
	}
	@Then("A message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	   System.out.println("Message displayed");
	}
	

		
	}
	


