package BDD_WORLDLINE.Worldline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearch {
	WebDriver driver =null;


	@Given("^Navigate on the www.google.com page$")
	public void search_page() throws InterruptedException
	{
		//System.setProperty("webdriver.chromedriver.exe","C:/Users/Ganesh/eclipse-workspace/Worldline/Browser/chromedriver.exe" );
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 
		//C:\Users\Ganesh\eclipse-workspace\Worldline\Browser\geckodriver.exe
		driver = new FirefoxDriver ();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}


	@When("^User search for the udemey$")
	public void user_search_for_the_udemey() throws InterruptedException {
		//driver.findElement(By.id("input")).sendKeys("udemey");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("udemey");
		Thread.sleep(20000);
	}
	@And ("^clicks on thesearch button$")
	public void cliks() throws InterruptedException

	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^all links should be searched in results$")
	
	public void result() throws InterruptedException{
		driver.getPageSource().contains("Udemy: Online Courses - Learn Anything, On Your Schedule");
		Thread.sleep(2000);
	}
	@And ("^closed he browser after$")

	public void tear_down()
	{
		driver.close();
		//driver.quit();
	}

}
