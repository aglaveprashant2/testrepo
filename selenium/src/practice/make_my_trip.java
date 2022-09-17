package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class make_my_trip
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	
	driver.get("https://www.airbnb.co.in/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='_1xq16jy'] ")).sendKeys("hyd");
	driver.findElement(By.xpath("(//div[@class='_rj7nx'])[2] ")).click();
	Thread.sleep(1000);
	
	
	
}
}
