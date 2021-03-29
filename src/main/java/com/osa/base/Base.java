package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
<<<<<<< HEAD
public static void main(String[] args) {
	WebDriver dr= Browser.openBrowser("chrome");

=======
public WebDriver dr;
@BeforeClass
public void beforeClass() {
	dr= Browser.openBrowser("chrome");
>>>>>>> 59bc2ddfa5d2c4908e43970983331cdc0268095d
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
