package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autosuggestion1 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    
    WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    searchbox.sendKeys("pune");
    
Actions act=new Actions(driver);

act.click(searchbox).perform();

for (int i = 1; i <=5; i++)
{
act.sendKeys(Keys.ARROW_DOWN).perform();

}
act.sendKeys(Keys.ENTER).perform();


}
}
