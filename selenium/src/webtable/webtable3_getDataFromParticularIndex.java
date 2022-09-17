package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable3_getDataFromParticularIndex 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
 String text = driver.findElement(By.xpath("//table[@border='10']/tbody/tr[2]/td[3]")).getText();
    System.out.println(text);
}
}
