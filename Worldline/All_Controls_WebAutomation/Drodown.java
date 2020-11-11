import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drodown {
WebDriver driver =null;

@Test
	public void Dropdowndemo() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 

		driver = new FirefoxDriver ();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Select country = new Select (driver.findElement(By.name("country")));
		
		country.selectByIndex(2);
		
		Thread.sleep(100);
		driver.close();
		
		driver.quit();
	}
}
