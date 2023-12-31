package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"searchBtn\"]")
	public WebElement searchButton;
	
	@FindBy(css = "#orderLink")
	public WebElement orderButtonLink;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div")
	public WebElement clickOnSearchedItem;
	
	@FindBy(xpath = "//*[@id=\"search\"]")
	public WebElement allDeptDropdown;
	
	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	public WebElement searchTextBox;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")
	public WebElement quantitySelectDropdown;
	
	@FindBy(xpath = "//*[@id=\"addToCartBtn\"]")
	public WebElement addToCardButton;
	
	@FindBy(xpath = "//*[@id=\"cartBtn\"]")
	public WebElement cartOption;
	
	@FindBy(xpath = "//*[@id=\"proceedBtn\"]")
	public WebElement proceedToCheckOut;
	
	@FindBy(css = "#placeOrderBtn")
	public WebElement placeOrderButton;
	
	@FindBy(css = ".order__item-name")
	public WebElement firstOrderLink;
	
	@FindBy(css = "#cancelBtn")
	public WebElement cancelOrderButton;
	
	@FindBy(xpath = "//*[@id=\"reasonInput\"]")
	public WebElement cancelReasonSelect;
	
	@FindBy(css = "#orderSubmitBtn")
	public WebElement orderCancelButton2;
	
	@FindBy(css = "#returnBtn")
	public WebElement returnItemButton;
	
	@FindBy(css = "#reasonInput")
	public WebElement returnReasonSelect;
	
	@FindBy(css = "#dropOffInput")
	public WebElement dropOffSelect;
	
	@FindBy(css = "#orderSubmitBtn")
	public WebElement returnOrderButton;
	
	@FindBy(css = "#reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(css = "#headlineInput")
	public WebElement reviewHeadlineBox;
	
	@FindBy(css = "#descriptionInput")
	public WebElement reviewBodyBox;
	
	@FindBy(css = "#reviewSubmitBtn")
	public WebElement addYourReviewButton;
	
	@FindBy(css = "div.order:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > p:nth-child(2)")
	public WebElement firstOrderDetail;
	
	
	
	
	

	
}
