package com.AutomationFramework.companyName.automationEcommerce.helper.resource;

public class resourceHelper {

	
	public static String getResourcePath(String path){
		
			 String basePath = System.getProperty("user.dir");
				//System.out.println(basePath);
			 return basePath+path;
		
			
	}

	//for testing purpose if this class works correctly
	
	/*
	public static void main(String[] args) {

	System.out.println(resourceHelper.getResourcePath("\\uiFrameworkVersion1\\src\\main\\resources\\configfile\\log4j.properties"));

	} 
	*/
}
