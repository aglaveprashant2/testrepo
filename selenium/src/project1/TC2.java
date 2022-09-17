package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 

{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.godaddy.com/");
	driver.manage().window().maximize();
	
	String TitleOfPage = driver.getTitle();
	System.out.println(TitleOfPage);
	String exptitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	if(exptitle.equals(TitleOfPage))
	{
		System.out.println("Test Pass");
	}
	else
	{
		System.out.println("Test Fail");
	}
	driver.close();
}
}
