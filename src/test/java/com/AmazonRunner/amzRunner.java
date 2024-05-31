package com.AmazonRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.Baseclass.base_amazon;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src\\test\\java\\com\\AmazonFeatures\\com.feature",
		glue= "com.AmazonStepdef",
		dryRun = false,
		plugin={
				"html:HTMLreport/Amazon.html",
				"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		}
)


public class amzRunner extends base_amazon {
	
	@BeforeClass
	public static void sessionstart() {
	browserLanch("edge");
	
	}
	
	@AfterClass
public static void EndSession() {
	Endsetup(driver);
}
}
