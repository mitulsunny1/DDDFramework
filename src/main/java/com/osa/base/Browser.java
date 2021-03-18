package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
public static void main(String[] args) {
	WebDriver dr=openBrowser("firefox");
	dr.get("https://www.osaconsultingtech.com");
}
public static WebDriver openBrowser(String browser) { 
	WebDriver dr=null;
	if(browser.toLowerCase().equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
	    dr=new ChromeDriver();
	}else if(browser.toLowerCase().equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\amirh\\Desktop\\OSA00711202009A\\DDDFramework\\src\\main\\resources\\drivers\\geckodriver.exe");
		dr=new FirefoxDriver();
	}
	return dr;
  }
}
