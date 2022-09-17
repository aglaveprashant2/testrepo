package POM_With_Pagefactory_Using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{

	// declaration
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userId;
	
	//Initialization
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void verifyuserId(String expuserId)
	{
		String actuserId = userId.getText();
	
		if(actuserId.equals(expuserId))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
