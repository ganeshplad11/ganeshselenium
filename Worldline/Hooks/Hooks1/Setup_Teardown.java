package Hooks1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Setup_Teardown {
	
	WebDriver driver = null ;
	@Before
    public void set_up() throws InterruptedException
    {
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<======================Browser invoked ===========>>>>>>>>>>>>>");
		
 	   System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 

 		driver = new FirefoxDriver ();
 		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
 		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
 		driver.manage().window().maximize();
 		Thread.sleep(2000);
    }
	@After
	public void Tear_Down()
	{
		driver.close();
		driver.quit();
	}
}
