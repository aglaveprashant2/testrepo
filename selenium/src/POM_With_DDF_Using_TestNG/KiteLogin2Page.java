package POM_With_DDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page
{
	//step1: declaration--> global
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement cntbtn;
	
	//step2: initialization
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3: usage
	
	public void inpKiteLogin2Page(String pinvalue)
	{
		pin.sendKeys(pinvalue);
	}
	
	public void clickKiteLogin2Page()
	{
		cntbtn.click();
	}
	
}
