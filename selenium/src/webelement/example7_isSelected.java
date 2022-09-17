package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	
	boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
	System.out.println(result);
	
	
	if(result)
	{
		System.out.println("radio button is selected");
	}
	else 
	{
		System.out.println("radio button is not selected");
	}

}
}
