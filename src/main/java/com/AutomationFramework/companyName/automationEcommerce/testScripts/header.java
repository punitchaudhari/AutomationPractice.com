package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.AssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.SoftAssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.VerificationHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.config.PropertiesReaderClass;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.wait.WaitHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Header;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_authentication;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_contact;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_index;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_myAccount;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_women;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class header extends TestBase {
	Logger log = LoggerHelper.getLogger(header.class);
	VerificationHelper vh;
	WaitHelper wh;
	SoftAssertionHelper softassert;
	Header header;
	Page_index pg_index;
	Page_contact pg_contact;
	Page_authentication pg_authentication;
	Page_myAccount pg_myAccount;

	@Test(enabled = true)
	public void TC_header_ID_01_verifySale70percentageOffImageFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		header = new Header(driver);
		header.clkImageSale();

		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());

		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), PropertiesReaderClass.getIndexPageUrl());
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_header_ID_02_verifyCallUsNowContactNumberFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		header = new Header(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(vh.getTextFromElement(header.lbl_callUsNowContactNumber), "0123-456-789");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_header_ID_03_verifyContactUsTabButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		header = new Header(driver);
		header.clkContactUs();

		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());

		pg_contact = new Page_contact(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_contact.txt_PageInfoBar), "Contact");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_header_ID_04_verifySignInButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		header = new Header(driver);
		header.clkSignIn();

		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());

		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_authentication.txt_PageInfoBar), "Authentication");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_header_ID_05_verifySignoutButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		header = new Header(driver);
		header.clkSignIn();

		getNavigatedPageUrlLog();

		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_authentication.txt_PageInfoBar), "Authentication");

		softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);

		pg_authentication.signIn(PropertiesReaderClass.getValidEmail(), PropertiesReaderClass.getValidPassword());
		getNavigatedPageUrlLog();
		header.clkSignOut();
		getNavigatedPageUrlLog();

		status = vh.verifyContains(vh.getTextFromElement(pg_authentication.txt_PageInfoBar), "Authentication");
		softassert.assertTrue(status);
		softassert.assertAll();

	}

	@Test(enabled = true)
	public void TC_header_ID_06_verifyUsernameButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		header = new Header(driver);
		header.clkSignIn();
		getNavigatedPageUrlLog();
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_authentication.txt_PageInfoBar), "Authentication");

		softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);

		pg_authentication.signIn(PropertiesReaderClass.getValidEmail(), PropertiesReaderClass.getValidPassword());
		getNavigatedPageUrlLog();
		header.clkAccount();
		getNavigatedPageUrlLog();
		pg_myAccount = new Page_myAccount(driver);
		status = vh.verifyContains(vh.getTextFromElement(pg_myAccount.txt_PageInfoBar), "My account");

		softassert.assertTrue(status);
		softassert.assertAll();

	}

}
