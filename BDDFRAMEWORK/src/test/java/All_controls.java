import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class All_controls {

	WebDriver driver;
	@Test
	public void dropdown() {

		String s = System.setProperty("webdriver.gecko.driver",
				"C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ganeshplad@gmail.com");
		driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("hjhhghhhhhhhhhhh");
		//driver.findElement(By.xpath("//*[@id=\"u_1_b\"]")).sendKeys("ganesh");
		
		driver.findElement(By.id("u_y_b")).sendKeys("ganesh");
		
		
		driver.findElement(By.id("u_7_d")).sendKeys("saraeaea");
		driver.findElement(By.id("u_7_g")).sendKeys("9623746687");
		driver.findElement(By.id("password_step_input")).sendKeys("God@118888");
		//WebElement Month_dropdown= driver.findElement(By.id("day"));
		
		//WebElement Month_dropdown =driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		WebElement Month_dropdown= driver.findElement(By.name("birthday_day"));
		
		Select Month_dd = new Select(Month_dropdown);
		Month_dd.selectByIndex(19);
		
		Month_dd.deselectByValue("12");
		Month_dd.selectByVisibleText("19");
		

		driver.close();
	}
	

}
