package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);	
	}

	@FindBy(xpath = "//*[@id=\"accountLink\"]")
	public WebElement accountOption;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInputUpdate;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneInputUpdate;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement nameUpdateButton;
	
	@FindBy(xpath = "//div[@class='w-8/12']//child::p")
	public WebElement addPaymentMethodButton;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement addCardNumberBox;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardBox;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement monthOnCardSelect;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement yearOnCardSelect;
	
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement cardSecurityCodeBox;
	//button[@id='paymentSubmitBtn']
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addCardButton;
	
	@FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[1]")
	public WebElement cardEditOption;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateCardButton;
	
	@FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[2]")
	public WebElement removeCardButton;
	
	@FindBy(xpath = "//h1[@class='account__payment-new-title']")
	public WebElement addDebitOrCreditCardText;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryAddressSelectBox;
	
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement fullNameAddressInputBox;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneInputAddressBox;
	
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetInputAddressBox;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apptInputAddressBox;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityInputAddressBox;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateSelectAddressBox;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInputAddressBox;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement editAddressOption;
	
	
	@FindBy(xpath = "//button[@class='account__address-btn'][2]")
	public WebElement removeAddressOption;
	
	@FindBy(xpath = "//div[@class='account__address-new-wrapper']")
	public WebElement addAddressOption;
	
	@FindBy(xpath = "//h1[@class='account__information-username']")
	public WebElement newNameAfterUpdate;
	
	@FindBy(xpath = "//h1[@class ='account__payments-title']")
	public WebElement cardAndAccountText;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateAddressButton;
	
	@FindBy(xpath = "//div[@class='account__payment-image-wrapper']//child::img")
	public WebElement savedCardImage;

	@FindBy(xpath = "/html/body/div/div[2]")
	public WebElement sucessMessage;

	
	
}
