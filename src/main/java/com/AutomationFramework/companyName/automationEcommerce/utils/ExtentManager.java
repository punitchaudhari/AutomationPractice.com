package com.AutomationFramework.companyName.automationEcommerce.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
private static ExtentReports report;
	
	public static ExtentReports getInstance(){
		if(report == null){
			//get path using resource helper here later if possoble
			String location = "src/main/resources/reports/extent.html";
			return createInstance(location);
		}
		else{
			return report;
		}
	}
	
	public static ExtentReports createInstance(String fileName){
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Automation Report");
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		return report;
	}
}
