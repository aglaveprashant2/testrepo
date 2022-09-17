package Brokenlinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	    String underConsTitle = "Under Construction: Mercury Tours";					
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> linkelements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkelements.size()];
		int i=0;
		
		for (WebElement e : linkelements)
		{
			linkTexts[i]=e.getText();
			i++;
		}
		
		for (String t : linkTexts)
		{
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) 
			{							
                System.out.println("\"" + t + "\""+" is under construction.");			
            } 
			else
            {			
                System.out.println("\"" + t + "\""+ " is working.");			
            }	
			//driver.navigate().back();			
        }		
			//driver.quit();	
		}
		
}

