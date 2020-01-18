package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_sitemap {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_sitemap.class);
	
	public Page_sitemap(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_sitemap Class Object Created");
		TestBase.test.log(Status.INFO,"Page_sitemap Class Object Created");	
	}
	@FindBy(xpath = "//*[@id='columns']/div[1]/a")
	public WebElement img_homeIcon;
	
	@FindBy(xpath = "//*[@id='columns']/div[1]/span[2]")
	public WebElement lbl_sitemap1;
	
	@FindBy(xpath = "//*[@id='center_column']/h1")
	public WebElement lbl_sitemap2;
	
	
//	OUR OFFERS SECTION
	@FindBy(xpath = "//*[@id='sitemap_content']/div[1]/div/h3")
	public WebElement lbl_ourOffers;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[1]/div/ul/li[1]/a")
	public WebElement link_newProducts;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[1]/div/ul/li[2]/a")
	public WebElement link_bestSellers;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[1]/div/ul/li[3]/a")
	public WebElement link_priceDrop;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[1]/div/ul/li[4]/a")
	public WebElement link_manufacturers;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[1]/div/ul/li[5]/a")
	public WebElement link_supplies;
	
//Your Account Section
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/h3")
	public WebElement lbl_yourAccount;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li//a[@title='Manage your customer account']")
	public WebElement link_yourAccount;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li//a[@title='Manage your personal information']")
	public WebElement link_personalInformation;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li[3]/a")
	public WebElement link_Addreses;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li[4]/a")
	public WebElement link_orderHistory;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li[5]/a")
	public WebElement link_signout;
	
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li//a[@title='Authentication']")
	public WebElement link_authentication;
		
	@FindBy(xpath = "//*[@id='sitemap_content']/div[2]/div/ul/li//a[@title='Create new account']")
	public WebElement link_createNewAccount;
	
