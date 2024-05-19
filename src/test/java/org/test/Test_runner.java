package org.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\resources\\banking.feature",glue="org.steps",dryRun=false,plugin="html:C:\\selenium work\\harikrishna1\\Cucumber_FrameworkProject\\Banking_Project\\test-output.html")

public class Test_runner extends AbstractTestNGCucumberTests{
	
	
	
	
	
	
	

}
