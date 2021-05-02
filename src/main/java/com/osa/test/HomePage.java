package com.osa.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.osa.base.Base;
import com.osa.listeners.MyListener;
import com.osa.pages.ForumPageFactory;
import com.osa.pages.HomePageFactory;
import com.osa.utility.Utils;

@Listeners(MyListener.class)
public class HomePage extends Base {
	HomePageFactory hpf;
	ForumPageFactory fpf;
@Test
public void verifyHomePageTitle() throws InterruptedException {
	Utils.verifyTitle("OSA Consulting Tech Corp || Best Available Resources For Software Industry", dr.getTitle());
	Thread.sleep(5000); 
}
@Test
public void verifyForumPageTitle() throws InterruptedException {
	hpf=new HomePageFactory(dr);
	hpf.clickOnForumButton();
	Utils.verifyTitle("OSA Consulting Tech - All the projects..", dr.getTitle());
	Thread.sleep(5000);
}

@Test
public void verifyForumLogin() throws InterruptedException {
	hpf=new HomePageFactory(dr);
	fpf=hpf.clickOnForumButton();
	fpf.enterUsername("thisisusername");
	fpf.enterPassword("zyxfdsfjsdl");
	Thread.sleep(5000);
	fpf.clickOnLoginButton();
	Thread.sleep(5000);
	Utils.verifyTitle("Student Page", dr.getTitle());
 }
}
