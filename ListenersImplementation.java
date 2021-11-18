package com.selenium.assignment;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.assertthat.selenium_shutterbug.core.Shutterbug;


public class ListenersImplementation extends Base implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test success..." + result.getMethod());
		Shutterbug.shootPage(Base.driver).withName("automationtestingscreenshotPass").save();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed..." + result.getMethod());
		Shutterbug.shootPage(Base.driver).withName("automationtestingscreenshotFail").save();
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

	

}
