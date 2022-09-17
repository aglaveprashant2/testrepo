package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 
{
@FindBy(xpath="//input[@id='userid']") private WebElement Un;
	
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	
	
	public login1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteusername(String username)
	
	{
		Un.sendKeys(username);
	}
	
	public void inpKitepasword(String password)
	
	{
		pwd.sendKeys(password);
	}
	
	public void clickkitelogin()
	{
		login.click();
	}
}


