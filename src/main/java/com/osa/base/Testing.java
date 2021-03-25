package com.osa.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	@Test
	public void test1() {
		System.out.println("Test one method");
	}
	@Test
	public void test2() {
		System.out.println("Test Two method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test method");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method method");
	}
}
