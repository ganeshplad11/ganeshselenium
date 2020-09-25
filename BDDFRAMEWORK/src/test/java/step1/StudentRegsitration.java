package step1;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

public class StudentRegsitration {

	static WebDriver driver;

	@Test
	public static void setup() {
		String s = System.setProperty("webdriver.gecko.driver",
				"C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}

	@Test
	public static void teardown() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver = null;
	}

	@Test
	public void student_form() {
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.getTitle();
		driver.findElement(By.id("firstName")).sendKeys("Ganehs lad");
		driver.findElement(By.id("lastName")).sendKeys("lad");
		// driver.findElement(By.id(("userEmail")).sendKeys("ganeshlad@gamail.com");
		driver.findElement(By.id("userEmail")).sendKeys("ladganesh@garphics.com");
		java.util.List<WebElement> radiolist = driver
				.findElements(By.xpath("(//input[@name='gender' and @type='radio']"));

		for (int i = 0; i <= radiolist.size(); i++) {
			WebElement loacradio = radiolist.get(i);
			String value = loacradio.getAttribute("value");
			System.out.println("" + value);

			if (value.equalsIgnoreCase("Male"))

			{
				loacradio.click();
			}
		}

	}

	public static void main(Strings[] args) {
		
		StudentRegsitration st = new StudentRegsitration();
		
		st.student_form();
		
	}
}
