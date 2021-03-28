package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
public WebDriver dr;
@BeforeClass
public void beforeClass() {
	dr= Browser.openBrowser("chrome");
}
@BeforeMethod
public void beforeMethod() {
	dr.get("https://www.osaconsultingtech.com");
}
@AfterClass
public void afterClass() {
	dr.close();
}

}
