package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="src\\test\\java\\com\\Features\\Instagram.feature",
		
		glue = "com.Stepdefition"
		
		
		
		
		
		)

public class Runnercucmber {

}
 