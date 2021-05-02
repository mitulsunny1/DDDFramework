package com.osa.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.osa.base.Base;
import com.osa.fiels.FileManager;
import com.osa.pages.ForumPageFactory;
import com.osa.pages.HomePageFactory;
import com.osa.utility.Utils;

public class StudentPage extends Base{
	HomePageFactory hpf;
	ForumPageFactory fpf;
	@Test(dataProvider="userLogin",dataProviderClass=Utils.class)
	public void verifyStudentPage(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		hpf = new HomePageFactory(dr);
		hpf.clickOnForumButton();
		Thread.sleep(5000);
		fpf=new ForumPageFactory(dr);
		fpf.enterUsername("thisisusername");
		fpf.enterPassword("zyxfdsfjsdl");
		Thread.sleep(5000);
		fpf.clickOnLoginButton();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[text()='Interview Questiones']")).click();
		Thread.sleep(5000);
		Utils.verifyTitle("Interview Questions", dr.getTitle().trim());
		Thread.sleep(5000);	
	}
}
