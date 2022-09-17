package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_without_DDF
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	
	//UN
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
	Thread.sleep(2000);
	
	//password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
	
	//login
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	Thread.sleep(2000);
	
	//pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	Thread.sleep(2000);
	
	//continue
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	
	String actuserId = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
	
	String expuserId="DV1510";
	
	if(actuserId.equals(expuserId))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
