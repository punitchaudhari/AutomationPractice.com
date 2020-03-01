package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_orderSlip {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_orderSlip.class);

	public Page_orderSlip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_orderSlip Class Object Created");
		TestBase.test.log(Status.INFO, "Page_orderSlip Class Object Created");
	}

	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement txt_PageInfoBar;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_myAccount;

	@FindBy(xpath = "//*[@id='columns']/div[1]/span[3]")
	public WebElement lbl_creditSlips1;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_creditSlips2;

	@FindBy(xpath = "//*[@id='center_column']/p")
	public WebElement lbl_creditSlipsYouHaveRecieved;

	@FindBy(xpath = "//*[@id='block-history']/p")
	public WebElement lbl_youHaveNotRecievedAnyCreditSlips;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/a")
	public WebElement btn_backToYourAccount;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[2]/a")
	public WebElement btn_home;

	public Page_index clkHomeIcon1() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}

	public Page_myAccount clkMyAccount() {
		link_myAccount.click();
		log.info("Clicked on 'my account' link");
		TestBase.test.log(Status.INFO, "Clicked on 'my account' link");
		return new Page_myAccount(driver);
	}

	public Page_myAccount clkBackToYourAccont() {
		btn_backToYourAccount.click();
		log.info("Clicked on 'back to your account' button");
		TestBase.test.log(Status.INFO, "Clicked on 'back to your account' button");
		return new Page_myAccount(driver);
	}

	public Page_index clkHome() {
		btn_home.click();
		log.info("Clicked on 'Home'  button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home'  button");
		return new Page_index(driver);
	}

}
