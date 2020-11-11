import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatepckerDemo {

	WebDriver driver = null ; 
	@Test
	public void datepicker() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 
         String ExpectDate ="01-March-2021";
         
         String edate =ExpectDate.split("-")[0];
         String emonth =ExpectDate.split("-")[1];
         String eyear =ExpectDate.split("-")[2];
         

		driver = new FirefoxDriver ();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("ui-datepicker-trigger")).click(); 
		WebDriverWait wait = new WebDriverWait(driver,1000);
		WebElement dt_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[1]")));
		dt_btn.click();
		
	String cmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().trim();
	String cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().trim();
	WebElement Btn_Next ; 
	
		
		while ((!cmonth.equals(emonth)) || (!cyear.equals(eyear)))
		{
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			  cmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().trim();
		     cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().trim();
			
		}
		
		List<WebElement> Dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		
		for (WebElement e :Dates)
			
		{
			if (e.getText().trim().equals(edate))
				e.click();
			break;
			
		}
	    Thread.sleep(2333);
	     driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
