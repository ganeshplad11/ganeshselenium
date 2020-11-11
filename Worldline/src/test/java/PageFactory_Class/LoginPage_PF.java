package PageFactory_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	  WebDriver driver ;
	
	@FindBy(id="email")
	WebElement txt_Username;

	@FindBy(id="passwd")
	WebElement txt_Password;

	@FindBy(id="SubmitLogin")
	WebElement Btn_Login;

	public LoginPage_PF(WebDriver driver)
	{
       this.driver=driver;
       PageFactory.initElements(driver, this);
       
	}
	public void logcred(String username , String Password)

	{
		txt_Username.sendKeys(username);
		txt_Password.sendKeys(Password);

	}
	public void submit()
	{
		Btn_Login.click();
	}

}
