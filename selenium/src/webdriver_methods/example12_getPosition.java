package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12_getPosition{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		Point p1 = driver.manage().window().getPosition();
		System.out.println(p1);
	}
}

