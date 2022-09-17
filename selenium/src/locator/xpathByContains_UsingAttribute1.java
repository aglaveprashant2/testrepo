package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains_UsingAttribute1  
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://en-gb.facebook.com/");
			
			
			//enter user name
			
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("abc");	
			
			
			
}
}