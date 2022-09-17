package POM_With_DDF_Using_TestNG_BaseClass_UtilityClass_Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
@FindBy(xpath="//input[@id='pin']") private WebElement pin;
@FindBy(xpath="//button[text()='Continue ']") private WebElement ctnbtn;

public KiteLogin2Page(WebDriver driver)
{

	PageFactory.initElements(driver, this);
}

public void inpKiteLogin2Pagepin(String pinvalue)
{
	pin.sendKeys(pinvalue);
}

public void clickKiteLogin2Pagecontinue()
{
	ctnbtn.click();
}

}
