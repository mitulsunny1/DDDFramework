package com.osa.test;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.osa.base.Base;
import com.osa.listeners.MyListener;
import com.osa.utility.Utils;

@Listeners(MyListener.class)
public class HomePage extends Base {
	
@Test
public void verifyHomePageTitle() throws InterruptedException {
	Utils.verifyTitle("OSA Consulting Tech Corp || Best Available Resources For Software Industry", dr.getTitle());
	Thread.sleep(5000); 
}
@Test
public void verifyForumPageTitle() throws InterruptedException {
	dr.findElement(By.xpath("//a[text()='Forum']")).click();
	Utils.verifyTitle("OSA Consulting Tech - All the projects..", dr.getTitle());
	Thread.sleep(5000);
}
@Test
public void verifyForumLogin() throws InterruptedException {
	dr.findElement(By.xpath("//a[text()='Forum']")).click();
	dr.findElement(By.id("username")).sendKeys("mitulsunny8@gmail.com");
	dr.findElement(By.id("password")).sendKeys("tfedswgfds");
	Thread.sleep(5000);
	dr.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
	Thread.sleep(5000);
	Utils.verifyTitle("Student Page", dr.getTitle());
 }
}
