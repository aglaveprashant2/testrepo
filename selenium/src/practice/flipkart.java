package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.moveToElement(fashion).perform();
	Thread.sleep(1000);
	WebElement mens = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
	act.moveToElement(mens).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]")).click();
}
}
