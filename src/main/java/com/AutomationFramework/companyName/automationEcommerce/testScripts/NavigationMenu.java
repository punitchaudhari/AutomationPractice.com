package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.action.ActionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.AssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.VerificationHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.config.PropertiesReaderClass;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.wait.WaitHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_blouses;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_casualDresses;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_dresses;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_eveningDresses;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_summerDresses;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_tops;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_tshirts;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_women;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class NavigationMenu extends TestBase {
	Logger log = LoggerHelper.getLogger(NavigationMenu.class);
	com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu nm;
	VerificationHelper vh;
	WaitHelper wh;
	ActionHelper action;
	Page_women women;
	Page_dresses dresses;
	Page_tshirts tshirts;
	Page_tops tops;
	Page_blouses blouses;
	Page_casualDresses casualdresses;
	Page_summerDresses summerdresses;
	Page_eveningDresses eveningdresses;
	

	@Test(enabled = false)
	public void ID01_verifyWomenButtonFunctionality() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		nm.clk_Menu_WOMEN();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		women = new Page_women(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(women.txt_PageInfoBar);
		Boolean status = vh.verifyTextEquals(actualText, "Women");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void ID02_verifyDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		nm.clk_Menu_DRESSES();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		dresses = new Page_dresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(dresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void ID03_verifyTshirtsButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		nm.clk_Menu_TSHIRTS();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		tshirts = new Page_tshirts(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(tshirts.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "T-shirts");
		AssertionHelper.updateTestStatus(status);
	}
	@Test(enabled = true)
	public void ID04_verifyTopsButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_tops();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		tops = new Page_tops(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(tops.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Tops");
		AssertionHelper.updateTestStatus(status);
	}
	

}
