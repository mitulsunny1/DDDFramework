package com.osa.base;

import org.openqa.selenium.WebDriver;
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
	System.out.println("===========The test is running on "+System.getProperty("os.name")+"==========");
}
@AfterSuite
public void afterSuite() {
	System.out.println("********All the Test is executed and send the reports to the email**********");
}
@BeforeMethod
@Parameters("browser")
public void beforeMethod(String browser) {
	dr= Browser.openBrowser(browser);
	dr.get("https://www.osaconsultingtech.com");
}
@AfterMethod
public void afterClass() {
	dr.close();
}

}
