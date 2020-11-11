import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Texbox {
	WebDriver driver ;
	@Test
	public void textbo() throws InterruptedException
	{
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<======================i am using the page factory class with BDD Framework===========>>>>>>>>>>>>>");
		
		   System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 

			driver = new FirefoxDriver ();
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
			driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			driver.findElement(By.name("email")).sendKeys("ganesh11@gmail.com");
		    driver.findElement(By.id("passwd")).sendKeys("god@1188");
		    
		    driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
			Thread.sleep(20);
	}
	
	

}
