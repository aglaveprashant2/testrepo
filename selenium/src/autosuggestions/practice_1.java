package autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_1 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Pune");
    
    
}
}
