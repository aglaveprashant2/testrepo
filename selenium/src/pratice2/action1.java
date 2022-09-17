package pratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action1 
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	
	Actions act=new Actions(driver);
	
	act.contextClick(username).keyDown(username, Keys.ARROW_DOWN).build().perform();
	
}
}
