package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Popup_productAddedInCartStatus {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Popup_productAddedInCartStatus.class);

	public Popup_productAddedInCartStatus(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Popup_productAddedInCartStatus Class Object Created");
		TestBase.test.log(Status.INFO, "Popup_productAddedInCartStatus Class Object Created");
	}

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
	public WebElement lbl_productSuccesfullAddedToYourShoppingCart;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/div[1]/img")
	public WebElement img_productImage;

	@FindBy(xpath = "//*[@id='layer_cart_product_title']")
	public WebElement lbl_productName;

	@FindBy(xpath = "//*[@id='layer_cart_product_attributes']")
	public WebElement lbl_productDetails;

	@FindBy(xpath = "//*[@id='layer_cart_product_quantity']")
	public WebElement lbl_productQuantity;

	@FindBy(xpath = "//*[@id='layer_cart_product_price']")
	public WebElement lbl_productToatalPrice;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/h2/span[1]")
	public WebElement lbl_thereAreItemsInYourCart;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[1]/span")
	public WebElement lbl_totalProductsPrice;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[2]/span")
	public WebElement lbl_totalShippingPrice;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[3]/span")
	public WebElement lbl_total;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
	public WebElement btn_continueShopping;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
	public WebElement btn_proceedToCheckout;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
	public WebElement btn_closeWindow;

	public void clkContinueShopping() {
		btn_continueShopping.click();
		log.info("Clicked on 'Continue Shopping' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Continue Shopping' button");

	}

	public Page_yourShoppingCart clkProceedToCheckout() {
		btn_proceedToCheckout.click();
		log.info("Clicked on 'Proceed to checkout' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Proceed to checkout' button");
		return new Page_yourShoppingCart(driver);
	}

	public void clkCloseWindow() {
		btn_closeWindow.click();
		log.info("Clicked on 'cross symbol' button to close window");
		TestBase.test.log(Status.INFO, "Clicked on 'cross symbol' button to close window");

	}

}
