package Projecct_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1
{

	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		 WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		  user.sendKeys("mngr385650");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hesujEr");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
		
		driver.close();
	}
}
