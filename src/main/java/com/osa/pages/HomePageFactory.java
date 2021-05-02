package com.osa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.base.AppConfig;

public class HomePageFactory {
	WebDriver dr;
	public HomePageFactory(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
@FindBy(xpath="//a[text()='Forum']") 
WebElement forumButton;
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[1]/a") 
WebElement homeButton;

public ForumPageFactory clickOnForumButton() {
	AppConfig.LOG.info("Going to click on Forum button");
	forumButton.click();
	AppConfig.LOG.info("Clicked on Forum Button ");
	return new ForumPageFactory(dr);
	
}
public void clickOnHomeButton() {
	homeButton.click();
}
}
