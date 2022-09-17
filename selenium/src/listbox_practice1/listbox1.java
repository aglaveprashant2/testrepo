package listbox_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox1
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://en-gb.facebook.com/");
	 
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 Thread.sleep(2000);
	 
	 
	 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	 
	 Select d=new Select(day);
	 
	 d.selectByIndex(8);
	 
	 
	 
	 
	
	
}
}
