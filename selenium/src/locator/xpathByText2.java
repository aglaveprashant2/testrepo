package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText2 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://en-gb.facebook.com/");
			
			//click on login btn --> using xpath by text
			
		//	driver.findElement(By.xpath("//button[text()='Log In']")).click();
			
			//click on login btn --> using xpath by attribute
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
			
			
}
}