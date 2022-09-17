package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	//enter UN
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9975350872");
	
	// enter pw
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prash$prad");
	
	//login
	
	driver.findElement(By.xpath("//button[@value='1']")).click();
}
}
