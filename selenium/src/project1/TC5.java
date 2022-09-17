package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC5
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
	
	WebElement sel = driver.findElement(By.xpath("//strong[text()='Checkbox']"));
	
	Select sl=new Select(sel);
	sl.selectByIndex(1);
	sl.deselectAll();
}
}
