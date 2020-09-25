package com.autaomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Testbase;

public class Logingpage extends Testbase {
	
	// page factory only trace the webelement with id, xpath ,classname,text
	
	@FindBy(name="username")

	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	@FindBy(xpath="//*[contains(text(),'Sign Up')]")
	
	WebElement signup;
	
	
	public void loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String valdatetitle() {
		return driver.getTitle();

	}
	
	
	public Registrationpage signupLink()
	{
		signup.click();
		return new Registrationpage();
	}
	public Homepage logintest(String username1 ,String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
		submit.click();
		return new Homepage();
	}
	
}
