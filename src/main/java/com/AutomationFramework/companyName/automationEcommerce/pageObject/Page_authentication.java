package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_authentication {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_authentication.class);

	public Page_authentication(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Page_authentication Class Object Created");
		TestBase.test.log(Status.INFO, "Page_authentication Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement txt_PageInfoBar;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	WebElement lbl_authentication;
	// CREATE AN ACCOUNT SECTION
	@FindBy(xpath = "//*[@id='create-account_form']/h3")
	WebElement lbl_createAnAccount;

	@FindBy(xpath = "//*[@id='create-account_form']/div/p")
	WebElement lbl_pleaseEnterYourEmailAddress;

	@FindBy(xpath = "//*[@id='email_create']")
	WebElement txt_emailAddress1;

	@FindBy(xpath = "//*[@id='SubmitCreate']")
	WebElement btn_createAnAccount;

	// ALREADY REGISTERED SECTION
	@FindBy(xpath = "//*[@id='login_form']/h3")
	WebElement lbl_alreadyRegistered;

	@FindBy(xpath = "//*[@id='email']")
	WebElement txt_emailAddress2;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement txt_password;

	@FindBy(xpath = "//*[@id='login_form']/div/p[1]/a")
	WebElement link_forgotYourPassword;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	WebElement btn_signIn;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public void setCreateAccountEmailAddress(String email) {
		txt_emailAddress1.sendKeys(email);
		log.info("Typed = '" + email + "' email on create email account textbox field ");
		TestBase.test.log(Status.INFO,
				"Typed = '" + email + "' email on create email account section email textbox field ");

	}

	public Page_accountCreation clkCreateAccountButton() {
		btn_createAnAccount.click();
		log.info("Clicked on 'Create An Account button' ");
		TestBase.test.log(Status.INFO, "Clicking on 'Create An Account button' ");
		return new Page_accountCreation(driver);
	}

	public void setAlreadyRegisteredEmailAddress(String email) {
		txt_emailAddress2.sendKeys(email);
		log.info("Typed = '" + email + "' email on already registered section email textbox field ");
		TestBase.test.log(Status.INFO, "Typed = '" + email + "' email on create email account textbox field ");

	}

	public void setPassword(String password) {
		txt_password.sendKeys(password);
		log.info("Typed = '" + password + "' password on already registered section password textbox field ");
		TestBase.test.log(Status.INFO, "Typed = '" + password + "' email on create email account textbox field ");

	}

	public Page_password clkForgotYourPassword() {
		link_forgotYourPassword.click();
		log.info("Clicked on 'Forgot your password 'link ");
		TestBase.test.log(Status.INFO, "Clicked on 'Forgot your password 'link ");
		return new Page_password(driver);
	}

	public Page_myAccount clkSignAccount() {
		btn_signIn.click();
		log.info("Clicked on 'Sign in' button ");
		TestBase.test.log(Status.INFO, "Clicked on 'Sign in' button ");
		return new Page_myAccount(driver);
	}

	public void signIn(String email, String password) {
		setAlreadyRegisteredEmailAddress(email);
		setPassword(password);
		clkSignAccount();
	}
}
