package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example4
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		      driver.get("https://msbte.org.in/");
		      
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		     File dst=new File("D:\\Class\\Screenshots\\1234.jpg");
		     
		     FileHandler.copy(src, dst);
}
}