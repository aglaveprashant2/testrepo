package POM_With_DDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page
{
	//step1: declaration--> global
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	
	
	//step2: initialization
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//step3: usage

	public void inpKiteLogin1PageUserName(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpKiteLogin1PagePassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickKiteLogin1Page()
	{
		login.click();
	}
}
