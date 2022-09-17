package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_gettext 
{
public static void main (String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	//String text=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
	
	//System.out.println(text);
	 
WebElement	un=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
          String text=un.getText();
          System.out.println(text);
}
}
