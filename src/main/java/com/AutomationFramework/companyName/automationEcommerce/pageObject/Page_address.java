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

public class Page_address {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_address.class);

	public Page_address(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_address Class Object Created");
		TestBase.test.log(Status.INFO, "Page_address Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='center_column']/div/h1")
	public WebElement lbl_yourAddresses;

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

	@FindBy(xpath = "//*[@id='phone']")
	public WebElement txt_yourAddress_homePhone;

	@FindBy(xpath = "//*[@id='phone_mobile']")
	public WebElement txt_yourAddress_mobilePhone;

	@FindBy(xpath = "//*[@id='other']")
	public WebElement txt_yourAddress_additionalInformation;

	@FindBy(xpath = "//*[@id='alias']")
	public WebElement txt_pleaseAssignAnAddressTitle;

	@FindBy(xpath = "//*[@id='submitAddress']")
	public WebElement btn_save;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/a")
	public WebElement btn_backToYourAddress;

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

	public void setYourAddress_additionalInformation(String additionalInformation) {
		txt_yourAddress_additionalInformation.sendKeys(additionalInformation);
		log.info("Typed ='" + additionalInformation + "' text on 'additional inforamtion' field");
		TestBase.test.log(Status.INFO, "Typed ='" + additionalInformation + "' text on 'additional inforamtion' field");
	}

	public void setYourAddress_PleaseAssignAnAddressTitle(String addresTitle) {
		txt_pleaseAssignAnAddressTitle.sendKeys(addresTitle);
		log.info("Typed ='" + addresTitle + "' text on 'PleaseAssignAnAddressTitle' field");
		TestBase.test.log(Status.INFO, "Typed ='" + addresTitle + "' text on 'PleaseAssignAnAddressTitle' field");
	}

	public Page_addresses clkSave() {
		btn_save.click();
		log.info("Clicked on 'Save' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Save' button");
		return new Page_addresses(driver);
	}

	public Page_addresses clkBackToYourAddresses() {
		btn_backToYourAddress.click();
		log.info("Clicked on 'Back to your addresses' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Back to your addresses' button");
		return new Page_addresses(driver);
	}

}
