package com.osa.listeners;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.osa.utility.Utils;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start MEthod get executed. ");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success MEthod get executed. ");
	}

	public void onTestFailure(ITestResult result) {
		
		ITestContext context=result.getTestContext();
		WebDriver dr=(WebDriver)context.getAttribute("webDriver");
		Utils.takeScreenshot(dr,result.getName().toString());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped MEthod get executed. ");
	}
}
