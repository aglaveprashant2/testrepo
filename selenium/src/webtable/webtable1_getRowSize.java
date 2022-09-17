package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1_getRowSize
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    
     int rowsize = driver.findElements(By.xpath("//table[@border='10']/tbody/tr")).size();
    
   System.out.println(rowsize);
    
}
}
