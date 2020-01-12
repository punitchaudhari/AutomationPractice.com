package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.select.DropdownHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_contact {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_contact.class);

	public Page_contact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_contact Class Object Created");
		TestBase.test.log(Status.INFO, "Page_contact Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_customerServiceContactUs;

	@FindBy(xpath = "//*[@id='center_column']/form/fieldset/h3")
	public WebElement lbl_sendAMessage;

	@FindBy(xpath = "//*[@id='id_contact']")
	public WebElement dd_subjectHeading;

	@FindBy(xpath = "//*[@id='email']")
	public WebElement txt_emailAddress;

	@FindBy(xpath = "//*[@id='center_column']/form/fieldset/div[1]/div[1]/div[2]/div/select")
	public WebElement dd_orderReference;

	@FindBy(xpath = "//*[@id='155072_order_products']")
	public WebElement dd_product;

	@FindBy(xpath = "//*[@id='fileUpload']")
	public WebElement txt_attatchFile;

	@FindBy(xpath = "//*[@id='submitMessage']")
	public WebElement btn_send;

	@FindBy(xpath = "//*[@id='message']")
	public WebElement txt_message;

	@FindBy(xpath = "//*[@id='center_column']/div")
	public WebElement lbl_thereIsError;

	@FindBy(xpath = "//*[@id='center_column']/p")
	public WebElement lbl_Your_MessageHasBeenSuccessfullySentToOurTeam;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/a")
	public WebElement btn_home;

	
	
	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public void selectSubjectHeading(String heading) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_subjectHeading, heading);
	}

	public void setEmailAddress(String email) {
		txt_emailAddress.clear();
		txt_emailAddress.sendKeys(email);
		log.info("typed = " + email + " on 'email address'");
		TestBase.test.log(Status.INFO, "typed = " + email + " on 'email address'");
	}

	public void selectOrderReference(String orderReference) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_orderReference, orderReference);
	}

	public void selectProdut(String product) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_product, product);
	}

	public void clkSend() {
		btn_send.click();
		log.info("Clicked on 'Send' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Send' button");
	}

	public void setMessage(String message) {
		txt_message.clear();
		txt_message.sendKeys(message);
		log.info("Typed = " + message + " on 'message' field");
		TestBase.test.log(Status.INFO, "Typed = " + message + " on 'message' field");
	}

	public Page_index clkHome() {
		btn_home.click();
		log.info("Clicked on 'Home' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home' button");
		return new Page_index(driver);
	}

}
