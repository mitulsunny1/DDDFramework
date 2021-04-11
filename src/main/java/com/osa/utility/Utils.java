package com.osa.utility;

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
}
