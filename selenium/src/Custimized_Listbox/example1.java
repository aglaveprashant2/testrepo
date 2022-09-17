package Custimized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1 
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(2000);
	//step1:
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//step2:
	Actions act=new Actions(driver);
	
	//step3:
	act.click(month).perform();
	Thread.sleep(1000);
	
	//step4:
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
	act.sendKeys(Keys.ENTER).perform();
}
}
