package autosuggestions;

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
    
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
    Thread.sleep(2000);
    
    String expected="redmi 9";
    
    List<WebElement> all = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
    
    for (WebElement element : all) 
    {
		String acttext = element.getText();
		System.out.println(acttext);
		
		if(acttext.equals(expected))
		{
			element.click();
			break;
		}
	}
    
}
}
