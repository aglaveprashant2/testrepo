package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page
{
	  //step 1:declaration
		@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
		@FindBy(xpath="//button[text()='Continue ']") private WebElement cnt;
	
	 //step2 :initialization
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//step3:Usage 
	
	public void enterpin()
	{
		PIN.sendKeys("959594");
	}
	
	public void clicktocnt()
	{
		cnt.click();
	}
	
}
