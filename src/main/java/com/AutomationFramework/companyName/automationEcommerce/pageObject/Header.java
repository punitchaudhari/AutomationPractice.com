package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Header {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Header.class);
	
	public Header(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("HeaderBar Class Object Created");
		TestBase.test.log(Status.INFO,"HeaderBar Class Object Created");	
	}
	

	
	@FindBy(xpath="//*[@id='header']/div[1]/div/div/a/img")
	public WebElement img_sale;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/span/strong")
	public WebElement lbl_callUsNowContactNumber;
	
	@FindBy(xpath="//*[@id='contact-link']/a")
	public WebElement link_contactUs;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	public WebElement link_signOut;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public WebElement link_signIn;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]")
	public WebElement link_userAccount;
	
	
	public void clkImageSale(){
		img_sale.click();
		log.info("Clicking on Image Sale 70% off all products");
		TestBase.test.log(Status.INFO,"Clicking on Image Sale 70% off all products");
	}
	public void clkContactUs(){
		link_contactUs.click();
		log.info("Clicking on 'Contact Us'");
		TestBase.test.log(Status.INFO,"Clicking on 'Contact Us'");
	}
	public void clkSignIn(){
		link_signIn.click();
		log.info("Clicking on 'Sign In'");
		TestBase.test.log(Status.INFO,"Clicking on 'Sign In'");
	}
	public void clkSignOut(){
		link_signOut.click();
		log.info("Clicking on 'Sign Out'");
		TestBase.test.log(Status.INFO,"Clicking on 'Sign Out'");
	}
	public void clkAccount(){
		link_userAccount.click();
		log.info("Clicking on User Account");
		TestBase.test.log(Status.INFO,"Clicking on User Account");
	}
	
}
