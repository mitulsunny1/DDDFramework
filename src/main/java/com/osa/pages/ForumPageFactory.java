package com.osa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.base.AppConfig;

public class ForumPageFactory {
	WebDriver dr;
	public ForumPageFactory(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
@FindBy(name="username") 
WebElement usernameBox;
@FindBy(name="password") 
WebElement passwordBox;
@FindBy(xpath="//*[@id=\"login_button\"]") 
WebElement loginButton;

public void enterUsername(String username) {
	AppConfig.LOG.info("Clearing the username box");
	usernameBox.clear();
	AppConfig.LOG.info("Succefully cleard the username box");
	AppConfig.LOG.info("Entering username **** "+ username);
	usernameBox.sendKeys(username);
	AppConfig.LOG.info("Entered  "+username+" as username");
}
public void enterPassword(String password) {
	AppConfig.LOG.info("Clearing the password box");
	passwordBox.clear();
	AppConfig.LOG.info("Succefully cleard the password box");
	AppConfig.LOG.info("Entering password ****");
	passwordBox.sendKeys(password);
	AppConfig.LOG.info("Entered password");
}
public void clickOnLoginButton() {
	AppConfig.LOG.info("Going to click on login button");
	loginButton.click();
	AppConfig.LOG.info("Succefully clicked on Login Button!!!!");
	
}
}
