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

public class Page_identity {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_identity.class);

	public Page_identity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_identity Class Object Created");
		TestBase.test.log(Status.INFO, "Page_identity Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_myAccount;

	@FindBy(xpath = "//*[@id='center_column']/div/h1")
	public WebElement lbl_yourPersonalInformation;

	@FindBy(xpath = "//*[@id='center_column']/div/p[1]")
	public WebElement lbl_pleaseBeSureToUpadate;

	@FindBy(xpath = "//*[@id='id_gender1']")
	public WebElement radio_mr;

	@FindBy(xpath = "//*[@id='id_gender2']")
	public WebElement radio_mrs;

	@FindBy(xpath = "//*[@id='firstname']")
	public WebElement txt_firstName;

	@FindBy(xpath = "//*[@id='lastname']")
	public WebElement txt_lastName;

	@FindBy(xpath = "//*[@id='email']")
	public WebElement txt_emailAddress;

	@FindBy(xpath = "//*[@id='days']")
	public WebElement dd_day;

	@FindBy(xpath = "//*[@id='months']")
	public WebElement dd_month;

	@FindBy(xpath = "//*[@id='years']")
	public WebElement dd_year;

	@FindBy(xpath = "//*[@id='old_passwd']")
	public WebElement txt_currentPassword;

	@FindBy(xpath = "//*[@id='passwd']")
	public WebElement txt_newPassword;

	@FindBy(xpath = "//*[@id='confirmation']")
	public WebElement txt_confirmation;

	@FindBy(xpath = "//*[@id='newsletter']")
	public WebElement cb_signUpForOurNewsLetter;

	@FindBy(xpath = "//*[@id='optin']")
	public WebElement cb_reciveSpecialOffersFromOurPartners;

	@FindBy(xpath = "//*[@id='center_column']/div/form/fieldset/div[11]/button")
	public WebElement btn_save;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/a")
	public WebElement btn_backToYourAccount;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[2]/a")
	public WebElement btn_home;

	@FindBy(xpath = "//*[@id='center_column']/div/div")
	public WebElement lbl_thereIsError;

	@FindBy(xpath = "//*[@id='center_column']/div/p")
	public WebElement lbl_yourPersonalInformtionHasBeenUpdated;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_myAccount clkMyAccount() {
		link_myAccount.click();
		log.info("Clicked on 'My account' linke");
		TestBase.test.log(Status.INFO, "Clicked on 'My account' linke");
		return new Page_myAccount(driver);
	}

	public void chkMr() {
		radio_mr.click();
		log.info("Checked 'Mr' radio button");
		TestBase.test.log(Status.INFO, "Checked 'Mr' radio button");
	}

	public void chkMrs() {
		radio_mrs.click();
		log.info("Checked 'Mrs' radio button");
		TestBase.test.log(Status.INFO, "Checked 'Mrs' radio button");

	}

	public void setFirstName(String fname) {
		txt_firstName.clear();
		txt_firstName.sendKeys(fname);
		log.info("Typed = " + fname + " on 'First name' field");
		TestBase.test.log(Status.INFO, "Typed = " + fname + " on 'First name' field");
	}

	public void setLastName(String lname) {
		txt_lastName.clear();
		txt_lastName.sendKeys(lname);
		log.info("Typed = " + lname + " on 'Last name' field");
		TestBase.test.log(Status.INFO, "Typed = " + lname + " on 'Last name' field");
	}

	public void setEmailAddress(String email) {
		txt_emailAddress.clear();
		txt_emailAddress.sendKeys(email);
		log.info("Typed = " + email + " on 'Email Address' field");
		TestBase.test.log(Status.INFO, "Typed = " + email + " on 'Email Address' field");
	}

	public void selectDay(String day) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_day, day);
	}

	public void selectMonth(String month) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_month, month);
	}

	public void selectYear(String year) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_year, year);
	}

	public void setCurrentPassword(String currentPassword) {
		txt_currentPassword.clear();
		txt_currentPassword.sendKeys(currentPassword);
		log.info("Typed = " + currentPassword + " on 'Current Password ' field");
		TestBase.test.log(Status.INFO, "Typed = " + currentPassword + " on 'Current Password ' field");

	}

	public void setNewPassword(String newPassword) {
		txt_newPassword.clear();
		txt_newPassword.sendKeys(newPassword);
		log.info("Typed = " + newPassword + " on 'New Password ' field");
		TestBase.test.log(Status.INFO, "Typed = " + newPassword + " on 'New Password ' field");

	}

	public void setConfirmation(String confirmation) {
		txt_confirmation.clear();
		txt_confirmation.sendKeys(confirmation);
		log.info("Typed = " + confirmation + " on 'confirmation' field");
		TestBase.test.log(Status.INFO, "Typed = " + confirmation + " on 'confirmation' field");

	}

	public void chkSignUpForOurNewLetter() {
		cb_signUpForOurNewsLetter.click();
		log.info("Checked 'Sign up for our newletter' check box");
		TestBase.test.log(Status.INFO, "Checked 'Sign up for our newletter' check box");

	}

	public void chkRecieveSpecialOffersFromOurPartners() {
		cb_reciveSpecialOffersFromOurPartners.click();
		log.info("Checked 'recieve special offers from our partners'");
		TestBase.test.log(Status.INFO, "Checked 'recieve special offers from our partners'");

	}

	public void clkSave() {
		btn_save.click();
		log.info("Clicked on 'Save' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Save' button");

	}

	public Page_myAccount clkBackToMyAccount() {
		btn_backToYourAccount.click();
		log.info("Clicked on 'Back to your account' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Back to your account' button");
		return new Page_myAccount(driver);
	}

	public Page_index clkHome() {
		btn_home.click();
		log.info("Clicked on 'Home' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home' button");
		return new Page_index(driver);
	}

}
