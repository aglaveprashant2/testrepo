package POM_With_DDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	//step1: declaration--> global
	
	@FindBy(xpath="//span[text()='DV1510']") private WebElement userId;
	
	//step2: initialization
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3: usage
	public String getKiteHomepageuserId()
	{
		String actText = userId.getText();
		return actText;
	}
}
