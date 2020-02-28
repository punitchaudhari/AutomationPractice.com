package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.AssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.SoftAssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.VerificationHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.config.PropertiesReaderClass;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.wait.WaitHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Footer;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Header;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_authentication;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_contact;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_index;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_myAccount;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class footer extends TestBase {
	Logger log = LoggerHelper.getLogger(header.class);
	VerificationHelper vh;
	WaitHelper wh;
	SoftAssertionHelper softassert;
	Footer footer;
	Page_index pg_index;
	Page_contact pg_contact;
	Page_authentication pg_authentication;
	Page_myAccount pg_myAccount;

	@Test(enabled = false)
	public void TC_footer_ID_01_verifyNewsletterSubscriptionFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.setNewsLetterEmail("testmail20@yahoo.com");
		footer.clkSubmitNewsLetterEmailArrowButton();

		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(footer.lbl_Newsletter_subscription_alert_status),
				"Newsletter : You have successfully subscribed to this newsletter.");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_footer_ID_02_verifyNewsletterSubscriptionFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.setNewsLetterEmail("testmail20@yahoo.com");
		footer.clkSubmitNewsLetterEmailArrowButton();

		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(footer.lbl_Newsletter_subscription_alert_status),
				"Newsletter : This email address is already registered.");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_footer_ID_03_verifyNewsletterSubscriptionFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.setNewsLetterEmail("testmail22@yahoo.com");
		footer.clkSubmitNewsLetterEmailArrowButton();
		String actualText = footer.txt_newsletter.getAttribute("value");
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(actualText, "You have successfully subscribed to this newsletter.");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_footer_ID_04_verifyNewsletterSubscriptionFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.setNewsLetterEmail("testmail22@yahoo.com");
		footer.clkSubmitNewsLetterEmailArrowButton();
		String actualText = footer.txt_newsletter.getAttribute("value");
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(actualText, "This email address is already registered.");
		AssertionHelper.updateTestStatus(status);
	}

}
