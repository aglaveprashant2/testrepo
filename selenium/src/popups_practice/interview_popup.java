package popups_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interview_popup 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	
	driver.get("https://shop.advanceautoparts.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='aap-flyout-ymme-year-1']")).click();
	Thread.sleep(1000);
	
//	Alert alt = driver.switchTo().alert();
//	
//	alt.dismiss();
}
}
