package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Page_index {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_index.class);

	public Page_index(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Page_index Class Object Created");
		TestBase.test.log(Status.INFO, "Page_index Class Object Created");
	}
	
	@FindBy(xpath="//*[@id='homeslider']/li/div/p[2]/button")
	public List<WebElement>  btn_shopNow;
	
	@FindBy(xpath="//*[@id='htmlcontent_top']/ul/li[1]/a")
	public WebElement  img_adPoster2;
	
	@FindBy(xpath="//*[@id='htmlcontent_top']/ul/li[2]/a")
	public WebElement  img_adPoster3;
	
	@FindBy(xpath="//*[@id='homepage-slider']/div/div[2]/div/a[2]")
	public WebElement  btn_next;
	
	@FindBy(xpath="//*[@id='homepage-slider']/div/div[2]/div/a[1]")
	public WebElement  btn_prev;
	
	@FindBy(xpath="//*[@id='home-page-tabs']/li[1]/a")
	public WebElement  btn_popular;
	
	@FindBy(xpath="//*[@id='home-page-tabs']/li[2]/a")
	public WebElement  btn_bestSellers;
	
	@FindBy(xpath="//*[@id='blockbestsellers']/li/div/div[1]/div/a[2]")
	public List<WebElement>  btn_quickView;
	
	@FindBy(xpath="//*[@id='blockbestsellers']/li/div/div[1]/div/div[2]/span[1]")
	public List<WebElement>  lbl_productPrice;
	
	@FindBy(xpath="//*[@id='blockbestsellers']/li/div/div[1]/div/div[2]/span[2]")
	public List<WebElement>  lbl_productDiscountPrice;
	
	@FindBy(xpath="//*[@id='blockbestsellers']/li/div/div[1]/div/div[2]/span[3]")
	public List<WebElement>  lbl_productDiscountPercentage;
	
	@FindBy(xpath="//*[@id='blockbestsellers']/li/div/div[2]/h5/a")
	public List<WebElement>  link_productNames;
	
	@FindBy(xpath="//*[@id='homefeatured']/li/div/div[2]/div[2]/a[1]")
	public List<WebElement>  btn_addToCart;
	
	@FindBy(xpath="//*[@id='homefeatured']/li/div/div[2]/div[2]/a[2]")
	public List<WebElement>  btn_more;
	
	@FindBy(xpath="//*[@id='htmlcontent_home']/ul/li[1]/a")
	public WebElement  img_adPoster4;
	
	@FindBy(xpath="//*[@id='htmlcontent_home']/ul/li[2]/a")
	public WebElement  img_adPoster5;
	
	@FindBy(xpath="//*[@id='htmlcontent_home']/ul/li[3]/a")
	public WebElement  img_adPoster6;
	
	@FindBy(xpath="//*[@id='htmlcontent_home']/ul/li[4]/a")
	public WebElement  img_adPoster7;
	
	@FindBy(xpath="//*[@id='htmlcontent_home']/ul/li[4]/a")
	public WebElement  img_adPoster8;
	
	@FindBy(xpath="//*[@id='cmsinfo_block']/div[1]/ul/li[2]/div/p/a")
	public WebElement  btn_seleniumFramework;

	public void clkShopNow(int buttonNumber) {
		btn_shopNow.get(buttonNumber - 1).click();
		log.info("Clicked on button = '" + (buttonNumber) + "'");
		TestBase.test.log(Status.INFO, "Clicked on button = '" + (buttonNumber) + "'");

	}

	public void clkAdPoster2() {
		img_adPoster2.click();
		log.info("Clicked on ' 2nd ad poster' image ");
		TestBase.test.log(Status.INFO, "Clicked on ' 2nd ad poster' image ");

	}

	public void clkadPoster3() {
		img_adPoster3.click();
		log.info("Clicked on '3rd ad poster' image  ");
		TestBase.test.log(Status.INFO, "Clicked on '3rd ad poster' image  ");

	}

	public void clkadPoster4() {
		img_adPoster4.click();
		log.info("Clicked on '4th ad poster' image  ");
		TestBase.test.log(Status.INFO, "Clicked on '4th ad poster' image  ");

	}

	public void clkadPoster5() {
		img_adPoster5.click();
		log.info("Clicked on '5th ad poster' image  ");
		TestBase.test.log(Status.INFO, "Clicked on '5th ad poster' image  ");

	}

	public void clkadPoster6() {
		img_adPoster6.click();
		log.info("Clicked on '6th ad poster' image  ");
		TestBase.test.log(Status.INFO, "Clicked on '6th ad poster' image  ");

	}

	public void clkadPoster7() {
		img_adPoster7.click();
		log.info("Clicked on '7th ad poster' image  ");
		TestBase.test.log(Status.INFO, "Clicked on '7th ad poster' image  ");

	}

	public void clkadPoster8() {
		img_adPoster8.click();
		log.info("Clicked on '8th ad poster' image  ");
		TestBase.test.log(Status.INFO, "Clicked on '8th ad poster' image  ");

	}

	public void clkNext() {
		btn_next.click();
		log.info("Clicked on 'next ad' button  ");
		TestBase.test.log(Status.INFO, "Clicked on 'next ad' button  ");

	}

	public void clkPrev() {
		btn_prev.click();
		log.info("Clicked on 'Prev ad' button  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Prev ad' button  ");

	}

	public void clkPopular() {
		btn_popular.click();
		log.info("Clicked on 'POPULAR' button");
		TestBase.test.log(Status.INFO, "Clicked on 'POPULAR' button");

	}

	public void clkBestSellers() {
		btn_bestSellers.click();
		log.info("Clicked on 'BEST SELLERS' button  ");
		TestBase.test.log(Status.INFO, "Clicked on 'BEST SELLERS' button  ");

	}

	public void clkQucikView(int buttonNumber) {
		btn_quickView.get(buttonNumber - 1).click();
		log.info("Clicked on 'Quick View' button number = '" + buttonNumber + "' ");
		TestBase.test.log(Status.INFO, "Clicked on 'Quick View' button = '" + buttonNumber + "' ");

	}

	public void clkAddToCart(int buttonNumber) {
		btn_addToCart.get(buttonNumber - 1).click();
		log.info("Clicked on 'Add to cart' button number = '" + buttonNumber + "' ");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to cart' button number = '" + buttonNumber + "' ");

	}

	public Page_product clkMore(int buttonNumber) {
		btn_more.get(buttonNumber - 1).click();
		log.info("Clicked on 'More' button number = '" + buttonNumber + "'  ");
		TestBase.test.log(Status.INFO, "Clicked on 'More' button number = '" + buttonNumber + "'  ");
		return new Page_product(driver);
	}

}
