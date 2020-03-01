package com.AutomationFramework.companyName.automationEcommerce.helper.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderClass {
	private static final Object String = null;
	static Properties prop;
	static FileInputStream fis;
	static File file;

	public static Properties PropertiesReaderClass() {

		try {
			file = new File("src/main/resources/configfile/project_config_file.properties");
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;

	}

	
	public static String getProperty(String key){
		Properties prop1 = PropertiesReaderClass();
		 return prop1.getProperty(key);
		 
		
	}
	public static String getIndexPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("indexPageUrl");

	}

	public static String getWomenPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("womenPageUrl");

	}

	public static String getDressesPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("dressesPageUrl");

	}

	public static String getTshirtsPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("tshirtsPageUrl");

	}

	public static String getTopsPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("topsPageUrl");

	}

	public static String getBlousesPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("blousesPageUrl");

	}

	public static String getCasualDressesPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("casualDressesPageUrl");

	}

	public static String getEveningDressesPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("eveningDressesPageUrl");

	}

	public static String getSummerDressesPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("summerDressesPageUrl");

	}
	public static String getAuthenticationPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("authenticationPageUrl");

	}
	public static String getValidEmail() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("validEmail");

	}

	public static String getValidPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("validPassword");

	}
	public static String getInvalidEmail() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("invalidEmail");

	}

	public static String getInvalidPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("invalidPassword");

	}
	
/*	public static String getPageUrl() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("");

	}
	*/
	


	public static long getImplicitWait() {

		Properties prop1 = PropertiesReaderClass();
		return Long.parseLong(prop1.getProperty("impliciteWait"));

	}

	public static long getExplicitWait() {

		Properties prop1 = PropertiesReaderClass();
		return Long.parseLong(prop1.getProperty("explictieWait"));
	}

	public static long getPollingEvery() {

		Properties prop1 = PropertiesReaderClass();
		return Long.parseLong(prop1.getProperty("pollingevery"));

	}

	public static String getUserName() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("username");

	}

	public static String getPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("password");

	}
	

	public static String getInValidUserName() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("invalidUsername");

	}

	public static String getInValidPassword() {

		Properties prop1 = PropertiesReaderClass();
		return prop1.getProperty("invalidPassword");

	}
	

	/*
	 * public static void main(String[] args) throws FileNotFoundException,
	 * IOException { PropertiesReaderClass rdr= new PropertiesReaderClass();
	 * rdr.getApplicationUrl(); }
	 */
	// return prop1
}
