package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isDisplayed 
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	      boolean result=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	      System.out.println(result);
}
}
