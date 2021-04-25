package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base {
public WebDriver dr;

//public void beforeClass() {
//	dr= Browser.openBrowser("firefox");
//}
@BeforeSuite
public void beforeSuite() {
	AppConfig.LOG.info("===========The test is running on "+System.getProperty("os.name")+"==========");
}
@AfterSuite
public void afterSuite() {
	AppConfig.LOG.info("********All the Test is executed and send the reports to the email**********");
}
@BeforeMethod
@Parameters("browser")
public void beforeMethod(String browser, ITestContext context) {
	dr= Browser.openBrowser(browser);
	AppConfig.LOG.info("Test is running on "+ browser);
	dr.get("https://www.osaconsultingtech.com");
	context.setAttribute("webDriver", dr);
}
@AfterMethod
public void afterClass() {
	AppConfig.LOG.info("Closing the browser!");
	dr.close();
}

}
