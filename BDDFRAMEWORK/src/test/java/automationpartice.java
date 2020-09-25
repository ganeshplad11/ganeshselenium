import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class automationpartice {
	WebDriver driver;

	@BeforeMethod
	public void dropdown() {

		String s = System.setProperty("webdriver.gecko.driver",
				"C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");

	}

	@AfterClass
	public void teradown() {

		driver.close();

	}

	@Test
	public void Sign_up() throws InterruptedException {

		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(5000);
		// driver.findElement(By.className("is_required validate account_input
		// form-control")).sendKeys("classic@gamma.com");
		// driver.findElement(By.xpath("//*[@id="email_create"]")).sendKeys("classic@gamma.com");

		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("kehhe@hahah.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);

		/*	java.util.List<WebElement> radiolist = driver
				.findElements(By.xpath("(//input[@name='id_gender'and @type='radio']"));

		for (int i = 0; i <= radiolist.size(); i++) {
			WebElement el = radiolist.get(i);

			String value1 = el.getAttribute("value");
			System.out.println("values is:::::::::::::::" + value1);

			if (value1.equalsIgnoreCase("Mr")) {

				el.click();
			}

		}  */
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("samamamam");
		driver.findElement(By.id("customer_lastname")).sendKeys("spoljhjhcbchxbc");
		driver.findElement(By.id("email")).sendKeys("kehhe@hahah.com");
		driver.findElement(By.id("passwd")).sendKeys("god@1191919");
		WebElement Month_day =driver.findElement(By.id("days"));
		
		Select DD_Months = new Select(Month_day);
		DD_Months.selectByIndex(12);
		WebElement MonthYear =driver.findElement(By.id("months"));
		Select Months_year = new Select (MonthYear);
		//Months_year.selectByVisibleText("March");
		Months_year.selectByIndex(2);
		WebElement Yearsy =driver.findElement(By.id("years"));
		Select Yearsy_cal = new Select (Yearsy);
		//Yearsy_cal.selectByVisibleText("2009");
		Yearsy_cal.selectByValue("2002");
		
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("firstname")).sendKeys("samamamam");
		
		driver.findElement(By.id("lastname")).sendKeys("spoljhjhcbchxbc");
		
		driver.findElement(By.id("company")).sendKeys("MASTERCARD YERWADA PUNE");
		driver.findElement(By.id("address1")).sendKeys("nGDI PUNE ");
		driver.findElement(By.id("address2")).sendKeys(" aparatment no 233,MAHARASHATAR 411101");
		driver.findElement(By.id("city")).sendKeys(" pUNE");
		
		
		WebElement State_India= driver.findElement(By.id("id_state"));
		Select State1= new Select (State_India);
		State1.selectByIndex(9);
		
		
		driver.findElement(By.id("postcode")).sendKeys("4554555");
		
		WebElement Countryworld= driver.findElement(By.id("id_country"));
		Select countrycode= new Select (Countryworld);
		countrycode.selectByIndex(0);
		//countrycode.selectByValue("United States");
		driver.findElement(By.id("other")).sendKeys(" i am gimy from ndiayana. i am looking for a  job at microdost fromsince tgeb last year");
		
		driver.findElement(By.id("phone")).sendKeys("4224224222442222");
		driver.findElement(By.id("phone_mobile")).sendKeys("4574224222442222");
		driver.findElement(By.id("alias")).sendKeys("bobkoliddk");
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(50000);

	}

}
