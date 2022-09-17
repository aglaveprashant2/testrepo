package Projecct_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	String baseurl="http://www.demo.guru99.com/V4/";
	
	driver.get(baseurl);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("uid")).sendKeys("mngr385650");
	
	driver.findElement(By.name("password")).sendKeys("hesujEr");
	
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String exptitle = "Guru99 Bank Manager HomePage";
	
	if(title.equals(exptitle))
	{
		System.out.println("Test Pass");
	}
	else
	{
		System.out.println("Test Fail");
	}
	
	driver.close();
}
}
