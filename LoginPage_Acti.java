package Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Acti
{
	private static final WebDriver driver = null;

	@FindBy(id="username")
	 private WebElement usernametext;
	
	@FindBy(name="pwd")
 	private WebElement passwordtext;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;

	public WebElement getUsernametext() 
	{
		return usernametext;
	}

	public WebElement getPasswordtext() 
	{
		return passwordtext;
	}

	public WebElement getLoginbutton() 
	{
		return loginbutton;
	}
	
	//Create a constructor 
	public LoginPage_Acti(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver,this);
	}

	//create a Method 
	public HomePage_Acti Login(String usernameData,String PasswordData)
	{
		usernametext.sendKeys(usernameData);
		passwordtext.sendKeys(PasswordData);
		loginbutton.click();
		
		return new HomePage_Acti(driver);	
	}
}