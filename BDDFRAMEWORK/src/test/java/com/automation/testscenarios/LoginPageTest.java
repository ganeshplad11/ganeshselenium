package com.automation.testscenarios;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autaomation.pages.Homepage;
import com.autaomation.pages.Logingpage;
import com.automation.Base.Testbase;

public class LoginPageTest extends Testbase{

	Logingpage logp;
	Homepage hompg ;
	
public LoginPageTest() 
{
	super();
	
}
@BeforeClass
public void setup()
{
	intialiation();
	
	 logp= new Logingpage();
}

@Test(priority=2)
public void gettile()
{
	String ttle = logp.valdatetitle();
	Assert.assertEquals(ttle, "CRMPRO");
}
@Test(priority=1)
public void login()
{
	hompg=logp.logintest(prop.getProperty("username"), prop.getProperty("password"));
		//logp.logintest("batchautomation", "Test@12345");
		
		
}
@Test(priority=4)
public void signupTest()
{
	logp.signupLink();
	
}
@AfterClass
public  void teardown()
{
	driver.quit();
}
}
