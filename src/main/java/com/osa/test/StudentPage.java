package com.osa.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.osa.base.Base;
import com.osa.utility.Utils;

public class StudentPage extends Base{
	@Test
	public void verifyStudentPage() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		Thread.sleep(5000);
		dr.findElement(By.id("username")).sendKeys("mitulsunny8@gmail.com");
		dr.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[text()='Interview Questiones']")).click();
		Thread.sleep(5000);
		Utils.verifyTitle("Interview Questions", dr.getTitle().trim());
		Thread.sleep(5000);
		
		
	}

}
