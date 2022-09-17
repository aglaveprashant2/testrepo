package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPage_From_Iframe

{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 

			//switch to frame


		driver.switchTo().frame("iframeResult");  // using frame name 
		   
		 
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 //	//switch to main page
		 
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		 
}
}