package popups_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_child
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://skpatro.github.io/demo/links");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
    Thread.sleep(2000);
    
   Set<String> swtc = driver.getWindowHandles();
   
   ArrayList<String> al=new ArrayList<String>(swtc);
   
   String address = al.get(1);
    
    
    driver.switchTo().window(address);
    
    driver.findElement(By.xpath("(//a[@class='default-btn-shortcode dt-btn dt-btn-l link-hover-off '])[3]")).click();
    Thread.sleep(2000);
    
    
    String address1 = al.get(0);
    
    driver.switchTo().window(address1);
    
    driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
    Thread.sleep(2000);
    
 String address2 = al.get(1);
    
    
    driver.switchTo().window(address2);
    
    driver.manage().window().maximize();
    
    
}
}
