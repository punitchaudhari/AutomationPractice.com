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

public class Page_tops {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Page_tops.class);

	public Page_tops(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		log.info("Page_tops Class Object Created");
		TestBase.test.log(Status.INFO, "Page_tops Class Object Created");
	}

	@FindBy(xpath = "	//*[@id='columns']/div[1]/a[1]")
	public WebElement img_homeIcon;

	@FindBy(xpath = "//*[@id='columns']/div[1]/a[2]")
	public WebElement link_women;

	@FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[1]/a")
	public WebElement link_tShirts;

	@FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[2]/a")
	public WebElement link_blouses;

	@FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
	public WebElement lbl_thereAreProducts;

	@FindBy(xpath = "//*[@id='subcategories']/ul/li[1]/div[1]/a")
	public WebElement img_tShirts;

	@FindBy(xpath = "//*[@id='subcategories']/ul/li[2]/div[1]/a")
	public WebElement img_blouses;

	@FindBy(xpath = "//*[@id='selectProductSort']")
	public WebElement dd_sortBy;

	@FindBy(xpath = "//*[@id='list']/a")
	public WebElement btn_list;

	@FindBy(xpath = "//*[@id='grid']/a")
	public WebElement btn_grid;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[1]/div/a[2]")
	public List<WebElement> btn_quickView;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[1]/div/div[2]/span")
	public List<WebElement> lbl_productPrice;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/h5/a")
	public List<WebElement> link_productName;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]")
	public List<WebElement> btn_addToCart;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]")
	public List<WebElement> btn_more;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[3]/ul/li")
	public List<WebElement> btn_color;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/span/span")
	public List<WebElement> lbl_productStockStatus;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[3]/div[1]/a")
	public List<WebElement> btn_addToWhishlist;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[3]/div[2]/a")
	public List<WebElement> btn_addToCompare;

	@FindBy(xpath = "//*[@id='center_column']/div[3]/div[2]/form/button")
	public WebElement btn_compareButton1;

	@FindBy(xpath = "//*[@id='center_column']/div[4]/div/form/button")
	public WebElement btn_compareButton2;

	public Page_index clkHomeIcon() {
		img_homeIcon.click();
		log.info("Clicked on 'Home icon' image  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Home icon' image  ");
		return new Page_index(driver);
	}

	public Page_women clkWomen() {
		link_women.click();
		log.info("Clicked on 'Women' link  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Women' link  ");
		return new Page_women(driver);
	}

	public Page_tshirts clkTshirts() {
		link_tShirts.click();
		log.info("Clicked on 'Tshirts' link  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Tshirts' link  ");
		return new Page_tshirts(driver);
	}

	public Page_blouses clkBlouses() {
		link_blouses.click();
		log.info("Clicked on 'Blouses' link  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Blouses' link  ");
		return new Page_blouses(driver);
	}

	public Page_tshirts clkTshirtsImage() {
		img_tShirts.click();
		log.info("Clicked on 'tshirts' image  ");
		TestBase.test.log(Status.INFO, "Clicked on 'tshirts' image  ");
		return new Page_tshirts(driver);
	}

	public Page_blouses clkBousesImage() {
		img_blouses.click();
		log.info("Clicked on 'Blouses' image  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Blouses' image  ");
		return new Page_blouses(driver);
	}

	public void clkGrid() {
		btn_grid.click();
		log.info("Clicked on 'Grid' button  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Grid' button  ");

	}

	public void clkList() {
		btn_list.click();
		log.info("Clicked on 'List' button  ");
		TestBase.test.log(Status.INFO, "Clicked on 'List' button  ");

	}

	public void clkQuickView(int buttonNumber) {
		btn_quickView.get(buttonNumber - 1).click();
		log.info("Clicked on 'qucik view' button number = '" + buttonNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'qucik view' button number = '" + buttonNumber + "'");

	}

	public void clkProductName(int ProductNumber) {
		link_productName.get(ProductNumber - 1).click();
		log.info("Clicked on '" + link_productName.get(ProductNumber - 1).getText().trim() + "'");
		TestBase.test.log(Status.INFO, "Clicked on '" + link_productName.get(ProductNumber - 1).getText().trim() + "'");

	}

	public void clkAddToCart(int buttonNumber) {
		btn_addToCart.get(buttonNumber - 1).click();
		log.info("Clicked on 'add to cart' button number = '" + buttonNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'add to cart' button number = '" + buttonNumber + "'");

	}

	public Page_product clkMore(int buttonNumber) {
		btn_more.get(buttonNumber - 1).click();
		log.info("Clicked on 'More' button number = '" + buttonNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'More' button number = '" + buttonNumber + "'");
		return new Page_product(driver);

	}

	public Page_product clkColor(int colorNumber) {
		btn_color.get(colorNumber - 1).click();
		log.info("Clicked on 'color' button number = '" + colorNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'color' button number = '" + colorNumber + "'");
		return new Page_product(driver);

	}

	public void clkAddToWhislist(int buttonNumber) {
		btn_addToWhishlist.get(buttonNumber - 1).click();
		log.info("Clicked on 'Add to whishlist' button number = '" + buttonNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to whishlist' button number = '" + buttonNumber + "'");

	}

	public void clkAddToCompare(int buttonNumber) {

		btn_addToCompare.get(buttonNumber - 1).click();
		log.info("Clicked on 'Add to Compare' button number = '" + buttonNumber + "'");
		TestBase.test.log(Status.INFO, "Clicked on 'Add to Compare' button number = '" + buttonNumber + "'");

	}

	public void clkCompareButton1() {
		btn_compareButton1.click();
		log.info("Clicked on 'Compare' button 1  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Compare' button 1  ");

	}

	public void clkCompareButton2() {
		btn_compareButton2.click();
		log.info("Clicked on 'Compare' button 2  ");
		TestBase.test.log(Status.INFO, "Clicked on 'Compare' button 2  ");

	}

	

}
