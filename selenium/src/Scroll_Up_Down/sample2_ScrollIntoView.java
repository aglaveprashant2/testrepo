package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_ScrollIntoView 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		WebElement social = driver.findElement(By.xpath("//h4[contains(text(),'Social')]"));
		Thread.sleep(3000);
				
		
		// This will scroll the page till the element is found
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", social);

		
		Thread.sleep(3000);
		WebElement linux = driver.findElement(By.xpath("(//div[@class='canvas-middle'])[11]"));
		
		// This will scroll the page till the element is found
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", linux);


	}
}
