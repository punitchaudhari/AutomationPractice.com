package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
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
	
}
