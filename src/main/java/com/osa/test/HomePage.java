package com.osa.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.osa.base.Base;
import com.osa.utility.Utils;

public class HomePage extends Base {

@Test
public void verifyHomePageTitle() {
	Utils.verifyTitle("OSA Consulting Tech Corp || Best Available Resources For Software Industry", dr.getTitle());
 }
@Test
public void verifyForumPageTitle() {
	dr.findElement(By.xpath("//a[text()='Forum']")).click();
	Utils.verifyTitle("OSA Consulting Tech - All the projects.", dr.getTitle());
}
@Test
public void verifyForumLogin() throws InterruptedException {
	Thread.sleep(5000);
	dr.findElement(By.xpath("//a[text()='Forum']")).click();
	Thread.sleep(5000);
	dr.findElement(By.id("username")).sendKeys("xyz@yahoo.com");
	Thread.sleep(5000);
	dr.findElement(By.id("password")).sendKeys("mypassword");
	Thread.sleep(5000);
	dr.findElement(By.id("login_button")).click();
}
@Test
public void verifyStudentPage() {
	Utils.verifyTitle("Student Page", dr.getTitle());
}
@Test
public void verifyInterviewQuetion() throws InterruptedException {
	Thread.sleep(5000);
	dr.findElement(By.xpath("//a[text()='Interview Questiones']")).click();
}
}
