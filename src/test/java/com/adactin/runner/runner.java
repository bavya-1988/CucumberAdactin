package com.adactin.runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.org.newMaven1.BaseClass;
import com.adactin.property.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
glue = "com\\adactin\\stepdefinition", 
monochrome = true,
tags= {"@Login"},
plugin={"pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html",
		"json:Report/CucumberJSON_Report.json",
		"html:Report/HTML_Report"},

strict = true, 
dryRun = false)

public class runner {

	public static WebDriver driver;

	@BeforeClass
	public static void getup() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.getDriver(browser);
	}
	
/*	 @AfterClass public static void tearDown() { 
		 driver.quit();
		 }*/
	 
}
