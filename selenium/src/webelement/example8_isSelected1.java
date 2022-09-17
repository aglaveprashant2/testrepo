package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_isSelected1
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	
	WebElement femaleRadioBtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
			
	boolean result = femaleRadioBtn.isSelected();
	
	if(result==true) 
	{
		System.out.println("radio button already selected");
	}
	else
	{
		System.out.println("radio button not selected");
		femaleRadioBtn.click();
		boolean result1 = femaleRadioBtn.isSelected();
		if(result1==true) 
		{
			System.out.println("radio button selected");
		}
		else 
		{
			System.out.println("radio button not selected");
		}		
	}

}
}
