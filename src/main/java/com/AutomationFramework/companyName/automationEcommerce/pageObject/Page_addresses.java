package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_addresses {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_addresses.class);
	
	public Page_addresses(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("Page_addresses Class Object Created");
		TestBase.test.log(Status.INFO,"Page_addresses Class Object Created");	
	}
	
	
	@FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_myAccount;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_myAddresses;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/ul/li[1]/h3")
	public WebElement lbl_addressBlockSavedTitles;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/ul")
	public List<WebElement> addressBlocks;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/ul/li[9]/a[1]")
	public List<WebElement> btn_update;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/div/div/ul/li[9]/a[2]")
	public List<WebElement> btn_delete;
	
	@FindBy(xpath = "//*[@id='center_column']/div[2]/a")
	public WebElement btn_addNewAddress;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/a")
	public WebElement btn_backToYourAccount;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[2]/a")
	public WebElement btn_home;

	public Page_index clkHomeIcon(){
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}
	public Page_myAccount clkMyAccount(){
		link_myAccount.click();
		log.info("Clicked on 'my account' link");
		TestBase.test.log(Status.INFO, "Clicked on 'my account' link");
		return new Page_myAccount(driver);
	}
	
	public Page_address clkUpdate(int buttonNumber){
		btn_update.get(buttonNumber-1).click();
		log.info("Clicked on 'update' button '"+buttonNumber+"'");
		TestBase.test.log(Status.INFO, "Clicked on 'update' button '"+buttonNumber+"'");
		return new Page_address(driver);
	}
	public void clkDelete(int buttonNumber){
		btn_delete.get(buttonNumber-1).click();
		log.info("Clicked on 'delete' button '"+buttonNumber+"'");
		TestBase.test.log(Status.INFO, "Clicked on 'delete' button '"+buttonNumber+"'");
	}
	
	public Page_address clkAddNewAddress(){
		btn_addNewAddress.click();
		log.info("Clicked on 'Add new address' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Add new address' button");
		return new Page_address(driver);
	}
	
	public Page_myAccount clkBackToYourAccount(){
		btn_backToYourAccount.click();
		log.info("Clicked on 'Back to your account' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Back to your account' button");
		return new Page_myAccount(driver);
	}
	
	public Page_index clkHome(){
		btn_home.click();
		log.info("Clicked on 'Home' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home' button");
		return new Page_index(driver);
	}
	
}
