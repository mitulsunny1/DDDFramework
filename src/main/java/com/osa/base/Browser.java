package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver dr = null;

	public static void main(String[] args) {
		openBrowser("chrome"); 
		dr.get("http://www.osaconsultingtech.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		dr.quit();
	}
	public static WebDriver openBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			System.out.println("===========The test is running on " + System.getProperty("os.name") + "==========");
			if (browser.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\win\\chromedriver.exe");
				dr = new ChromeDriver();
			} else if (browser.toLowerCase().equals("firefox")) {
				System.setProperty("", "");
				dr = new FirefoxDriver();
			}
		} else {
			System.out.println("===========The test is running on " + System.getProperty("os.name") + "==========");
			if (browser.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver");
				dr = new ChromeDriver();
			} else if (browser.toLowerCase().equals("firefox")) {
				System.setProperty("", "");
				dr = new FirefoxDriver();
			}
		}
		return dr;
	}
}
