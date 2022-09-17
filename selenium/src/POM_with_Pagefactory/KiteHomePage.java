package POM_with_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	 //step 1:declaration
          @FindBy(xpath="//span[text()='DV1510']")private WebElement userId;
          
    //step2 :initialization
          
          public KiteHomePage(WebDriver driver)
          {
        	  PageFactory.initElements(driver, this);
          }
          
   //step3:Usage
         public void verify()
         {
        	 String acttext = userId.getText();
        	 
        	 String exptext="DV1510";
        	 
        	 if(acttext.equals(exptext))
        	 {
        		 System.out.println("Pass");
        	 }
        	 else
        	 {
        		 System.out.println("Fail");
        	 }
         }
          
          
}
