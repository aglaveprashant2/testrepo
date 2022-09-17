package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("D:/Class/HTML/tagname.html");
			
			
			//enter user name
			
		driver.findElement(By.tagName("input")).sendKeys("prashant");
		
		driver.findElement(By.tagName("input")).sendKeys("12345");
			
			
			
}
}
