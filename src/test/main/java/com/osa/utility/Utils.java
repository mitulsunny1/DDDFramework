package com.osa.utility;

import org.testng.Assert;

public class Utils {

	public static void verifyTitle(String expected, String actual) {
		if(expected.equals(actual)) {
			System.out.println("The test is Passed");
		}else {
			System.out.println("The test is Failed");
			Assert.assertEquals(actual,expected);
		}
	}
}
