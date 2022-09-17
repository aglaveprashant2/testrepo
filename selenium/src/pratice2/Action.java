package pratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	
	Actions bulider=new Actions(driver);
	            org.openqa.selenium.interactions.Action seriesofactions = bulider.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "prashant").keyUp(username, Keys.SHIFT).doubleClick(username).contextClick().build();
	            seriesofactions.perform();
	            
	
}
}
