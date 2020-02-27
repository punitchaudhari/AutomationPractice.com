package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_myAccount {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_myAccount.class);
	
	public Page_myAccount(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("Page_myAccount Class Object Created");
		TestBase.test.log(Status.INFO,"Page_myAccount Class Object Created");	
	}
	
	@FindBy(xpath="//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]")
	public WebElement txt_PageInfoBar;
	
	@FindBy(xpath="//*[@id='center_column']/h1")
	public WebElement lbl_myAccount;
	
	@FindBy(xpath="//*[@id='center_column']/p")
	public WebElement lbl_welcomeToYourAccount;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[1]/a")
	public WebElement btn_orderHistoryAndDetails;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[2]/a")
	public WebElement btn_myCreditSlips;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[3]/a")
	public WebElement btn_myAddresses;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[4]/a")
	public WebElement btn_myPersonalInformation;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[2]/ul/li/a")
	public WebElement btn_myWhishlists;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li/a")
	public WebElement btn_home;
	

	public Page_index clkHomeIcon(){
		img_homeIcon.click();
		log.info("Clicking on 'home icon'");
		TestBase.test.log(Status.INFO, "Clicking on 'home icon'");
		return new Page_index(driver);
	}
	public Page_history clkOrderHistoryAndDetails(){
		btn_orderHistoryAndDetails.click();
		log.info("Clicking on 'Order History And Details");
		TestBase.test.log(Status.INFO, "Clicking on 'Order History And Details");
		return new Page_history(driver); 
	}
	public Page_orderSlip clkMyCreditSlips(){
		btn_myCreditSlips.click();
		log.info("Clicking on 'My Credit Slips'");
		TestBase.test.log(Status.INFO, "Clicking on 'My Credit Slips'");
		return new Page_orderSlip(driver);
	}
	public Page_addresses clkMyAddresses(){
		btn_myAddresses.click();
		log.info("Clicking on 'My Addresses'");
		TestBase.test.log(Status.INFO, "Clicking on 'My Addresses'");
		return new Page_addresses(driver);
	}
	public Page_identity clkMyPersonalInformation(){
		btn_myPersonalInformation.click();
		log.info("Clicking on 'My Personal Information'");
		TestBase.test.log(Status.INFO, "Clicking on 'My Personal Information'");
		return new Page_identity(driver);
	}
	public  Page_myWishList clkMyWhishLists(){
		btn_myWhishlists.click();
		log.info("Clicking on 'My Whishlists'");
		TestBase.test.log(Status.INFO, "Clicking on 'My Whishlists'");
		return new Page_myWishList(driver);
	}
	public Page_index clkHome (){
		btn_home.click();
		log.info("Clicking on 'Home button'");
		TestBase.test.log(Status.INFO, "Clicking on 'Home button'");
		return new Page_index(driver);
	}
	

	
	
}
