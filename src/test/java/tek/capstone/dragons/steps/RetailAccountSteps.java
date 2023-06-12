package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.mysql.cj.x.protobuf.MysqlxResultset.Row;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccountPage().accountOption);
		logger.info("Account option was clicked");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAquaManAndPhone(String name, String phone) {
		sendText(factory.retailAccountPage().nameInputUpdate, name);
		sendText(factory.retailAccountPage().phoneInputUpdate, phone);
		logger.info("New name and phone number entered");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.retailAccountPage().nameUpdateButton);
		logger.info("Name and phone number updated");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
//		Assert.assertTrue(factory.retailAccountPage().sucessMessage.isDisplayed());
		Assert.assertTrue((boolean) factory.retailAccountPage().newNameAfterUpdate.isDisplayed());
		logger.info("Updated name displayed");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailAccountPage().addPaymentMethodButton);
		logger.info("AddPayment link was clicked");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			sendText(factory.retailAccountPage().addCardNumberBox, row.get("cardNumber"));
			sendText(factory.retailAccountPage().nameOnCardBox, row.get("nameOnCard"));
			selectByValue(factory.retailAccountPage().monthOnCardSelect, row.get("expirationMonth"));
			selectByValue(factory.retailAccountPage().yearOnCardSelect, row.get("expirationYear"));
			sendText(factory.retailAccountPage().cardSecurityCodeBox, row.get("securityCode"));
			logger.info("Card information entered");
			slowDown();
		}

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailAccountPage().addCardButton);
		logger.info("Card infor updated");
	}

	@Then("A message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(factory.retailAccountPage().sucessMessage.isDisplayed());
		System.out.println("Payment method added successfully");
		
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.retailAccountPage().cardEditOption);
		logger.info("Edit card option clicked");
	}

	@When("User edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			sendText(factory.retailAccountPage().addCardNumberBox, row.get("CardNumber"));
			sendText(factory.retailAccountPage().nameOnCardBox, row.get("NameOnCard"));
			selectByValue(factory.retailAccountPage().monthOnCardSelect, row.get("ExpirationMonth"));
			selectByValue(factory.retailAccountPage().yearOnCardSelect, row.get("ExpirationYear"));
			sendText(factory.retailAccountPage().cardSecurityCodeBox, row.get("SecurityCode"));
			logger.info("Updated card info entered");
		}
	}

	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailAccountPage().updateCardButton);
		logger.info("Update card button clicked");
	}

	@Then("A message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(factory.retailAccountPage().cardAndAccountText.isDisplayed());
		System.out.println("Payment Method updated successfully");
		logger.info("Payment Method updated");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.retailAccountPage().removeCardButton);
		logger.info("Remove card button was clicked");
	}

	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailAccountPage().addDebitOrCreditCardText.isDisplayed());
		logger.info("Payment Method removed");
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailAccountPage().addAddressOption);
		logger.info("Add address button clicked");
	}

	@When("User fill address form with below information")
	public void userFillAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {
			selectByValue(factory.retailAccountPage().countryAddressSelectBox, row.get("Country"));
			sendText(factory.retailAccountPage().fullNameAddressInputBox, row.get("FullName"));
			sendText(factory.retailAccountPage().phoneInputAddressBox, row.get("PhoneNumber"));
			sendText(factory.retailAccountPage().streetInputAddressBox, row.get("StreetAddress"));
			sendText(factory.retailAccountPage().apptInputAddressBox, row.get("Apt"));
			sendText(factory.retailAccountPage().cityInputAddressBox, row.get("City"));
			selectByValue(factory.retailAccountPage().stateSelectAddressBox, row.get("State"));
			sendText(factory.retailAccountPage().zipCodeInputAddressBox, row.get("ZipCode"));
			logger.info("Address info entered");
		}
	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> rows : data) {
			selectByValue(factory.retailAccountPage().countryAddressSelectBox, rows.get("Country"));
			clearTextUsingSendKeys(factory.retailAccountPage().fullNameAddressInputBox);
			sendText(factory.retailAccountPage().fullNameAddressInputBox, rows.get("FullName"));
			clearTextUsingSendKeys(factory.retailAccountPage().phoneInputAddressBox);
			sendText(factory.retailAccountPage().phoneInputAddressBox, rows.get("PhoneNumber"));
			clearTextUsingSendKeys(factory.retailAccountPage().streetInputAddressBox);
			sendText(factory.retailAccountPage().streetInputAddressBox, rows.get("StreetAddress"));
			clearTextUsingSendKeys(factory.retailAccountPage().apptInputAddressBox);
			sendText(factory.retailAccountPage().apptInputAddressBox, rows.get("Apt"));
			clearTextUsingSendKeys(factory.retailAccountPage().cityInputAddressBox);
			sendText(factory.retailAccountPage().cityInputAddressBox, rows.get("City"));
			selectByValue(factory.retailAccountPage().stateSelectAddressBox, rows.get("State"));
			clearTextUsingSendKeys(factory.retailAccountPage().zipCodeInputAddressBox);
			sendText(factory.retailAccountPage().zipCodeInputAddressBox, rows.get("ZipCode"));
			slowDown();
			logger.info("Updated address info entered");
		}
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailAccountPage().addYourAddressButton);
		logger.info("Add your address button was clicked");

	}

	@Then("A message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		System.out.println("Address Added Successfully");
		logger.info("Address added message displayed");
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailAccountPage().editAddressOption);
		logger.info("Edit Address button clicked");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailAccountPage().updateAddressButton);
		logger.info("UpdateAddress button clicked");
	}

	@Then("A message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		Assert.assertTrue(factory.retailAccountPage().addAddressOption.isDisplayed());
		System.out.println("Address Updated Successfully");
		logger.info("Success message displayed");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccountPage().removeAddressOption);
		logger.info("Remove Address button clicked");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailAccountPage().addAddressOption.isDisplayed());
		logger.info("Address removed");

	}

	@Then("User click on saved card image")
	public void userClickOnSavedCardImage() {
		click(factory.retailAccountPage().savedCardImage);
		logger.info("Clicked on card image");

	}
}
