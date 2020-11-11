package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	public static WebDriver driver =null ;

	public Loginpage(WebDriver driver)
	{
		this.driver= driver;

		//		if (!driver.getTitle().equals("My Account-My Store")){
		//			throw new IllegalStateException ("this is not actual page"+driver.getCurrentUrl());
		//			
		//		}
	}

	private By txt_Username = By.id("email");
	private By txt_Password = By.id("passwd");
	private By Btn_Login = By.id("SubmitLogin");

	public void enter_Login_Credintials(String username, String Password)
	{
		driver.findElement(txt_Username).sendKeys(username);
		driver.findElement(txt_Password).sendKeys(Password);

	}

	public void cliks_on_submitbtn ()
	{
		driver.findElement(Btn_Login).click();
	}
}
