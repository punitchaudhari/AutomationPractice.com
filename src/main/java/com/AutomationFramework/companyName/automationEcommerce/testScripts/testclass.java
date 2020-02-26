package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.NavigationMenu;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_authentication;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_history;
import com.AutomationFramework.companyName.automationEcommerce.pageObject.Page_myAccount;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;

public class testclass extends TestBase {
	Logger log = LoggerHelper.getLogger(testclass.class);
	
	@Test
	public void test1() throws InterruptedException {
		getUrl("http://automationpractice.com/index.php?controller=authentication");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Page_authentication ap= new Page_authentication(driver);
		ap.signIn("baymax1@gmail.com", "baymax");
		Page_myAccount myacc = new Page_myAccount(driver);
		myacc.clkOrderHistoryAndDetails();
		Page_history history = new Page_history(driver);
		history.clkOrderReference("LRZBVFASO");
		Thread.sleep(10000);
			
		
	}
	

}
