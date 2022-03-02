package com.adactin_runner;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin_helper.File_Reader_Manager;
import com.baseclass.New_Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin_feature//adactin.feature", glue = "com.adactin_stepdefinition",monochrome = true,
tags=("@SmokeTest,@SanityTest")
//plugin = {"html:Report/Cucumber_Report", "pretty","json:Report/Cucumber.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}

)
public class Test_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws IOException {
//		driver=New_Baseclass.browserlaunch("chrome");
		String Browser = File_Reader_Manager.getInstance().getInstanceCR().getbrowser();
		driver=New_Baseclass.browserlaunch(Browser);
		
	}
	@AfterClass
	public static void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
	

}
