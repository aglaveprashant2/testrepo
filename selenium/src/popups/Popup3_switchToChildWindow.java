package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3_switchToChildWindow
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://skpatro.github.io/demo/links");
    
  //click on new tab btn
    driver.findElement(By.xpath("//input[@name='NewTab']")).click();
    Thread.sleep(2000);
    
  //get child window ID/address
    
    Set<String> wnd = driver.getWindowHandles();
    ArrayList<String> al=new ArrayList<String>(wnd);
    String childadd = al.get(1);            // return address of child window
    
    driver.switchTo().window(childadd);     //string window id
    
	//click on Appium link
    
    driver.findElement(By.xpath("(//span[text()='Appium'])[1]")).click();
}
}
