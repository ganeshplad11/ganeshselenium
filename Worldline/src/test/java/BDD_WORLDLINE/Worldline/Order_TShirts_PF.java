package BDD_WORLDLINE.Worldline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory_Class.LoginPage_PF;
import PageFactory_Class.Order_Tshirts_Page_Pf;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_TShirts_PF {

//	WebDriver driver = null ;
//
//	LoginPage_PF logpf;
//
//	Order_Tshirts_Page_Pf ord;
//
//
//
//	@Given("^Login to sample process$")
//
//	public void Wakeup_Browser() throws InterruptedException
//	{
//		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<======================i am using the page factory class with BDD Framework===========>>>>>>>>>>>>>");
//
//		System.setProperty("webdriver.gecko.driver","C://Users//Ganesh//eclipse-workspace//Worldline//Browser//geckodriver.exe"); 
//
//		driver = new FirefoxDriver ();
//		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
//		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//	}
//	@When("^User enter (.*) and (.*)$")
//
//	public void Login_Cred(String username,String Password)
//	{
//		logpf= new LoginPage_PF(driver);
//		logpf.logcred(username, Password);
//	}
//
//	@And("^Clicks on the login button$")
//
//	public void clicks_on_the_login_button() 
//	{
//		logpf.submit();
//
//	}
//	@Then("^cliks on the Tshirts_TAB$")
//	public void clicks_on_Tshirts_TAB()
//	{
//		ord = new Order_Tshirts_Page_Pf(driver);
//
//		ord.Cliks_On_TShirts_Link();
//
//	}
}
