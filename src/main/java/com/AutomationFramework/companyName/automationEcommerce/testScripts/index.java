package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.action.ActionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.AssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.SoftAssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.VerificationHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.config.PropertiesReaderClass;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.wait.WaitHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_index;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_product;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Popup_productAddedInCartStatus;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Popup_productQuickView;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;

public class index extends TestBase {
	Logger log = LoggerHelper.getLogger(index.class);
	Page_index pg_index;
	VerificationHelper vh;
	WaitHelper wh;
	ActionHelper ah;
	Popup_productQuickView popup_productQuickView;
	Popup_productAddedInCartStatus popup_productAddedInCartStatus;
	Page_product pg_product;

	@Test(enabled = false)
	public void TC_index_ID_01_VerifyShopNowButtonFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkShopNow(1);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(),
				PropertiesReaderClass.getProperty("prestashopPageUrl"));
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_02_VerifyShopNowButtonFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkShopNow(2);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(),
				PropertiesReaderClass.getProperty("prestashopPageUrl"));
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_03_VerifyShopNowButtonFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkShopNow(3);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(),
				PropertiesReaderClass.getProperty("prestashopPageUrl"));
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_04_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkAdPoster2();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_05_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkadPoster3();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_06_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkadPoster4();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_07_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkadPoster5();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_08_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkadPoster6();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_09_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkadPoster7();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_10_VerifyAdPosterFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		pg_index = new Page_index(driver);
		pg_index.clkadPoster8();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://www.prestashop.com/en?ab=1");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_11_VerifyQuickViewButtonFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		vh = new VerificationHelper(driver);

		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		ah = new ActionHelper(driver);
		pg_index = new Page_index(driver);
		pg_index.clkBestSellers();
		ah.moveToElement(pg_index.link_productNames.get(2));
		pg_index.clkQucikView(3);
		popup_productQuickView = new Popup_productQuickView(driver);
		wh.waitForElementToBeVisible(popup_productQuickView.window_popup_productQuickView, 10, 1);
		Boolean status = vh.verifyIsElementDisplayed(popup_productQuickView.window_popup_productQuickView);
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_12_VerifyAddToCartButtonFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		vh = new VerificationHelper(driver);

		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		ah = new ActionHelper(driver);
		pg_index = new Page_index(driver);
		ah.moveToElement(pg_index.link_productNames.get(2));
		pg_index.clkAddToCart(3);
		popup_productAddedInCartStatus = new Popup_productAddedInCartStatus(driver);
		Boolean status = vh.verifyIsElementDisplayed(popup_productAddedInCartStatus.window_productAddedInCartStatus);
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_index_ID_13_VerifyMoreButtonFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		vh = new VerificationHelper(driver);

		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		ah = new ActionHelper(driver);
		pg_index = new Page_index(driver);
		ah.moveToElement(pg_index.link_productNames.get(2));
		String productName = pg_index.link_productNames.get(2).getText();
		pg_index.clkMore(3);
		getNavigatedPageUrlLog();
		Boolean status = vh.verifyContains(driver.getCurrentUrl(), "controller=product");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_product = new Page_product(driver);
		status = vh.verifyContains(pg_product.txt_PageInfoBar.getText(), productName);
		softassert.assertTrue(status);
		softassert.assertAll();
	}

	@Test(enabled = false)
	public void TC_index_ID_14_VerifyProductNameLinkFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		vh = new VerificationHelper(driver);

		getUrl(PropertiesReaderClass.getIndexPageUrl());
		getNavigatedPageUrlLog();
		ah = new ActionHelper(driver);
		pg_index = new Page_index(driver);
		ah.moveToElement(pg_index.link_productNames.get(2));
		String productName = pg_index.link_productNames.get(2).getText();
		pg_index.link_productNames.get(2).click();
		getNavigatedPageUrlLog();
		Boolean status = vh.verifyContains(driver.getCurrentUrl(), "controller=product");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_product = new Page_product(driver);
		status = vh.verifyContains(pg_product.txt_PageInfoBar.getText(), productName);
		softassert.assertTrue(status);
		softassert.assertAll();
	}

	@Test(enabled = false)
	public void TC_index_ID_15_VerifySeleniumFrameworkLinkFunctinality() {
		wh = new WaitHelper(driver);
		wh.setPageLoadTimeout(30);
		wh.setImpliciteWait(30);
		vh = new VerificationHelper(driver);

		getUrl(PropertiesReaderClass.getIndexPageUrl());
		pg_index = new Page_index(driver);
		pg_index.btn_seleniumFramework.click();
		getNavigatedPageUrlLog();
		Boolean status = vh.verifyContains(driver.getCurrentUrl(), "http://www.seleniumframework.com/");
		AssertionHelper.updateTestStatus(status);

	}

}
