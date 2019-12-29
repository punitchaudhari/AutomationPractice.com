package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_tops {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_tops.class);
	
	public Page_tops(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("Page_tops Class Object Created");
		TestBase.test.log(Status.INFO,"Page_tops Class Object Created");	
	}

}
