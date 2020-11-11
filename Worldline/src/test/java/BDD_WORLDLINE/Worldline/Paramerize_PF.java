package BDD_WORLDLINE.Worldline;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory_Class.LoginPage_PF;
import PageFactory_Class.Order_Tshirts_Page_Pf;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Paramerize_PF {
	WebDriver driver = null ;
	LoginPage_PF logpf;
	 Order_Tshirts_Page_Pf ord ;

   @Given("^Login to sample process$")
   @Before
	public void Wakeup_Browser() throws InterruptedException
	{
	   System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<======================i am using the page factory class with BDD Framework===========>>>>>>>>>>>>>");
		
	   System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 

		driver = new FirefoxDriver ();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
   
	@When("^User enter (.*) and (.*)$")
	
	public void Login_Cred(String username,String Password)
	{
		logpf= new LoginPage_PF(driver);
		logpf.logcred(username, Password);
		
		//driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("passwd")).sendKeys(Password);
	}

	@And("^Clicks on the login button$")
	
	public void clicks_on_the_login_button() 
	{
		logpf.submit();
		//driver.findElement(By.id("SubmitLogin")).click();
	}
	@Then("^User landing on main page$")

	public void homepage() throws InterruptedException
	{
		driver.getPageSource().contains("MY ACCOUNT");
		Thread.sleep(2000);
	}
	
	@Then("clicks on the TSHIRTS Tab")
	public void Tshirts()
	{
		ord = new Order_Tshirts_Page_Pf(driver);

		ord.Cliks_On_TShirts_Link();
	}

	@And("^close the browser$")
	@After
	public void closedbrowser()
	{
		driver.close();
	}
}
