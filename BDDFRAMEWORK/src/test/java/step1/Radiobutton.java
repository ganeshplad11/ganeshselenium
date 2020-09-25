package step1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main (String [] args)
	{
		WebDriver driver;
		String s = System.setProperty("webdriver.gecko.driver",
				"C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.getTitle();
		//driver.findElement(By.id("firstName")).sendKeys("Ganehs lad");
		//driver.findElement(By.id("lastName")).sendKeys("lad");
		// driver.findElement(By.id(("userEmail")).sendKeys("ganeshlad@gamail.com");
		//driver.findElement(By.id("userEmail")).sendKeys("ladganesh@garphics.com");
		java.util.List<WebElement> radiolist = driver.findElements(By.xpath("(//input[@name='lang'and @type='radio']"));

		for (int i = 0; i <= radiolist.size(); i++) {
			WebElement loacradio = radiolist.get(i);
			String value = loacradio.getAttribute("value");
			System.out.println("" + value);

			if (value.equalsIgnoreCase("Ruby"))

			{
				loacradio.click();
			}
		}

	}
}
