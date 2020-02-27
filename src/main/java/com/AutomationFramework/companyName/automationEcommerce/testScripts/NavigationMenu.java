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
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_yourShoppingCart;
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
	Page_yourShoppingCart pg_yourShoppingCart;

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_01_verifyWomenMenuButtonFunctionality() {
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
		Boolean status = vh.verifyContains(actualText, "Women");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_02_verifyDressesMenuButtonFunctionality() {
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
	public void TC_navigatioMenu_ID_03_verifyTshirtsMenuButtonFunctionality() {
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

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_04_verifyTopsButtonFunctionality() {
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

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_05_verifyTshirtsButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_tshirts();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		tshirts = new Page_tshirts(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(tshirts.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "T-shirts");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void ITC_navigatioMenu_ID_06_verifyBlousesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_blouses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		blouses = new Page_blouses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(blouses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Blouses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_07_verifyDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_dresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		dresses = new Page_dresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(dresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_08_verifyCasualDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_casualDresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		casualdresses = new Page_casualDresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(casualdresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Casual Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_09_verifyEveningDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_eveningDresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		eveningdresses = new Page_eveningDresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(eveningdresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Evening Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_10_verifySummerDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_women);
		nm.clk_WOMEN_summerDresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		summerdresses = new Page_summerDresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(summerdresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Summer Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_11_verifyCasualDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_dresses);
		nm.clk_DRESSES_casualDresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		casualdresses = new Page_casualDresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(casualdresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Casual Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_12_verifyEveningDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_dresses);
		nm.clk_DRESSES_eveningDresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		eveningdresses = new Page_eveningDresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(eveningdresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Evening Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_13_verifySummerDressesButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		action = new ActionHelper(driver);
		action.moveToElement(nm.lbl_dresses);
		nm.clk_DRESSES_summerDresses();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		summerdresses = new Page_summerDresses(driver);
		vh = new VerificationHelper(driver);
		String actualText = vh.getTextFromElement(summerdresses.txt_PageInfoBar);
		Boolean status = vh.verifyContains(actualText, "Summer Dresses");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_14_verifyYourLogoImageFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);

		nm.clk_yourLogo();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());

		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), PropertiesReaderClass.getIndexPageUrl());
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_navigatioMenu_ID_15_verifyCartButonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());
		wh.setPageLoadTimeout(60);
		nm = new com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu(driver);
		nm.clk_cart();

		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());

		vh = new VerificationHelper(driver);
		pg_yourShoppingCart = new Page_yourShoppingCart(driver);
		Boolean status = vh.verifyContains(pg_yourShoppingCart.txt_PageInfoBar.getText(), "Your shopping cart");
		AssertionHelper.updateTestStatus(status);
	}

}
