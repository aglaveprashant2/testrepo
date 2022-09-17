package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class example11_setPosition{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		Dimension d=new Dimension(0, 0);   //w, h
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		Point p =new Point(800, 600);   //x,y
		driver.manage().window().setPosition(p);
		
	}
}





