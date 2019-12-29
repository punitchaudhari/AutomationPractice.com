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

public class SideBar {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(SideBar.class);
	
	public SideBar(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("SideBar Class Object Created");
		TestBase.test.log(Status.INFO," SideBar Class Object Created");	
	}
	

	//CTALOG SECTION ELEMETNTS
	//SIZE
	@FindBy(xpath="//*[@id='layered_id_attribute_group_1']")
	public WebElement cb_S;
	
	@FindBy(xpath="//*[@id='layered_id_attribute_group_2']")
	public WebElement cb_M;

	@FindBy(xpath="//*[@id='layered_id_attribute_group_3']")
	public WebElement cb_L;
	
	//COLORS
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_3']/li")
	public List<WebElement> colors;

	//COMPOSITINNS
	@FindBy(xpath="//*[@id='ul_layered_id_feature_5']/li/div/span/input")
	public  List<WebElement> cb_compositions;
	
	@FindBy(xpath="//*[@id='ul_layered_id_feature_5']/li/label/a")
	public  List<WebElement> link_compositions_clothMaterialType;
	
	//STYLES
	@FindBy(xpath="//*[@id='ul_layered_id_feature_6']/li/div/span/input")
	public  List<WebElement> cb_styles;
	
	@FindBy(xpath="//*[@id='ul_layered_id_feature_6']/li/label/a")
	public List<WebElement> link_styles_wearingOccasion;
	//PROPERTIES
	@FindBy(xpath="//*[@id='ul_layered_id_feature_7']/li/div/span/input")
	public List<WebElement> cb_properties ;
	
	@FindBy(xpath="//*[@id='ul_layered_id_feature_7']/li/label/a")
	public List<WebElement> link_properties_dressTypes ;
	//AVAILABILITY
	@FindBy(xpath="//*[@id='layered_quantity_1']")
	public WebElement cb_availability;
	
	@FindBy(xpath="//*[@id='ul_layered_quantity_0']/li/label/a")
	public WebElement link_availablity_stocks;
	//MANUFACTURAR
	@FindBy(xpath="//*[@id='layered_manufacturer_1']")
	public WebElement cb_manufacturer;
	
	@FindBy(xpath="//*[@id='ul_layered_manufacturer_0']/li/label/a")
	public WebElement link_manufacturer_company;
	//CONDITION
	@FindBy(xpath="//*[@id='layered_condition_new']")
	public WebElement cb_condition;
	
	@FindBy(xpath="//*[@id='ul_layered_condition_0']/li/label/a")
	public WebElement link_condition_productCondition;
	//PRICE
	@FindBy(xpath="//*[@id='layered_price_range']")
	public WebElement lbl_price_range;
	
	
	
	
	//INFORMATION SECTION ELEMETNTS
	@FindBy(xpath="//*[@id='informations_block_left_1']/p/a")
	public WebElement link_information;
	
	@FindBy(xpath="//*[@id='informations_block_left_1']/div/ul/li[1]/a")
	public WebElement link_delivery;

	@FindBy(xpath="//*[@id='informations_block_left_1']/div/ul/li[2]/a")
	public WebElement link_legalNotice;
	
	@FindBy(xpath="//*[@id='informations_block_left_1']/div/ul/li[3]/a")
	public WebElement link_termsAndConditionsOfUse;

	@FindBy(xpath="//*[@id='informations_block_left_1']/div/ul/li[4]/a")
	public WebElement link_aboutUs;
	
	@FindBy(xpath="//*[@id='informations_block_left_1']/div/ul/li[5]/a")
	public WebElement link_securePayment;

	@FindBy(xpath="//*[@id='informations_block_left_1']/div/ul/li[6]/a")
	public WebElement link_ourStores;
	
	
	//SPECIALS SECTION ELEMENTS
	@FindBy(xpath="//*[@id='special_block_right']/p/a")
	public WebElement link_specials;
	
	@FindBy(xpath="//*[@id='special_block_right']/div/ul/li/a/img")
	public WebElement img_specials;

	@FindBy(xpath="//*[@id='special_block_right']/div/ul/li/div/h5/a")
	public WebElement link_specials_productName;
	
	@FindBy(xpath="//*[@id='special_block_right']/div/ul/li/div/p")
	public WebElement lbl_specials_productDescription;

	@FindBy(xpath="//*[@id='special_block_right']/div/ul/li/div/div/span[1]")
	public WebElement lbl_specials_productSpecialPrice;
	
	@FindBy(xpath="//*[@id='special_block_right']/div/ul/li/div/div/span[2]")
	public WebElement lbl_specials_discount;
	
	@FindBy(xpath="//*[@id='special_block_right']/div/ul/li/div/div/span[3]")
	public WebElement lbl_specials_oldPrice;
	
	@FindBy(xpath="//*[@id='special_block_right']/div/div/a")
	public WebElement link_specials_allspecials;
	
	
	
	//OUR STORES SECTION ELEMENTS
	@FindBy(xpath="//*[@id='stores_block_left']/p/a")
	public WebElement link_ourstores;
	
	@FindBy(xpath="//*[@id='stores_block_left']/div/p/a/img")
	public WebElement img_ourStores;
	
	@FindBy(xpath="//*[@id='stores_block_left']/div/div/a")
	public WebElement link_ourStores_discoverOurStores;
	
	
	
	//VIVED PRODUCTS SECTION ELEMENTS
	@FindBy(xpath="//*[@id='viewed-products_block_left']/div/ul/li/a")
	public List<WebElement> img_viewedProducts;
	
	@FindBy(xpath="//*[@id='viewed-products_block_left']/div/ul/li/div/h5/a")
	public List<WebElement> link_productName;
	
	@FindBy(xpath="//*[@id='viewed-products_block_left']/div/ul/li[2]/div/p")
	public List<WebElement> lbl_productDescription;

	

}
