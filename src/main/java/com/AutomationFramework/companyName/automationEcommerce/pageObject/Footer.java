package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Footer {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Footer.class);
	
	public Footer(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("FooterBar Class Object Created");
		TestBase.test.log(Status.INFO,"FooterBar Class Object Created");	
	}
	
	@FindBy(id="newsletter-input")
	public WebElement txt_newsletter;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	public WebElement btn_submit_Newsletter;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[1]/a")
	public WebElement link_facebook;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[2]/a")
	public WebElement link_twitter;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[3]/a")
	public WebElement link_youtube;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[4]/a")
	public WebElement link_googlePlus;
	
	@FindBy(xpath="//*[@id='footer']/div/section[2]/div/div/ul/li/a")
	public WebElement link_women;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[1]/a")
	public WebElement link_specials;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[2]/a")
	public WebElement link_newProducts;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[3]/a")
	public WebElement link_bestSellers;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[4]/a")
	public WebElement link_ourStores;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[5]/a")
	public WebElement link_contactUs;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[6]/a")
	public WebElement link_termsAndConditionsOfUse;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[7]/a")
	public WebElement link_aboutUs;
	
	@FindBy(xpath="//*[@id='block_various_links_footer']/ul/li[8]/a")
	public WebElement link_sitemap;
	
	@FindBy(xpath="//*[@id='footer']/div/section[5]/div/ul/li[1]/a")
	public WebElement link_myOrders;
	
	@FindBy(xpath="//*[@id='footer']/div/section[5]/div/ul/li[2]/a")
	public WebElement link_myCreditSlips;
	
	@FindBy(xpath="//*[@id='footer']/div/section[5]/div/ul/li[3]/a")
	public WebElement link_myAddresses;
	
	@FindBy(xpath="//*[@id='footer']/div/section[5]/div/ul/li[4]/a")
	public WebElement link_myPersonalInfo;
	
	@FindBy(xpath="//*[@id='footer']/div/section[5]/div/ul/li[5]/a")
	public WebElement link_signOut;
	
	@FindBy(xpath="//*[@id='block_contact_infos']/div/ul/li[1]")
	public WebElement lbl_storeInformation_address;
	
	@FindBy(xpath="//*[@id='block_contact_infos']/div/ul/li[2]/span")
	public WebElement lbl_storeInformation_callUsNow;
	
	@FindBy(xpath="//*[@id='block_contact_infos']/div/ul/li[3]/span/a")
	public WebElement link_storeInformation_email;
	
	@FindBy(xpath="//*[@id='footer']/div/section[4]/div/a")
	public WebElement link_ecommerceSoftwareByPrestaShop;	
	
	
	public void setNewsLetterEmail(String email){
		txt_newsletter.sendKeys(email);
		log.info("Typed = '"+email+"' on newsletter field");
		TestBase.test.log(Status.INFO, "Typed = '"+email+"' on newsletter field");
	}
	public void clkSubmitNewsLetterEmailArrowButton(){
		btn_submit_Newsletter.click();
		log.info("Clicking on newslettersubmit arrow button next to email field");
		TestBase.test.log(Status.INFO, "Clicking on newslettersubmit arrow button next to email field");
	}
	public void clkFacebook(){
		link_facebook.click();
		log.info("Clicking on 'facebook image link'");
		TestBase.test.log(Status.INFO, "Clicking on 'facebook image link'");
	}
	public void clkTwitter(){
		link_twitter.click();
		log.info("Clicking on 'Twitter image link'");
		TestBase.test.log(Status.INFO, "Clicking on 'Twitter image link'");
	}
	public void clkYoutube(){
		link_youtube.click();
		log.info("Clicking on 'Youtube image link'");
		TestBase.test.log(Status.INFO,"Clicking on 'Youtube image link'" );
	}
	public void clkGooglePlus(){
		link_googlePlus.click();
		log.info("Clicking on 'Google Plud image link'");
		TestBase.test.log(Status.INFO, "Clicking on 'Google Plud image link'");
	}
	public void clkWomen(){
		link_women.click();
		log.info("Clicking on 'women' link");
		TestBase.test.log(Status.INFO, "Clicking on 'women' link");
	}
	public void clkSpecials(){
		link_specials.click();
		log.info("Clicking on 'specials'");
		TestBase.test.log(Status.INFO, "Clicking on 'specials'");
	}
	public void clkNewProducts(){
		link_newProducts.click();
		log.info("Clicking on 'new products'");
		TestBase.test.log(Status.INFO, "Clicking on 'new products'");
	}
	public void clkBestSellers(){
		link_bestSellers.click();
		log.info("Clicking on 'best sellers");
		TestBase.test.log(Status.INFO, "Clicking on 'best sellers");
	}
	public void clkOurStores(){
		link_ourStores.click();
		log.info("Clicking on 'Our Stores' link");
		TestBase.test.log(Status.INFO,"Clicking on 'Our Stores' link" );
	}
	public void clkContactUs(){
		link_contactUs.click();
		log.info("Clicking on 'Contact Us' link");
		TestBase.test.log(Status.INFO,"Clicking on 'Contact Us' link" );
	}
	public void clkTermsAndConditionsOfUse(){
		link_termsAndConditionsOfUse.click();
		log.info("Clicking on 'Terms and conditions of use link");
		TestBase.test.log(Status.INFO, "Clicking on 'Terms and conditions of use link");
	}
	public void clkAboutUs(){
		link_aboutUs.click();
		log.info("Clicking on 'About Us' link ");
		TestBase.test.log(Status.INFO, "Clicking on 'About Us' link ");
	}
	public void clkSitemap(){
		link_sitemap.click();
		log.info("Clicking on 'sitemap' link");
		TestBase.test.log(Status.INFO,"Clicking on 'sitemap' link" );
	}
	public void clkMyOrders(){
		link_myOrders.click();
		log.info("Clicking on 'My orders' link");
		TestBase.test.log(Status.INFO, "Clicking on 'My orders' link");
	}
	public void clkMyCreditSlips(){
		link_myCreditSlips.click();
		log.info("Clicking on 'My credit slips' link");
		TestBase.test.log(Status.INFO, "Clicking on 'My credit slips' link");
	}
	public void clkMyAddresses(){
		link_myAddresses.click();
		log.info("Clicking on 'My addresses' link");
		TestBase.test.log(Status.INFO, "Clicking on 'My addresses' link");
	}
	public void clkMyPersonalInfo(){
		link_myPersonalInfo.click();
		log.info("Clicking on 'My personal info' link");
		TestBase.test.log(Status.INFO, "Clicking on 'My personal info' link");
	}
	public void clkSignOut(){
		link_signOut.click();
		log.info("Clicking on 'Sign Out' link");
		TestBase.test.log(Status.INFO, "Clicking on 'Sign Out' link");
	}
	public void clkEmail(){
		link_storeInformation_email.click();
		log.info("Clicking on email link under Store Information block");
		TestBase.test.log(Status.INFO, "Clicking on email link under Store Information block");
	}
	public void clkEcommerceSoftwareByPrestashop(){
		link_ecommerceSoftwareByPrestaShop.click();
		log.info("Clicking on 'commerce software by PrestaShop™' link");
		TestBase.test.log(Status.INFO, "Clicking on 'commerce software by PrestaShop™' link");
	}

/*	public void clk(){
		
		log.info("Clicking");
		TestBase.test.log(Status.INFO, );
	}
*/
		
	

}

	
