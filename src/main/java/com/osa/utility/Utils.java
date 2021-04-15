package com.osa.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.osa.fiels.FileManager;

public class Utils {

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
