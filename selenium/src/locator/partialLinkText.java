package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("D:/Class/HTML/LinkText.html");
			
			Thread.sleep(3000);
			//enter user name
	//driver.findElement(By.linkText("facebook")).click();
	
	
	
	driver.findElement(By.partialLinkText("le")).click();
	
		
			
			
}
}


