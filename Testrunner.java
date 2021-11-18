package com.selenium.assignment;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = false, features = "Features\\SmokeRegression.feature", tags = { "@SmokeTest",
		"@RegressionTest" }, monochrome = true, glue = { "StepDefinitions" })
public class Testrunner extends AbstractTestNGCucumberTests {

}