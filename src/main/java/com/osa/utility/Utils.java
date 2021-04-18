package com.osa.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.osa.base.Browser;
import com.osa.fiels.FileManager;

public class Utils {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=Browser.openBrowser("chrome");
		dr.get("https://www.osaconsultingtech.com");
		Thread.sleep(5000);
		takeScreenshot(dr);
		Thread.sleep(5000);
		dr.close();
	}
	
	public static void takeScreenshot(WebDriver dr) {
		try {
//			FileUtils.copyFile(((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE),
//			new File(System.getProperty("user.dir")+"\\target\\image\\"+System.currentTimeMillis()+"picture.png"));
			TakesScreenshot screenShot=((TakesScreenshot)dr);
			File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
			File desFile=new File(System.getProperty("user.dir")+"\\target\\image\\"+System.currentTimeMillis()+"picture.png");
			FileUtils.copyFile(srcFile,desFile);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void verifyTitle(String expected, String actual) {
		if(expected.equals(actual)) {
			System.out.println("The test is Passed");
		}else {
			System.out.println("The test is Failed");
			Assert.assertEquals(actual,expected);
		}
	}
	@DataProvider(name="userLogin")
	public static Object[][] getTestData(){
	 return FileManager.readExcelFile("src\\test\\resources\\test.xlsx","Sheet1");
	}
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
	}
}
