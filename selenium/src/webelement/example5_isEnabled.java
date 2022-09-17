package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	   boolean result=driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
	   System.out.println(result);
	   
	   if(result)
	   {
		   System.out.println("Log in button is Enabled");
	   }
	   else
	   {
		   System.out.println("Log in button is Not Enabled");
	   }
}
}
