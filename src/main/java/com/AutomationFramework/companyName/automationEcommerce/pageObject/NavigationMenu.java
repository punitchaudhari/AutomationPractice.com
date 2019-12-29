package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;
import com.mongodb.Tag;

public class NavigationMenu {

	
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(NavigationMenu.class);
	
	public NavigationMenu(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("NavigationMenu Class Object Created");
		TestBase.test.log(Status.INFO," NavigationMenu Class Object Created");	
	}
	

	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	public WebElement lbl_women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement lbl_dresses ;

	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]/a")
	public WebElement lbl_tShirts;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a")
	public WebElement lbl_women_tops;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")
	public WebElement lbl_women_Tshirts;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a") 
	public WebElement lbl_women_Blouses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/a")
	public WebElement lbl_women_Dresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[1]/a")
	public WebElement lbl_women_CasualDresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[2]/a")
	public WebElement lbl_women_EveningDresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")
	public WebElement lbl_women_SummerDresses;
	
	@FindBy(xpath="//*[@id='category-thumbnail']/div[1]/img")
	public WebElement img_women_adsimg1;
	
	@FindBy(xpath="//*[@id='category-thumbnail']/div[2]/img")
	public WebElement img_women_addsimg2;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
	public WebElement lbl_dresses_CasualDresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")
	public WebElement lbl_dresses_EveningDresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	public WebElement lbl_dresses_summerdresses;
	
	@FindBy(xpath="//*[@id='header_logo']/a/img")
	public WebElement img_yourLogo;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	public WebElement txt_serchbox;
	
	@FindBy(xpath="//*[@id='searchbox']/button")
	public WebElement btn_search;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a")
	public WebElement cart;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a/span[5]")
	public WebElement cart_empty;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")
	public WebElement cart_productNumber;
	
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/a/img")
	public List <WebElement> img_cart_img;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/span/span")
	public List <WebElement> lbl_cart_quantity;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a")
	public List <WebElement> link_cart_productName;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[2]/a")
	public List <WebElement> link_cart_productColorSze;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/span")
	public List <WebElement> lbl_cart_productPrice;
	
	@FindBy(xpath="//*[@id=header]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a")
	public List <WebElement> btn_cart_removeProduct;
	
	@FindBy(xpath="	//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/div/div[1]/span[1]")
	public WebElement lbl_cart_shippingPrice;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/div/div[2]/span[1]")
	public WebElement lbl_cart_toatalPrice;
	
	@FindBy(xpath="//*[@id='button_order_cart']")
	public WebElement btn_cart_checkOut ;
	

	

	public void clk_Menu_WOMEN(){
		
		lbl_women.click();
		log.info("clicked on 'WOMEN' menu");
		TestBase.test.log(Status.INFO, "clicked on 'WOMEN' menu");
	}
	
	public void clk_Menu_DRESSES(){
		lbl_dresses.click();
		log.info("clicked on 'DRESSES' menu");
		TestBase.test.log(Status.INFO,"clicked on 'DRESSES' menu" );
	}
	
	public void clk_Menu_TSHIRTS(){
		lbl_tShirts.click();
		log.info("clicked on 'T-SHIRTS' menu");
		TestBase.test.log(Status.INFO, "clicked on 'T-SHIRTS' menu");
	}
	public void clk_WOMEN_tops(){
		lbl_women_tops.click();
		log.info("clicked on 'tops'");
		TestBase.test.log(Status.INFO, "clicked on 'tops'");
	}
	public void clk_WOMEN_tshirts(){
		lbl_women_Tshirts.click();
		log.info("clicked on 'T-shirts'");
		TestBase.test.log(Status.INFO, "clicked on 'T-shirts'");
	}
	public void clk_WOMEN_blouses(){
		lbl_women_Blouses.click();
		log.info("clicked on 'Blouses");
		TestBase.test.log(Status.INFO,"clicked on 'Blouses" );
	}
	public void clk_WOMEN_dresses(){
		lbl_women_Dresses.click();
		log.info("clicked on 'DRESSES'");
		TestBase.test.log(Status.INFO, "clicked on 'DRESSES'");
	}
	public void clk_WOMEN_casualDresses(){
		lbl_women_CasualDresses.click();
		log.info("clicked on 'Casual Dresses'");
		TestBase.test.log(Status.INFO, "clicked on 'Casual Dresses'");
	}
	public void clk_WOMEN_eveningDresses(){
		lbl_women_EveningDresses.click();
		log.info("clicked on 'Evening Dresses'");
		TestBase.test.log(Status.INFO, "clicked on 'Evening Dresses'");
	}
	public void clk_WOMEN_summerDresses(){
		lbl_women_SummerDresses.click();
		log.info("clicked on 'Summer Dresses'");
		TestBase.test.log(Status.INFO, "clicked on 'Summer Dresses'");
	}
	public void clk_WOMEN_adsPoster1(){
		img_women_adsimg1.click();
		log.info("clicked on ad poster 1");
		TestBase.test.log(Status.INFO, "clicked on ad poster 1");
	}
	public void clk_WOMEN_adsPoster2(){
		img_women_addsimg2.click();
		log.info("clicked on ad poster 2");
		TestBase.test.log(Status.INFO, "clicked on ad poster 2");
	}
	
	public void clk_DRESSES_casualDresses(){
		lbl_dresses_CasualDresses.click();
		log.info("clicked on 'CASUAL DRESSES'");
		TestBase.test.log(Status.INFO, "clicked on 'CASUAL DRESSES'");
	}
	public void clk_DRESSES_eveningDresses(){
		lbl_dresses_CasualDresses.click();
		log.info("clicked on 'EVENING DRESSES'");
		TestBase.test.log(Status.INFO, "clicked on 'EVENING DRESSES'");
	}
	public void clk_DRESSES_summerDresses(){
		lbl_dresses_summerdresses.click();
		log.info("clicked on 'SUMMER DRESSES'");
		TestBase.test.log(Status.INFO, "clicked on 'SUMMER DRESSES'");
	}
	public void clk_yourLogo(){
		img_yourLogo.click();
		log.info("clicked on 'Your Logo' image");
		TestBase.test.log(Status.INFO,"clicked on 'Your Logo' image" );
	}
	public void set_searchBox(String txt){
		txt_serchbox.clear();
		txt_serchbox.sendKeys(txt);
		log.info("typed = '"+txt+"' on search box ");
		TestBase.test.log(Status.INFO, "typed = '"+txt+"' on search box ");
	}
	public void clk_cart(){
		cart.click();
		log.info("clicked on cart");
		TestBase.test.log(Status.INFO, "clicked on cart");
	}
	public void clk_cart_productImage(int indexNumberOfProductInCart){
		img_cart_img.get(indexNumberOfProductInCart).click();
		log.info("clicked on Product image inside of cart");
		TestBase.test.log(Status.INFO, "clicked on Product image inside cart");
	}
	public void clk_cart_productName(int indexNumberOfProductInCart){
		link_cart_productName.get(indexNumberOfProductInCart).click();
		log.info("clicked on Product Name inside of cart");
		TestBase.test.log(Status.INFO,"clicked on Product Name link inside of cart" );
	}
	public void clk_cart_productColorSize(int indexNumberOfProductInCart){
		link_cart_productColorSze.get(indexNumberOfProductInCart).click();
		log.info("clicked on Product Color & Size link inside of cart");
		TestBase.test.log(Status.INFO, "clicked on Product Color & Size link inside of cart");
	}
	public void clk_cart_productRemoveButton(int indexNumberOfProductInCart){
		btn_cart_removeProduct.get(indexNumberOfProductInCart).click();
		log.info("clicked on Product Removal Button");
		TestBase.test.log(Status.INFO, "clicked on Product Removal Button");
	}
	public void clk_cart_checkoutButton(){
		btn_cart_checkOut.click();
		log.info("clicked on 'Check out' button inside cart");
		TestBase.test.log(Status.INFO, "clicked on 'Check out' button inside cart");
	}
		
	
}
