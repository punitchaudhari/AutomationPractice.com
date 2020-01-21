package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

import okhttp3.Address;

public class Page_bankwirePayment {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_bankwirePayment.class);

	public Page_bankwirePayment(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Page_bankwirePayment Class Object Created");
		TestBase.test.log(Status.INFO, "Page_bankwirePayment Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_orderSummary;

	@FindBy(xpath = "//*[@id='order_step']/li[1]/a")
	public WebElement link_summary;

	@FindBy(xpath = "//*[@id='order_step']/li[2]/a")
	public WebElement link_signIn;

	@FindBy(xpath = "//*[@id='order_step']/li[3]/a")
	public WebElement link_address;

	@FindBy(xpath = "//*[@id='order_step']/li[4]/a")
	public WebElement link_shipping;

	@FindBy(xpath = "//*[@id='step_end']")
	public WebElement lbl_payment;

	@FindBy(xpath = "//*[@id='center_column']/form/div/h3")
	public WebElement lbl_bankWirePayment;

	@FindBy(xpath = "//*[@id='center_column']/form/div/p[1]/strong")
	public WebElement lbl_youHaveChosenToPayByBankWire;

	@FindBy(xpath = "//*[@id='cart_navigation']/a")
	public WebElement link_otherPaymentMethods;

	@FindBy(xpath = "//*[@id='cart_navigation']/button")
	public 	WebElement btn_iConfirmMyOrder;
	
	@FindBy(xpath = "//*[@id='amount']")
	public 	WebElement lbl_totalAmountOfYourOrder;
	

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_yourShoppingCart clkSummary() {
		link_summary.click();
		log.info("Clicked on 'summary' link");
		TestBase.test.log(Status.INFO, "Clicked on 'summary' link");
		return new Page_yourShoppingCart(driver);
	}

	public Page_checkout_addresses clkSignIn() {
		link_signIn.click();
		log.info("Clicked on 'sign in' link");
		TestBase.test.log(Status.INFO, "Clicked on 'sign in' link");
		return new Page_checkout_addresses(driver);
	}

	public Page_checkout_addresses clkAddress() {
		link_address.click();
		log.info("Clicked on 'address' link");
		TestBase.test.log(Status.INFO, "Clicked on 'address' link");
		return new Page_checkout_addresses(driver);
	}

	public Page_shipping clkShipping() {
		link_shipping.click();
		log.info("Clicked on 'shipping' link");
		TestBase.test.log(Status.INFO, "Clicked on 'shipping' link");
		return new Page_shipping(driver);
	}

	public Page_yourPaymentMethod clkOtherPaymentMethods() {
		link_otherPaymentMethods.click();
		log.info("Clicked on 'other payment methods' link");
		TestBase.test.log(Status.INFO, "Clicked on 'other payment methods' link");
		return new Page_yourPaymentMethod(driver);
	}

	public Page_orderConfirmation clkIConfirmMyOrder() {
		btn_iConfirmMyOrder.click();
		log.info("Clicked on 'I confirm my order' button");
		TestBase.test.log(Status.INFO, "Clicked on 'I confirm my order' button");
		return new Page_orderConfirmation(driver);
	}

}
