package com.AutomationFramework.companyName.automationEcommerce.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;
import com.aventstack.extentreports.Status;

public class Popup_productAddedInCartStatus {
	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(Popup_productAddedInCartStatus.class);
	
	public Popup_productAddedInCartStatus(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		log.info("Popup_productAddedInCartStatus Class Object Created");
		TestBase.test.log(Status.INFO,"Popup_productAddedInCartStatus Class Object Created");	
	}
	
	@FindBy(xpath="//*[@id="layer_cart"]/div[1]/div[1]/h2")
	public WebElement  lbl_productSuccesfullAddedToYourShoppingCart;

	@FindBy(xpath="//*[@id="layer_cart"]/div[1]/div[1]/div[1]/img")
	public WebElement  img_productImage;

	@FindBy(xpath="//*[@id="layer_cart_product_title"]")
	public WebElement  lbl_productName;
	
	@FindBy(xpath="")
	public WebElement  ;
	
	@FindBy(xpath="")
	public WebElement  ;
	
	@FindBy(xpath="")
	public WebElement  ;
	
	@FindBy(xpath="")
	public WebElement  ;
	
	@FindBy(xpath="")
	public WebElement  ;
	
}
