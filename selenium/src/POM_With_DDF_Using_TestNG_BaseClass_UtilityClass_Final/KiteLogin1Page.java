package POM_With_DDF_Using_TestNG_BaseClass_UtilityClass_Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
   @FindBy(xpath="//input[@id='userid']") private WebElement UN;
   @FindBy(xpath="//input[@id='password']") private WebElement pwd;
   @FindBy(xpath="//button[text()='Login ']") private WebElement login;
   
   public KiteLogin1Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   public void inpKiteLogin1Pageusername(String username)
   {
	   UN.sendKeys(username);
   }
	
   public void inpKiteLogin1Pagepassword(String password)
   {
	   pwd.sendKeys(password);
   }
   
   public void clickKiteLogin1Pagelogin()
   {
	   login.click();
   }
}
