package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.AssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.SoftAssertionHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.assertion.VerificationHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.config.PropertiesReaderClass;
import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.wait.WaitHelper;
import com.AutomationFramework.companyName.automationEcommerce.helper.window.WindowHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Footer;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Header;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_aboutUs;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_authentication;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_bestSales;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_contact;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_index;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_myAccount;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_newProducts;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_pricesDrop;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_sitemap;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_stores;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_termsAndConditionsOfUse;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_women;
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
	Page_women pg_women;
	Page_pricesDrop pg_priceDrop;
	Page_newProducts pg_newProducts;
	Page_bestSales pg_bestSales;
	Page_stores pg_stores;
	Page_termsAndConditionsOfUse pg_termsAndConditionsOfUse;
	Page_aboutUs pg_aboutUs;
	Page_sitemap pg_sitemap;

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

	@Test(enabled = false)
	public void TC_footer_ID_05_verifyFacebookButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkFacebook();
		getNavigatedPageUrlLog();
		vh = new VerificationHelper(driver);
		WindowHelper windowhelper = new WindowHelper(driver);
		windowhelper.switchToWindowByIndexNumber(1);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(),
				"https://www.facebook.com/groups/525066904174158/");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_footer_ID_06_verifyTwitterButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkTwitter();
		getNavigatedPageUrlLog();
		WindowHelper windowhelper = new WindowHelper(driver);
		windowhelper.switchToWindowByIndexNumber(1);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(), "https://twitter.com/seleniumfrmwrk");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_footer_ID_07_verifyYoutubeButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkYoutube();
		getNavigatedPageUrlLog();
		WindowHelper windowhelper = new WindowHelper(driver);
		windowhelper.switchToWindowByIndexNumber(1);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(),
				"https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = false)
	public void TC_footer_ID_08_verifyGooglePlusButtonFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkGooglePlus();
		getNavigatedPageUrlLog();
		WindowHelper windowhelper = new WindowHelper(driver);
		windowhelper.switchToWindowByIndexNumber(1);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyTextEquals(driver.getCurrentUrl(),
				"https://plus.google.com/111979135243110831526/posts");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_09_verifyWomenLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkWomen();
		getNavigatedPageUrlLog();
		pg_women = new Page_women(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_women.txt_PageInfoBar), "Women");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_10_verifySpecialsLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkSpecials();
		getNavigatedPageUrlLog();
		pg_priceDrop = new Page_pricesDrop(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_priceDrop.txt_PageInfoBar), "Price drop");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_11_verifyNewProductsLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkNewProducts();
		getNavigatedPageUrlLog();
		pg_newProducts = new Page_newProducts(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_newProducts.txt_PageInfoBar), "New products");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_12_verifyBestSellersLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkBestSellers();
		getNavigatedPageUrlLog();
		pg_bestSales = new Page_bestSales(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_bestSales.txt_PageInfoBar), "Best sellers");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_13_verifyOurStoresLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkOurStores();
		getNavigatedPageUrlLog();
		pg_stores = new Page_stores(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_stores.txt_PageInfoBar), "Our store(s)!");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_14_verifyContactusLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkContactUs();
		getNavigatedPageUrlLog();
		pg_contact = new Page_contact(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_contact.txt_PageInfoBar), "Contact");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_15_verifyTermsAndConditionsOfUseLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkTermsAndConditionsOfUse();
		getNavigatedPageUrlLog();
		pg_termsAndConditionsOfUse = new Page_termsAndConditionsOfUse(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_termsAndConditionsOfUse.txt_PageInfoBar),
				"Terms and conditions of use");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_16_verifyAboutUsLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkAboutUs();
		getNavigatedPageUrlLog();
		pg_aboutUs = new Page_aboutUs(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_aboutUs.txt_PageInfoBar), "About us");
		AssertionHelper.updateTestStatus(status);
	}

	@Test(enabled = true)
	public void TC_footer_ID_17_verifySitemapLinkFunctionality() {
		wh = new WaitHelper(driver);
		wh.setImpliciteWait(60);
		wh.setPageLoadTimeout(60);
		getUrl(PropertiesReaderClass.getIndexPageUrl());
		footer = new Footer(driver);
		footer.clkSitemap();
		getNavigatedPageUrlLog();
		pg_sitemap = new Page_sitemap(driver);
		vh = new VerificationHelper(driver);
		Boolean status = vh.verifyContains(vh.getTextFromElement(pg_sitemap.txt_PageInfoBar), "Sitemap");
		AssertionHelper.updateTestStatus(status);
	}

}
