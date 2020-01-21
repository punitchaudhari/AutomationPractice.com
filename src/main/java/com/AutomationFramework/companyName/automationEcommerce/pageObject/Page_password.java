package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_password {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_password.class);

	public Page_password(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_password Class Object Created");
		TestBase.test.log(Status.INFO, "Page_password Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_authentication;

	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement lbl_forgotYourPassword1;

	@FindBy(xpath = "//*[@id='center_column']/div/h1")
	public WebElement lbl_forgotYourPassword2;

	@FindBy(xpath = "//*[@id='email']")
	public WebElement txt_emailAddress;

	@FindBy(xpath = "//*[@id='form_forgotpassword']/fieldset/p/button")
	public WebElement btn_retrivePassword;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/a")
	public WebElement btn_backToLogin;

	@FindBy(xpath = "//*[@id='center_column']/div/div")
	public WebElement lbl_thereIsError;

	@FindBy(xpath = "//*[@id='center_column']/div/p")
	public WebElement lbl_AConfirmationEmailHasBeenSentToYourAddress;

	public Page_index clkHomeIcon1() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_authentication clkAuthentication() {
		link_authentication.click();
		log.info("Clicked on 'Authentication' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Authentication' link");
		return new Page_authentication(driver);
	}

	public void setEmailAddress(String emailAddress) {
		txt_emailAddress.clear();
		txt_emailAddress.sendKeys(emailAddress);
		log.info("Typed '" + emailAddress + "' on 'email address' text feild");
		TestBase.test.log(Status.INFO, "Typed '" + emailAddress + "' on 'email address' text feild");
	}

	public void clkRetriveAddress() {
		btn_retrivePassword.click();
		log.info("Clicked on 'Retrive password' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Retrive password' button");
	}

	public Page_authentication clkBakToLogin() {
		btn_backToLogin.click();
		log.info("Clicked on 'Back to login' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Back to login' button");
		return new Page_authentication(driver);
	}

}
