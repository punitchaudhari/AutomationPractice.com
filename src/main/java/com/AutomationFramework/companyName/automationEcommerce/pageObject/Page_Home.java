package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_Home {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_Home.class);

	public Page_Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_Home Class Object Created");
		TestBase.test.log(Status.INFO, "Page_Home Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='center_column']/div/h1/a")
	public WebElement link_home;

	@FindBy(xpath = "//*[@id='center_column']/div/p")
	public WebElement lbl_listOfPageInHome;

	@FindBy(xpath = "//*[@id='center_column']/div/ul/li[1]/a")
	public WebElement link_delivery;

	@FindBy(xpath = "//*[@id='center_column']/div/ul/li[2]/a")
	public WebElement link_legalNotice;

	@FindBy(xpath = "//*[@id='center_column']/div/ul/li[3]/a")
	public WebElement link_termsAndConditonsOfUse;

	@FindBy(xpath = "//*[@id='center_column']/div/ul/li[4]/a")
	public WebElement link_aboutUs;

	@FindBy(xpath = "//*[@id='center_column']/div/ul/li[5]/a")
	public WebElement link_securePayment;

	public Page_index clkHomeIcon1() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_index clkHome() {
		link_home.click();
		log.info("Clicked on 'Home' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Home' link");
		return new Page_index(driver);
	}

	public Page_delivery clkDelivery() {
		link_delivery.click();
		log.info("Clicked on 'Delivery' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Delivery' link");
		return new Page_delivery(driver);
	}

	public Page_legalNotice clkLegalNotice() {
		link_legalNotice.click();
		log.info("Clicked on 'Legal notice' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Legal notice' link");
		return new Page_legalNotice(driver);
	}

	public Page_termsAndConditionsOfUse clkTermsAndConditionsOfUse() {
		link_termsAndConditonsOfUse.click();
		log.info("Clicked on 'Terms and coditions of use' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Terms and coditions of use' link");
		return new Page_termsAndConditionsOfUse(driver);
	}

	public Page_aboutUs clkAboutUs() {
		link_aboutUs.click();
		log.info("Clicked on 'About us' link");
		TestBase.test.log(Status.INFO, "Clicked on 'About us' link");
		return new Page_aboutUs(driver);
	}

	public Page_securePayment clkSecurePayment() {
		link_securePayment.click();
		log.info("Clicked on 'Secure payment' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Secure payment' link");
		return new Page_securePayment(driver);
	}

}
