package com.dellbd.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.dellbd.util.TestBasedellbd;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(features = {"src/test/resources/DellFeatures"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefdellbd")

//tags= {"@office3"})
public class DellTestRunner extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void LaunchApplicationURL() {
		TestBasedellbd lunch= new TestBasedellbd();
		lunch.initz();
		
		
	}
	
	@AfterTest
	public void CloseApplicationURL() {
		TestBasedellbd lunch = new TestBasedellbd();	
		lunch.driver.quit();
		
	}

}

