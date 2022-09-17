package handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_checkbox 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("D:/Class/HTML/multiple_elements.html");
    Thread.sleep(2000);
    
   List<WebElement> allele = driver.findElements(By.xpath("//input[@type='checkbox']"));
   
   for (WebElement checkbox : allele)
   {
   checkbox.click();
   Thread.sleep(2000);
}
   
}
}
