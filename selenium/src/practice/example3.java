package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    
    WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
    
    Actions act=new Actions(driver);
    act.moveToElement(fashion).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("///a[@class='_6WOcW9 _2-k99T']")).click();
	driver.findElement(By.xpath("//a[text()='All']")).click();
    
    
    
}
}
