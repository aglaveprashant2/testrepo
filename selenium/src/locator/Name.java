package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("D:/Class/HTML/Name.html");
			
			
			//enter user name
			driver.findElement(By.name("abc123")).sendKeys("xyz");
	
			//enter last name
			
			driver.findElement(By.name("abc123")).sendKeys("aglave");
			
			
}
}

