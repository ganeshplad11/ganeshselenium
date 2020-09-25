package step1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	WebDriver driver;
	// String s=
	// System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");

	@Before
	public void setup() {
		@SuppressWarnings("unused")
		String s = System.setProperty("webdriver.gecko.driver",
				"C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}

	@After
	public void teardown() {
		this.driver.manage().deleteAllCookies();
		this.driver.close();
		this.driver = null;
	}

	@Given("^i am on login page$")
	public void i_am_on_login_page() {
		// System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");

		// driver = new FirefoxDriver ();
		// driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewAdminModule");
		driver.getTitle();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// driver.close();
		System.out.println("h############");

	}

	@When("^user enter a user id and password$")
	public void user_enter_a_user_id_and_password() {
		System.out.println("@@@@@@@@@@@@");
		// System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Webcall//Chrome//geckodriver.exe");
		//
		// driver = new FirefoxDriver ();
		// driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewAdminModule");
		driver.getTitle();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebElement ceckbx = driver.findElement(By.id("ohrmList_chkSelectAll"));

		ceckbx.click();

		if (ceckbx.isSelected()) {
			System.out.println("check boxisselected");
		} else {
			System.out.println("not checked");
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// driver.close();
	}

	@Then("^login successfully$")
	public void login_successfully() {
		System.out.println("%%%%%%%%%%%%%%%%%");

		// driver.close();
	}

}
