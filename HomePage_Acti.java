package Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Acti 
{
	public WebDriver driver;
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;
	
	public WebElement getlogoutbutton()
	{
		return logoutbutton;
	}
	
	//create a constructor
	public HomePage_Acti(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//create method 
		public LoginPage_Acti Home()
		{
		logoutbutton.click();
		return new LoginPage_Acti(driver);
	}
}
