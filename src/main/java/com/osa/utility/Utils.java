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
	static Logger log=Utils.getLog(Utils.class);
	public static void takeScreenshot(WebDriver dr,String methodName) {
		try {
//			FileUtils.copyFile(((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE),
//			new File(System.getProperty("user.dir")+"\\target\\image\\"+System.currentTimeMillis()+"picture.png"));
			TakesScreenshot screenShot=((TakesScreenshot)dr);
			File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
			String name=methodName+System.currentTimeMillis();
			log.info("==================Look here======================");
			log.info("The test case is faile and we are going to take screenshot.");
			log.info("Look for image name "+ name);
			File desFile=new File(System.getProperty("user.dir")+"\\target\\image\\"+name+".png");
			FileUtils.copyFile(srcFile,desFile);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void verifyTitle(String expected, String actual) {
		if(expected.equals(actual)) {
			log.info("The test is Passed");
		}else {
			log.info("The test is Failed");
			log.info("The expected value is :"+expected);
			log.info("The actual value is :"+actual);
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
