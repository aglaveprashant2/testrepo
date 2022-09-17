package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://en-gb.facebook.com/");
			
			//click on Login link
			
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			
			
			
			
			
			
			
}
}