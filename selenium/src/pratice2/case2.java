package pratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class case2 
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pranjal");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Aglave");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("aglaveprashant2@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("aglaveprashant2@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pranjal2");
	Thread.sleep(3000);
	WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
	Select selday=new Select(Day);
	selday.selectByValue("2");
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select selmonth=new Select(month);
	selmonth.selectByIndex(9);
	Thread.sleep(3000);
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select selyear=new Select(year);
	selyear.selectByValue("2015");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
}
}
