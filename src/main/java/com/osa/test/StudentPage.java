package com.osa.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.osa.base.Base;
import com.osa.fiels.FileManager;
import com.osa.utility.Utils;

public class StudentPage extends Base{
	
	@Test(dataProvider="userLogin",dataProviderClass=Utils.class)
	public void verifyStudentPage(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		Thread.sleep(5000);
		dr.findElement(By.id("username")).sendKeys(username);
		dr.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[text()='Interview Questiones']")).click();
		Thread.sleep(5000);
		Utils.verifyTitle("Interview Questions", dr.getTitle().trim());
		Thread.sleep(5000);	
	}
	

}
