package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("D:/Class/HTML/ClassName.html");
			
			
			//enter user name
			driver.findElement(By.className("xyz")).sendKeys("prash");
	
			//enter last name
			
			driver.findElement(By.className("xyz")).sendKeys("aglave");
			
			
}
}

