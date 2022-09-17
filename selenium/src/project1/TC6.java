package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC6 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(women).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='T-shirts'][1]")).click();
	Thread.sleep(2000);

	WebElement dropdown = driver.findElement(By.xpath("//select[@id='selectProductSort']"));

	
	Select sel=new Select(dropdown);
	sel.selectByIndex(5);
	WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	act.moveToElement(img).perform();
	driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();
	Thread.sleep(2000);
	
	
	
	
}
}
