package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_shipping {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_shipping.class);

	public Page_shipping(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_shipping Class Object Created");
		TestBase.test.log(Status.INFO, "Page_shipping Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_shipping1;

	@FindBy(xpath = "//*[@id='carrier_area']/h1")
	public WebElement lbl_shipping2;

	@FindBy(xpath = "//*[@id='order_step']/li[1]/a")
	public WebElement link_summary;

	@FindBy(xpath = "//*[@id='order_step']/li[2]/a")
	public WebElement link_signIn;

	@FindBy(xpath = "//*[@id='order_step']/li[3]/a")
	public WebElement link_address;

	@FindBy(xpath = "//*[@id='order_step']/li[4]/span")
	public WebElement lbl_04shipping;

	@FindBy(xpath = "//*[@id='step_end']/span")
	public WebElement lbl_05payment;

	@FindBy(xpath = "//*[@id='form']/div/div[2]/p")
	public WebElement lbl_chooseAShippingOptionForThisAddress;

	@FindBy(xpath = "//*[@id='delivery_option_253244_0']")
	public WebElement radio_carrier;

	@FindBy(xpath = "//*[@id='form']/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div")
	public WebElement lbl_deliveryCharges;

	@FindBy(xpath = "//*[@id='cgv']")
	public WebElement cb_IAgreeToTermsOfService;

	@FindBy(xpath = "//*[@id='form']/div/p[2]/a")
	public WebElement link_readTheTermsOfService;

	@FindBy(xpath = "//*[@id='cms']/div[1]/h1")
	public WebElement lbl_popup_termsAndConditonsOfUse;

	@FindBy(xpath = "//*[@id='cms']/div[1]/h3[1]")
	public WebElement lbl_rule1;

	@FindBy(xpath = "//*[@id='cms']/div[1]/h3[2]")
	public WebElement lbl_rule2;

	@FindBy(xpath = "//*[@id='cms']/div[1]/h3[3]")
	public WebElement lbl_rule3;

	@FindBy(xpath = "//*[@id='order']/div[3]/div/div/a")
	public WebElement btn_popup_TermsAndConditionsOfUse_windowCloseButton;

	@FindBy(xpath = "//*[@id='form']/p/a")
	public WebElement btn_continueShopping;

	@FindBy(xpath = "//*[@id='form']/p/button")
	public WebElement btn_proceedToCheckout;

	@FindBy(xpath = "//*[@id='order']/div[3]/div/div/div/div/p")
	public WebElement lbl_popup_youMustAgreeToTermsOfServiceBeforeContinuing;

	@FindBy(xpath = "//*[@id='order']/div[3]/div/div/a")
	public WebElement btn_popup_youMustAgreeToTermsOfServiceBeforeContinuing_windowCloseButton;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' image  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' image  ");
		return new Page_index(driver);
	}

	public Page_yourShoppingCart clkSummary() {
		link_summary.click();
		log.info("Clicked on 'Summary' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Summary' link");
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

	public void chkCarrier() {
		radio_carrier.click();
		log.info("Checked delivery carrier 'radio button'");
		TestBase.test.log(Status.INFO, "Checked delivery carrier 'radio button'");
	}

	public void chkIAgreeToTermsOfService() {
		cb_IAgreeToTermsOfService.click();
		log.info("Checked chekcbox of 'i agree to terms of service'");
		TestBase.test.log(Status.INFO, "Checked chekcbox of 'i agree to terms of service'");
	}

	public void clkReadTheTermsOfService() {
		link_readTheTermsOfService.click();
		log.info("Clicked on 'read the terms of service' link");
		TestBase.test.log(Status.INFO, "Clicked on 'read the terms of service' link");
	}

	public Page_checkout_addresses clkContinueShopping() {
		btn_continueShopping.click();
		log.info("Clicked on 'Continue shopping' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Continue shopping' button");
		return new Page_checkout_addresses(driver);
	}

	public Page_yourPaymentMethod clkProceedToCheckout() {
		btn_proceedToCheckout.click();
		log.info("Clicked on 'proceed to check out' button");
		TestBase.test.log(Status.INFO, "Clicked on 'proceed to check out' button");
		return new Page_yourPaymentMethod(driver);
	}

	public void clkPopup_youMustAgreeToTermsOfServiceBeforeContinuing_windowCloseButton() {
		btn_popup_youMustAgreeToTermsOfServiceBeforeContinuing_windowCloseButton.click();
		log.info("Clicked on popup_youMustAgreeToTermsOfServiceBeforeContinuing 'window close' button");
		TestBase.test.log(Status.INFO,
				"Clicked on popup_youMustAgreeToTermsOfServiceBeforeContinuing 'window close' button");
	}

}
