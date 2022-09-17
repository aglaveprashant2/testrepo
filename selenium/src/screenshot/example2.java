package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example2 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		      driver.get("https://msbte.org.in/");
		      String str=RandomString.make(2);
		      
		      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      
		      File dest=new File("D:\\Class\\Screenshots\\abc"+str+".jpg");
		      
		      FileHandler.copy(src, dest);
	}
	
}
