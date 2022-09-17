package handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_Deselect_checkboxes 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("D:/Class/HTML/multiple_elements.html");
    Thread.sleep(2000);
    
    List<WebElement> allcheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
    
    for (WebElement checkbox : allcheck)
    {
		checkbox.click();
		   Thread.sleep(1000);
		
	}
  //Deselect_checkboxes in reverse order
    
    for (int i = allcheck.size()-1; i>=0; i--)
    {
		allcheck.get(i).click();
		 Thread.sleep(1000);
		
	}
}
}
