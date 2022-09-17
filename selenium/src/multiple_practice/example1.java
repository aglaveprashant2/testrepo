package multiple_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("samsung");
    Thread.sleep(2000);
    
    String expected="samsung m31";
    List<WebElement> allelement = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
    
    for (WebElement element : allelement) 
    {
		String text = element.getText();
		System.out.println(text);
		
		if (text.equals(expected)) 
		{
			element.click();
			break;
		}
	}
    
    
}
}
