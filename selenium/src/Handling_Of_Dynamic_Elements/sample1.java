package Handling_Of_Dynamic_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung m31");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	String rating = driver.findElement(By.xpath("((//a[@class='_1fQZEK'])[1]//span)[4]")).getText();
	
	System.out.println(rating);
}
}
