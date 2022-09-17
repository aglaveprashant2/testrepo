package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions5_doubleClick 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement click = driver.findElement(By.xpath("/button[text()='Double-Click Me To See Alert']"));
	
	Actions act=new Actions(driver);
	act.doubleClick(click).perform();
}
}
