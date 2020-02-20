package com.AutomationFramework.companyName.automationEcommerce.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.AutomationFramework.companyName.automationEcommerce.helper.log4j.LoggerHelper;
import com.AutomationFramework.companyName.automationEcommerce.testbase.TestBase;

public class NavigationMenu extends TestBase{
Logger log = LoggerHelper.getLogger(NavigationMenu.class);

	@Test
	public void verifyWomenButtonFunctionality(){
		getUrl(url);
	}
}
