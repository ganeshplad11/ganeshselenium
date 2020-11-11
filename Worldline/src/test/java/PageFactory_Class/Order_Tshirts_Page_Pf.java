package PageFactory_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Tshirts_Page_Pf {
	WebDriver driver;
	
	@FindBy(xpath="(//a[contains(@title,'T-shirts')])[2]")
	WebElement lnk_TShirts ;
	
	
	
public Order_Tshirts_Page_Pf(WebDriver driver)

{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}


public void Cliks_On_TShirts_Link()
{
	lnk_TShirts.click();
}

}
