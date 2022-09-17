package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains_UsingAttribute2  
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://en-gb.facebook.com/");
			
			
			//enter user name
			
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).sendKeys("abc");	
			
			
			
}
}