//	CATEGORIES SECTION
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/h3")
	public WebElement lbl_categories;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/div/a")
	public WebElement btn_homeLogo;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/a")
	public WebElement link_women;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[1]/a")
	public WebElement link_tops;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[1]/ul/li[1]/a")
	public WebElement link_tShirts;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[1]/ul/li[2]/a")
	public WebElement link_blouses;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[2]/a")
	public WebElement link_dresses;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[2]/ul/li[1]/a")
	public WebElement link_casualDresses;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[2]/ul/li[2]/a")
	public WebElement link_eveningDresses;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[1]/div/ul/li/ul/li[2]/ul/li[3]/a")
	public WebElement link_summerDresses;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/h3")
	public WebElement lbl_pages;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[1]/a")
	public WebElement link_home;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[2]/a")
	public WebElement link_Delivery;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[3]/a")
	public WebElement link_legalNotice;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[4]/a")
	public WebElement link_termsAndConditonsOfUse;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[5]/a")
	public WebElement link_aboutUs;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[6]/a")
	public WebElement link_securePayment;
	
	@FindBy(xpath = "//*[@id='listpage_content']/div[2]/div/ul/li[7]/a")
	public WebElement link_contact;
	
	
	
	public Page_index clkHomeIcon1() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' button");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' button");
		return new Page_index(driver);
	}
	public Page_newProducts clkNewProducts() {
		link_newProducts.click();
		log.info("Clicked on 'new products' link");
		TestBase.test.log(Status.INFO, "Clicked on 'new products' link");
		return new Page_newProducts(driver);
	}
	public Page_bestSales clkBestSellers() {
		link_bestSellers.click();
		log.info("Clicked on 'Best Sellers' link");
		TestBase.test.log(Status.INFO, "Clicked on 'new products'");
		return new Page_bestSales(driver);
	}
	public Page_pricesDrop clkPricDrop() {
		link_priceDrop.click();
		log.info("Clicked on 'price drop' link");
		TestBase.test.log(Status.INFO, "Clicked on 'price drop' link");
		return new Page_pricesDrop(driver);
	}
	public Page_manufacturer clkManufacturers() {
		link_manufacturers.click();
		log.info("Clicked on 'Manufacturers' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Manufacturers' link");
		return new Page_manufacturer(driver);
	}
	public Page_supplier clkSuppliers() {
		link_supplies.click();
		log.info("Clicked on 'Suppliers' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Suppliers' link");
		return new Page_supplier(driver);
	}
	public Page_myAccount clkYourAccount() {
		link_yourAccount.click();
		log.info("Clicked on 'Your account' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Your account' link");
		return new Page_myAccount(driver);
	}
	public Page_identity clkPersonalInformation() {
		link_personalInformation.click();
		log.info("Clicked on 'Personal information'");
		TestBase.test.log(Status.INFO, "Clicked on 'Personal information'");
		return new Page_identity(driver);
	}
	public Page_addresses clkAddresses() {
		link_Addreses.click();
		log.info("Clicked on 'Addresses' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Addresses' link");
		return new Page_addresses(driver);
	}
	public Page_history clkOrderHistory() {
		link_orderHistory.click();
		log.info("Clicked on 'Order history' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Order history' link");
		return new Page_history(driver);
	}
	public Page_sitemap clkSignOut() {
		link_signout.click();
		log.info("Clicked on 'Sign out' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Sign out' link");
		return new Page_sitemap(driver);
	}
	public  Page_authentication clkAuthentication() {
		link_authentication.click();
		log.info("Clicked on 'Authentication' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Authentication' link");
		return new Page_authentication(driver);
	}
	public Page_authentication clkCreateNewAuccount() {
		link_createNewAccount.click();
		log.info("Clicked on 'Create new account' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Create new account' link");
		return new Page_authentication(driver);
	}
	public Page_index clkHomeIcon2() {
		btn_homeLogo.click();
		log.info("Clicked on 'Home icon'");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon'");
		return new Page_index(driver);
	}
	public Page_women clkWomen() {
		link_women.click();
		log.info("Clicked on 'Women' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Women' link");
		return new Page_women(driver);
	}
	public Page_tops clkTops() {
		link_tops.click();
		log.info("Clicked on 'Tops' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Tops' link");
		return new Page_tops(driver);
	}
	public Page_tshirts clkTshirts() {
		link_tShirts.click();
		log.info("Clicked on 'Tshirts' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Tshirts' link");
		return new Page_tshirts(driver);
	}
	public Page_blouses clkBlouses() {
		link_blouses.click();
		log.info("Clicked on 'Blouses' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Blouses' link");
		return new Page_blouses(driver);
	}
	public Page_casualDresses clkCasualDresses() {
		link_casualDresses.click();
		log.info("Clicked on 'Casual Dresses' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Casual Dresses' link");
		return new Page_casualDresses(driver);
	}
	public Page_eveningDresses clkEveningDresses() {
		link_eveningDresses.click();
		log.info("Clicked on 'Evening dresses' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Evening dresses' link");
		return new Page_eveningDresses(driver);
	}
	public Page_summerDresses clkSummerDresses() {
		link_summerDresses.click();
		log.info("Clicked on 'Summer dresses' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Summer dresses' link");
		return new Page_summerDresses(driver);
	}
	public Page_Home clkHome() {
		link_home.click();
		log.info("Clicked on 'Home' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Home' link");
		return new Page_Home(driver);
	}
	public Page_delivery clkDelivery() {
		link_Delivery.click();
		log.info("Clicked on 'Delivery' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Delivery' link");
		return new Page_delivery(driver);
	}
	public Page_legalNotice clkLegalNotice() {
		link_legalNotice.click();
		log.info("Clicked on 'Legal notice' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Legal notice' link");
		return new Page_legalNotice(driver);
	}
	public Page_termsAndConditionsOfUse clkTermsAndConditionsOfUse() {
		link_termsAndConditonsOfUse.click();
		log.info("Clicked on 'Terms and conditions of use' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Terms and conditions of use' link");
		return new Page_termsAndConditionsOfUse(driver);
	}
	public Page_aboutUs clkAboutUs() {
		link_aboutUs.click();
		log.info("Clicked on 'About us' link");
		TestBase.test.log(Status.INFO, "Clicked on 'About us' link");
		return new Page_aboutUs(driver);
	}
	
	public Page_securePayment clkSecurePayment() {
		link_securePayment.click();
		log.info("Clicked on 'Secure payment' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Secure payment' link");
		return new Page_securePayment(driver);
	}
	
	public Page_contact clkContact() {
		link_contact.click();
		log.info("Clicked on 'Contact' link");
		TestBase.test.log(Status.INFO, "Clicked on 'Contact' link");
		return new Page_contact(driver);
	}
	

}
