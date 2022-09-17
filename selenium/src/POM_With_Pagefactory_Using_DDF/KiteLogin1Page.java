package POM_With_Pagefactory_Using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	//declaration
@FindBy(xpath="//input[@id='userid']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement PWD;
@FindBy(xpath="//button[text()='Login ']")private WebElement login;
@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']") private WebElement errorMsg;	

//Initialization

public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//usage

public void inpKiteLogin1Pageusername(String username)
{
	UN.sendKeys(username);
}

public void inpKiteLogin1Pagepassword(String password)
{
	PWD.sendKeys(password);
}

public void clickKiteLogin1PageloginBtn()
{
	login.click();
}

public void verifyKiteLogin1PageErrormsg(String expterrormsg)
{
	String ActerrorMsg = errorMsg.getText();
	
	
	if(ActerrorMsg.equals(expterrormsg))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}


