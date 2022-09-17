package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2
{
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement cnt;
	
	
	public login2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void inpKitepin(String pin1)
	{
		pin.sendKeys(pin1);
	}
	
	public void clickKitecontinuebutton()
	{
		cnt.click();
	}

}
