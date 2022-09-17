package Sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_first_program 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.close();
}
}
