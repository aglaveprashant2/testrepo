package screenshot_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen1
{
public static void main(String[] args) throws IOException 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("D:\\Class\\Screenshots\\abc456.jpg");
	
	FileHandler.copy(src, dest);
	

}
}
