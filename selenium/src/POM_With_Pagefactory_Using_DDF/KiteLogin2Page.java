package POM_With_Pagefactory_Using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{

	//declaration 
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement ctnbtn;
	
	//Initialization 
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void inpKiteLogin2Pagepin(String pinvalue)
	{
		pin.sendKeys(pinvalue);
	}
	
	public void clickKiteLogin2PagecontinueBtn()
	{
		ctnbtn.click();
	}
}
