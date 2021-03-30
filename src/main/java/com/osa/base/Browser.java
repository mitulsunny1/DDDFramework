package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
public static void main(String[] args)  {
	WebDriver dr=openBrowser("firefox");
	dr.get("https://www.osaconsultingtech.com");
	dr.manage().window().maximize();
	dr.quit();
}
public static WebDriver openBrowser(String browser)  { 
	WebDriver dr=null;
	if(System.getProperty("os.name").toLowerCase().contains("windows")){
		System.out.println("=========This test is running from  "+System.getProperty("os.name")+"======");
	if(browser.toLowerCase().equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
	    dr=new ChromeDriver();
	    
	}else if(browser.toLowerCase().equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");
		dr=new FirefoxDriver();
	 }
	}else {
		System.out.println("=========This test is running from  "+System.getProperty("os.name")+"======");
		if(browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
		    dr=new ChromeDriver();
		}else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
			dr=new FirefoxDriver();
			
		}
	}
	return dr;
  }
}
