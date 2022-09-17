package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
    Thread.sleep(2000);
    
    String expected="redmi note 9";
    List<WebElement> allName = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
    for (WebElement ele : allName) 
    {
		String actual = ele.getText();
		System.out.println(actual);
		
		if(actual.equals(expected))
		{
			ele.click();
			break;
		}
	}
    
    
    
}
}
