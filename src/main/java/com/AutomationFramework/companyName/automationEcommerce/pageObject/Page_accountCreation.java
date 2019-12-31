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

public class Page_accountCreation {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_accountCreation.class);

	public Page_accountCreation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_accountCreation Class Object Created");
		TestBase.test.log(Status.INFO, "Page_accountCreation Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='noSlide']/h1")
	public WebElement lbl_createAnAccount;

	@FindBy(xpath = "//*[@id='account-creation_form']/div[1]/h3")
	public WebElement lbl_yourPersonalInformation;

	@FindBy(xpath = "//*[@id='id_gender1']")
	public WebElement rdo_mr;

	@FindBy(xpath = "//*[@id='id_gender2']")
	public WebElement rdo_mrs;

	@FindBy(xpath = "//*[@id='customer_firstname']")
	public WebElement txt_firstName;

	@FindBy(xpath = "//*[@id='customer_lastname']")
	public WebElement txt_lastName;

	@FindBy(xpath = "//*[@id='email']")
	public WebElement txt_email;

	@FindBy(xpath = "//*[@id='passwd']")
	public WebElement txt_password;

	@FindBy(xpath = "//*[@id='days']")
	public WebElement dd_day;

	@FindBy(xpath = "//*[@id='months']")
	public WebElement dd_month;

	@FindBy(xpath = "//*[@id='years']")
	public WebElement dd_year;

	@FindBy(xpath = "//*[@id='newsletter']")
	public WebElement cb_signUpForNewletter;

	@FindBy(xpath = "//*[@id='optin']")
	public WebElement cb_reciveSpecialOffers;

	@FindBy(xpath = "//*[@id='account-creation_form']/div[2]/h3")
	public WebElement lbl_yourAddress;

	@FindBy(xpath = "//*[@id='firstname']")
	public WebElement txt_yourAddress_firstName;

	@FindBy(xpath = "//*[@id='lastname']")
	public WebElement txt_yourAddress_lastName;

	@FindBy(xpath = "//*[@id='company']")
	public WebElement txt_yourAddress_company;

	@FindBy(xpath = "//*[@id='address1']")
	public WebElement txt_yourAddress_address1;

	@FindBy(xpath = "//*[@id='address2']")
	public WebElement txt_yourAddress_address2;

	@FindBy(xpath = "//*[@id='city']")
	public WebElement txt_yourAddress_city;

	@FindBy(xpath = "//*[@id='id_state']")
	public WebElement dd_yourAddress_state;

	@FindBy(xpath = "//*[@id='postcode']")
	public WebElement txt_yourAddress_postalCode;

	@FindBy(xpath = "//*[@id='id_country']")
	public WebElement dd_yourAddress_coutry;

	@FindBy(xpath = "//*[@id='other']")
	public WebElement txt_yourAddress_additionalInformation;

	@FindBy(xpath = "//*[@id='phone']")
	public WebElement txt_yourAddress_homePhone;

	@FindBy(xpath = "//*[@id='phone_mobile']")
	public WebElement txt_yourAddress_mobilePhone;

	@FindBy(xpath = "//*[@id='alias']")
	public WebElement txt_yourAddress_assignAnAddressAlias;

	@FindBy(xpath = "//*[@id='submitAccount']")
	public WebElement btn_register;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home Icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home Icon' button");
		return new Page_index(driver);
	}

	public void chkMr() {
		rdo_mr.click();
		log.info("Checked 'Mr' checkbox");
		TestBase.test.log(Status.INFO, "Checked 'Mr' checkbox");
	}

	public void chkMrs() {
		rdo_mrs.click();
		log.info("Checked 'Mrs' checkbox");
		TestBase.test.log(Status.INFO, "Checked 'Mrs' checkbox");
	}

	public void setFirstName(String firstName) {
		txt_firstName.sendKeys(firstName);
		log.info("Typed ='" + firstName + "' text on 'first name' field");
		TestBase.test.log(Status.INFO, "Typed ='" + firstName + "' text on first name field");
	}

	public void setLastName(String lastName) {
		txt_lastName.sendKeys(lastName);
		log.info("Typed ='" + lastName + "' text on 'last name' field");
		TestBase.test.log(Status.INFO, "Typed ='" + lastName + "' text on last name field");
	}

	public void setEmail(String email) {
		txt_email.sendKeys(email);
		log.info("Typed ='" + email + "' text on 'Email' field");
		TestBase.test.log(Status.INFO, "Typed ='" + email + "' text on 'Email' field");
	}

	public void setPassword(String password) {
		txt_password.sendKeys(password);
		log.info("Typed ='" + password + "' text on 'password' field");
		TestBase.test.log(Status.INFO, "Typed ='" + password + "' text on 'password' field");
	}

	public void setDateOfBirth_day(String day) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_day, day);
	}

	public void setDateOfBirth_month(String month) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_month, month);
	}

	public void setDateOfBirth_year(String year) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_year, year);
	}

	public void chkSignUpForOurNewsletter() {
		cb_signUpForNewletter.click();
		log.info("Checked 'sign up for our newsletter' checkbox");
		TestBase.test.log(Status.INFO, "Checked 'sign up for our newsletter' checkbox");
	}

	public void chkRecieveSpecialOffers() {
		cb_reciveSpecialOffers.click();
		log.info("Checked 'recieve special offers from our partners' checkbox");
		TestBase.test.log(Status.INFO, "Checked 'recieve special offers from our partners' checkbox");
	}

	public void setYourAddress_firstName(String firstname) {
		txt_yourAddress_firstName.sendKeys(firstname);
		log.info("Typed ='" + firstname + "' text on 'first name' field");
		TestBase.test.log(Status.INFO, "Typed ='" + firstname + "' text on 'first name' field");
	}

	public void setYourAddress_lastName(String lastname) {
		txt_yourAddress_lastName.sendKeys(lastname);
		log.info("Typed ='" + lastname + "' text on 'last name' field");
		TestBase.test.log(Status.INFO, "Typed ='" + lastname + "' text on 'last name' field");
	}

	public void setYourAddress_company(String company) {
		txt_yourAddress_company.sendKeys(company);
		log.info("Typed ='" + company + "' text on 'company' field");
		TestBase.test.log(Status.INFO, "Typed ='" + company + "' text on 'company' field");
	}

	public void setYourAddress_address1(String address1) {
		txt_yourAddress_address1.sendKeys(address1);
		log.info("Typed ='" + address1 + "' text on 'address1' field");
		TestBase.test.log(Status.INFO, "Typed ='" + address1 + "' text on 'address1' field");
	}

	public void setYourAddress_address2(String address2) {
		txt_yourAddress_address2.sendKeys(address2);
		log.info("Typed ='" + address2 + "' text on 'address2' field");
		TestBase.test.log(Status.INFO, "Typed ='" + address2 + "' text on 'address2' field");
	}

	public void setYourAddress_city(String city) {
		txt_yourAddress_city.sendKeys(city);
		log.info("Typed ='" + city + "' text on 'city' field");
		TestBase.test.log(Status.INFO, "Typed ='" + city + "' text on 'city' field");
	}

	public void setYourAddress_State(String state) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_yourAddress_state, state);
	}

	public void setYourAddress_postalCode(String postalcode) {
		txt_yourAddress_postalCode.sendKeys(postalcode);
		log.info("Typed ='" + postalcode + "' text on 'zip/postal code' field");
		TestBase.test.log(Status.INFO, "Typed ='" + postalcode + "' text on 'zip/postal code' field");
	}

	public void setYourAddress_country(String country) {
		DropdownHelper ddh = new DropdownHelper(driver);
		ddh.selectByVisibleText(dd_yourAddress_coutry, country);
	}

	public void setYourAddress_additionalInformation(String additionalInformation) {
		txt_yourAddress_additionalInformation.sendKeys(additionalInformation);
		log.info("Typed ='" + additionalInformation + "' text on 'additional inforamtion' field");
		TestBase.test.log(Status.INFO, "Typed ='" + additionalInformation + "' text on 'additional inforamtion' field");
	}

	public void setYourAddress_homePhone(String homephone) {
		txt_yourAddress_homePhone.sendKeys(homephone);
		log.info("Typed ='" + homephone + "' text on 'Home Phone' field");
		TestBase.test.log(Status.INFO, "Typed ='" + homephone + "' text on 'Home Phone' field");
	}

	public void setYourAddress_mobilePhone(String mobilephone) {
		txt_yourAddress_mobilePhone.sendKeys(mobilephone);
		log.info("Typed ='" + mobilephone + "' text on 'Mobile Phone' field");
		TestBase.test.log(Status.INFO, "Typed ='" + mobilephone + "' text on 'Mobile Phone' field");
	}

	public void setYourAddress_assignAnAddressAlias(String assignAnAddressAlias) {
		txt_yourAddress_assignAnAddressAlias.sendKeys(assignAnAddressAlias);
		log.info("Typed ='" + assignAnAddressAlias + "' text on 'Assign an address alias for future reference' field");
		TestBase.test.log(Status.INFO,"Typed ='" + assignAnAddressAlias + "' text on 'Assign an address alias for future reference' field");
	}

	public Page_myAccount clkRegister() {
		btn_register.click();
		log.info("Clicked on 'Register' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Register' button");
		return new Page_myAccount(driver);
	}
}
