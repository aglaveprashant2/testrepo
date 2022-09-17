package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login3
{
@FindBy(xpath="//span[text()='DV1510']") private WebElement USERID;
	
	public login3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyKiteuserid()
	{
		String actText= USERID.getText();
		return actText;
	}

}
