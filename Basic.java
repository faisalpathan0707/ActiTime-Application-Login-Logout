package Page_Object_Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("pune");
		driver.navigate().refresh();
		ele.sendKeys("admin");  //staleElementReferenceException ----> to avoid this POM
		
	}
}
