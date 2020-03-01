package com.AutomationFramework.companyName.automationEcommerce.testScripts;

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
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_index;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_myAccount;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_password;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class authentication extends TestBase {
	Logger log = LoggerHelper.getLogger(authentication.class);
	Header header;
	WaitHelper wh;
	VerificationHelper vh;
	Page_authentication pg_authentication;
	Page_myAccount pg_myAccount;
	Page_index pg_index;
	Page_password pg_password;

	@Test(enabled = false)
	public void TC_authentication_ID_01_verifyHomeIconbuttonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getAuthenticationPageUrl());
		pg_authentication = new Page_authentication(driver);
		pg_authentication.clkHomeIcon();
		pg_index = new Page_index(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), PropertiesReaderClass.getIndexPageUrl());
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_authentication_ID_02_verifySectionTitles() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getAuthenticationPageUrl());
		pg_authentication = new Page_authentication(driver);

		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(vh.getTextFromElement(pg_authentication.lbl_authentication),
				"AUTHENTICATION");
		SoftAssertionHelper softAssert = new SoftAssertionHelper();
		softAssert.assertTrue(status);

		status = vh.verifyTextEquals(vh.getTextFromElement(pg_authentication.lbl_createAnAccount), "CREATE AN ACCOUNT");
		softAssert.assertTrue(status);

		status = vh.verifyTextEquals(vh.getTextFromElement(pg_authentication.lbl_alreadyRegistered),
				"ALREADY REGISTERED?");
		softAssert.assertTrue(status);
		softAssert.assertAll();
	}

	@Test(enabled = false)
	public void TC_authentication_ID_03_verifyLabel() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getAuthenticationPageUrl());
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(vh.getTextFromElement(pg_authentication.lbl_pleaseEnterYourEmailAddress),
				"Please enter your email address to create an account.");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_authentication_ID_04_verifyErrorMessage() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getAuthenticationPageUrl());
		pg_authentication = new Page_authentication(driver);
		pg_authentication.clkCreateAccountButton();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(vh.getTextFromElement(pg_authentication.lbl_Invalid_email_address),
				"Invalid email address.");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_authentication_ID_05_verifyForgotYourPassswordLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getAuthenticationPageUrl());
		pg_authentication = new Page_authentication(driver);
		pg_authentication.clkForgotYourPassword();
		pg_password = new Page_password(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_password.txt_PageInfoBar), "Forgot your password");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_authentication_ID_06_verifyErrorMessage() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getAuthenticationPageUrl());
		pg_authentication = new Page_authentication(driver);
		pg_authentication.clkSignAccount();
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_authentication.lbl_An_email_address_required),
				"An email address required.");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_authentication_ID_07_verifyLoginFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());

		header = new Header(driver);
		header.clkSignIn();
		getNavigatedPageUrlLog();
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_authentication.signIn(PropertiesReaderClass.getValidEmail(), PropertiesReaderClass.getValidPassword());
		getNavigatedPageUrlLog();
		pg_myAccount = new Page_myAccount(driver);
		status = vh.verifyContains(pg_myAccount.txt_PageInfoBar.getText(), "My account");
		softassert.assertTrue(status);
		softassert.assertAll();
	}

	@Test(enabled = false)
	public void TC_authentication_ID_08_verifyLoginFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());

		header = new Header(driver);
		header.clkSignIn();
		getNavigatedPageUrlLog();
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_authentication.signIn(PropertiesReaderClass.getValidEmail(), PropertiesReaderClass.getInvalidPassword());
		getNavigatedPageUrlLog();
		status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		softassert.assertTrue(status);
		softassert.assertAll();
	}

	@Test(enabled = false)
	public void TC_authentication_ID_09_verifyLoginFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());

		header = new Header(driver);
		header.clkSignIn();
		getNavigatedPageUrlLog();
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_authentication.signIn(PropertiesReaderClass.getInvalidEmail(), PropertiesReaderClass.getInvalidPassword());
		getNavigatedPageUrlLog();
		status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		softassert.assertTrue(status);
		softassert.assertAll();
	}

	@Test(enabled = false)
	public void TC_authentication_ID_10_verifyLoginFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());

		header = new Header(driver);
		header.clkSignIn();
		getNavigatedPageUrlLog();
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_authentication.signIn(PropertiesReaderClass.getInvalidEmail(), PropertiesReaderClass.getValidPassword());
		getNavigatedPageUrlLog();
		status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		softassert.assertTrue(status);
		softassert.assertAll();
	}

}
