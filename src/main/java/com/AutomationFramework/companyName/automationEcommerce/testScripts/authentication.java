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
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_myAccount;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class authentication extends TestBase {
	Logger log = LoggerHelper.getLogger(authentication.class);
	Header header;
	WaitHelper wh;
	VerificationHelper vh;
	Page_authentication pg_authentication;
	Page_myAccount pg_myAccount;

	@Test
	public void ID_verifyLoginFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		driver.get(PropertiesReaderClass.getIndexPageUrl());

		header = new Header(driver);
		header.clkSignIn();
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		pg_authentication = new Page_authentication(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(pg_authentication.txt_PageInfoBar.getText(), "Authentication");
		SoftAssertionHelper softassert = new SoftAssertionHelper();
		softassert.assertTrue(status);
		pg_authentication.signIn(PropertiesReaderClass.getValidEmail(), PropertiesReaderClass.getValidPassword());
		log.info("Navigated to url= " + driver.getCurrentUrl());
		TestBase.test.log(Status.INFO, "Navigated to url= " + driver.getCurrentUrl());
		pg_myAccount = new Page_myAccount(driver);
		status = vh.verifyContains(pg_myAccount.txt_PageInfoBar.getText(), "My account");
		softassert.assertTrue(status);
		softassert.assertAll();
	}

}
