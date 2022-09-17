package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("D:/Class/HTML/ID.html");
			
			
			//enter user name
			
	driver.findElement(By.id("1234")).sendKeys("Prashant");	
	
	driver.findElement(By.id("123")).sendKeys("aglave");
			
			
			
}
}
