package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_orderConfirmation {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_orderConfirmation.class);

	public Page_orderConfirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_orderConfirmation Class Object Created");
		TestBase.test.log(Status.INFO, "Page_orderConfirmation Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_orderConfirmation1;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_orderConfirmation2;

	@FindBy(xpath = "//*[@id='order_step']/li[1]/a")
	public WebElement link_summary;

	@FindBy(xpath = "//*[@id='order_step']/li[2]/a")
	public WebElement link_signIn;

	@FindBy(xpath = "//*[@id='order_step']/li[3]/a")
	public WebElement link_address;

	@FindBy(xpath = "//*[@id='order_step']/li[4]/a")
	public WebElement link_shipping;

	@FindBy(xpath = "//*[@id='step_end']/span")
	public WebElement lbl_payment;

	@FindBy(xpath = "//*[@id='center_column']/div/p/strong")
	public WebElement lbl_yourOrderOnMyStoreIsComplete;

	@FindBy(xpath = "//*[@id='center_column']/div/span/strong")
	public WebElement lbl_amount;

	@FindBy(xpath = "//*[@id='center_column']/div/strong[1]")
	public WebElement lbl_nameOfTheAccountOwner;

	@FindBy(xpath = "//*[@id='center_column']/div/strong[2]")
	public WebElement lbl_includeTheseDetailsXYZ;

	@FindBy(xpath = "//*[@id='center_column']/div/strong[3]")
	public WebElement lbl_bankName;

	@FindBy(xpath = "//*[@id='center_column']/p/a")
	public WebElement btn_backToOrders;

	public Page_index clkHomeIcon1() {
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

	public Page_history clkBackToOrders() {
		btn_backToOrders.click();
		log.info("Clicked on 'Back to orders' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Back to orders' button");
		return new Page_history(driver);
	}

}
