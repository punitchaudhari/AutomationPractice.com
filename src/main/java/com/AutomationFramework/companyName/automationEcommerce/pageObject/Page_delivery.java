package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_delivery {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_delivery.class);
	
	public Page_delivery(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_delivery Class Object Created");
		TestBase.test.log(Status.INFO,"Page_delivery Class Object Created");	
	}
	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='center_column']/div/h2")
	public WebElement lbl_shipmentsAndReturns;
	
	@FindBy(xpath = "//*[@id='center_column']/div/h3")
	public WebElement lbl_yourPackShipment;
	

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}
	
}
