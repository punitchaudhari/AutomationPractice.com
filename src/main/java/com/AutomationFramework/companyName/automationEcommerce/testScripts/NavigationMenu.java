package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.AssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.VerificationHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_women;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class NavigationMenu extends TestBase{
Logger log = LoggerHelper.getLogger(NavigationMenu.class);
com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu nm;
Page_women women;
VerificationHelper vh;

	@Test(enabled=true)
	public void verifyWomenButtonFunctionality(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		nm.clk_Menu_WOMEN();
		log.info("Navigated to url= "+ driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= "+ driver.getCurrentUrl());
		women = new Page_women(driver);
		vh = new VerificationHelper(driver);
		String actualText=vh.getTextFromElement(women.txt_women);
		Boolean status = vh.verifyTextEquals(actualText, "Women");
		AssertionHelper.updateTestStatus(status);
		
		
	}
}
