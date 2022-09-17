package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page
{
  //step 1:declaration
   @FindBy(xpath="//input[@id='userid']") private	WebElement UN;
   @FindBy(xpath="//input[@id='password']") private WebElement PWD;
   @FindBy(xpath="//button[text()='Login ']")private	WebElement Login;
	
  //step2 :initialization
   
   public KiteLogin1Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	
   
   //step 3:Usage
   
   public void username()
   {
	   UN.sendKeys("DV1510");
   }
   
   public void password()
   {
	   PWD.sendKeys("Year@123");
   }
   
   public void clickTologin()
   {
	   Login.click();
   }
	
	
}
