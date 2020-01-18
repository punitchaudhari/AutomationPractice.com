package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.List;
import java.util.ListIterator;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.select.DropdownHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_myWishList {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_myWishList.class);

	public Page_myWishList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_myWishList Class Object Created");
		TestBase.test.log(Status.INFO, "Page_myWishList Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_myAccount;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[3]")
	public WebElement lbl_myWhishlists1;

	@FindBy(xpath = "//*[@id='mywishlist']/h1")
	public WebElement lbl_myWhishlists2;

	@FindBy(xpath = "//*[@id='form_wishlist']/fieldset/h3")
	public WebElement lbl_newWhishlist;

	@FindBy(xpath = "//*[@id='name']")
	public WebElement txt_name;

	@FindBy(xpath = "//*[@id='submitWishlist']")
	public WebElement btn_save1;

	@FindBy(xpath = "//*[@id='block-history']/table/tbody/tr/td[1]/a")
	public List<WebElement> tbl_col_name_whishlistNames;

	@FindBy(xpath = "//*[@id='block-history']/table/tbody/tr/td[2]")
	public List<WebElement> tbl_col_qty_NumberOfQuantities;

	@FindBy(xpath = "//*[@id='block-history']/table/tbody/tr/td[3]")
	public List<WebElement> tbl_col_viewed_NumberOfViews;

	@FindBy(xpath = "//*[@id='block-history']/table/tbody/tr/td[4]")
	public List<WebElement> tbl_col_created_date;

	@FindBy(xpath = "//*[@id='block-history']/table/tbody/tr/td[5]/a")
	public List<WebElement> tbl_col_directLink_view;

	@FindBy(xpath = "//*[@id='block-history']/table/tbody/tr/td[6]/a")
	public List<WebElement> tbl_col_delete_deleteButton;

	@FindBy(xpath = "//*[@id='showBoughtProducts']")
	public WebElement btn_showProducts;

	@FindBy(xpath = "//*[@id='hideBoughtProducts']")
	public WebElement btn_hideProducts;

	@FindBy(xpath = "//*[@id='showBoughtProductsInfos']")
	public WebElement btn_showBoughtProductsInfo;

	@FindBy(xpath = "//*[@id='hideBoughtProductsInfos']")
	public WebElement btn_hideBoughtProductsInfo;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/p[1]/input")
	public WebElement txt_permalink;

	@FindBy(xpath = "//*[@id='showSendWishlist']")
	public WebElement btn_sendThisWhishlist;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/div/ul/li/div[1]/div[1]/div[1]/a[1]")
	public List<WebElement> img_productImage;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/div/ul/li/div[1]/div[2]/div[1]/p")
	public List<WebElement> lbl_productName;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/div/ul/li/div[1]/div[2]/div[1]/a")
	public List<WebElement> btn_removeProduct;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/div/ul/li/div[1]/div[2]/div[1]/div[1]/p/input")
	public List<WebElement> txt_quatity;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/div/ul/li/div[1]/div[2]/div[1]/div[1]/p[2]/select")
	public List<WebElement> dd_priority;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/div/ul/li/div[1]/div[2]/div[1]/div[2]/a")
	public List<WebElement> btn_save2;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[1]/input")
	public WebElement txtEmail1;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[2]/input")
	public WebElement txtEmail2;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[3]/input")
	public WebElement txtEmail3;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[4]/input")
	public WebElement txtEmail4;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[5]/input")
	public WebElement txtEmail5;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[6]/input")
	public WebElement txtEmail6;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[7]/input")
	public WebElement txtEmail7;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[8]/input")
	public WebElement txtEmail8;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[9]/input")
	public WebElement txtEmail9;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[10]/input")
	public WebElement txtEmail10;

	@FindBy(xpath = "//*[@id='block-order-detail']/div/form/fieldset/div[11]/button")
	public WebElement btn_send;

	@FindBy(xpath = "//*[@id='mywishlist']/ul/li[1]/a")
	public WebElement btn_backToYourAccount;

	@FindBy(xpath = "//*[@id='mywishlist']/ul/li[2]/a")
	public WebElement btn_home;

	public Page_index clkHomeIcon1() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_myAccount clkMyAccount() {
		link_myAccount.click();
		log.info("typed 'My Account' link");
		TestBase.test.log(Status.INFO, "Clicked on 'My Account' link");
		return new Page_myAccount(driver);
	}

	public void setName(String whishlistName) {
		txt_name.clear();
		txt_name.sendKeys(whishlistName);
		log.info("Type = '" + whishlistName + "' on 'name' text field");
		TestBase.test.log(Status.INFO, "Type = '" + whishlistName + "' on 'name' text field");
	}

	public void clkSave() {
		btn_save1.click();
		log.info("Clicked on 'Save' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Save' button");
	}

	public void clkWhishlistName(String whishlistName) {
		ListIterator<WebElement> itr = tbl_col_name_whishlistNames.listIterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			String wlName = element.getText();
			if (wlName.equals(whishlistName)) {
				element.click();
				log.info("Clicked on '" + wlName + "' whishlist");
				TestBase.test.log(Status.INFO, "Clicked on '" + wlName + "' whishlist");
			}
		}
		log.info("'" + whishlistName + "' whishlist not found");
		TestBase.test.log(Status.INFO, "'" + whishlistName + "' whishlist not found");
	}

	public void clkDelete(int buttonNumber) {
		tbl_col_delete_deleteButton.get(buttonNumber - 1).click();
		log.info("Clicked on delet butotn number = '" + buttonNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on delet butotn number = '" + buttonNumber + "'");
	}

	public void clkView(int viewLinkNumber) {
		tbl_col_directLink_view.get(viewLinkNumber - 1).click();
		log.info("Clicked on view link number '" + viewLinkNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on view link number '" + viewLinkNumber + "'");
	}

	public void clkHideProducts() {
		btn_hideProducts.click();
		log.info("Clicked on 'hide products' button");
		TestBase.test.log(Status.INFO, "Clicked on 'hide products' button");
	}

	public void clkShowProducts() {
		btn_showProducts.click();
		log.info("Clicked on 'show products' button");
		TestBase.test.log(Status.INFO, "Clicked on 'show products' button");
	}

	public void clkShowBoughtProductsInfos() {
		btn_showBoughtProductsInfo.click();
		log.info("Clicked on 'Bought products info' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Bought products info' button");
	}

	public void clkHideBoughtProductsInfos() {
		btn_hideBoughtProductsInfo.click();
		log.info("Clicked on 'Hide bought products infos'");
		TestBase.test.log(Status.INFO, "Clicked on 'Hide bought products infos'");
	}

	public void clkSendThisWhishlist() {
		btn_sendThisWhishlist.click();
		log.info("Clicked on 'Send this whishlist' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Send this whishlist' button");
	}

	public Page_product clkProductImage(int productNumber) {
		img_productImage.get(productNumber - 1).click();
		log.info("Clicked on product image number ='" + productNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on product image number ='" + productNumber + "'");
		return new Page_product(driver);
	}

	public void clkRemoveProduct(int productNumber) {
		btn_removeProduct.get(productNumber - 1).click();
		log.info("Clicked on product remove button number ='" + productNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on product remove button number ='" + productNumber + "'");
	}

	public void setQuantity(int productNumber, int quantity) {
		txt_quatity.get(productNumber - 1).sendKeys(String.valueOf(quantity));
		log.info("Typed = '" + quantity + "' on quantity text field of product number = '" + productNumber + "'");
		TestBase.test.log(Status.INFO,
				"Typed = '" + quantity + "' on quantity text field of product number = '" + productNumber + "''");
	}

	public void selectPriority(String optionToBeSelected, int productNumber) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_priority.get(productNumber - 1), optionToBeSelected);
		log.info("selected = '" + optionToBeSelected + "' option of priority dropdownlist of product number '"
				+ productNumber + "'");
		TestBase.test.log(Status.INFO, "selected = '" + optionToBeSelected
				+ "' option of priority dropdownlist of product number '" + productNumber + "'");
	}

	public void clkSave2(int productNumber) {
		btn_save2.get(productNumber - 1).click();
		log.info("Clicked on 'save' button of product number= '" + productNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'save' button of product number= '" + productNumber + "'");
	}

	public void setEmail1(String email) {
		txtEmail1.sendKeys(email);
		log.info("Typed = '" + email + "' on email1 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email1 field");
	}

	public void setEmail2(String email) {
		txtEmail2.sendKeys(email);
		log.info("Typed = '" + email + "' on email2 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email2 field");
	}

	public void setEmail3(String email) {
		txtEmail3.sendKeys(email);
		log.info("Typed = '" + email + "' on email3 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email3 field");
	}

	public void setEmail4(String email) {
		txtEmail4.sendKeys(email);
		log.info("Typed = '" + email + "' on email4 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email4 field");
	}

	public void setEmail5(String email) {
		txtEmail5.sendKeys(email);
		log.info("Typed = '" + email + "' on email5 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email5 field");
	}

	public void setEmail6(String email) {
		txtEmail6.sendKeys(email);
		log.info("Typed = '" + email + "' on email6 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email6 field");
	}

	public void setEmail7(String email) {
		txtEmail7.sendKeys(email);
		log.info("Typed = '" + email + "' on email7 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email7 field");
	}

	public void setEmail8(String email) {
		txtEmail8.sendKeys(email);
		log.info("Typed = '" + email + "' on email8 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email8 field");
	}

	public void setEmail9(String email) {
		txtEmail9.sendKeys(email);
		log.info("Typed = '" + email + "' on email9 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email9 field");
	}

	public void setEmail10(String email) {
		txtEmail10.sendKeys(email);
		log.info("Typed = '" + email + "' on email10 field");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' on email10 field");
	}

	public Page_myAccount clkBackToYourAccount() {
		btn_backToYourAccount.click();
		log.info("clicked on 'Back to your account' button");
		TestBase.test.log(Status.INFO, "clicked on 'Back to your account' button");
		return new Page_myAccount(driver);
	}

	public Page_index clkHome() {
		btn_home.click();
		log.info("clicked on 'Home' button");
		TestBase.test.log(Status.INFO, "clicked on 'Home' button");
		return new Page_index(driver);
	}

}
