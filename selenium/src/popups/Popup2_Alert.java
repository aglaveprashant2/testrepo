package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_Alert 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
    Thread.sleep(3000);
     
   Alert alt = driver.switchTo().alert();

  String text = alt.getText();
  System.out.println(text);
  
  //alt.accept();
  alt.dismiss();
}
}
