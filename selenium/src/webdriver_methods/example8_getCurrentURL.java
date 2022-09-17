package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_getCurrentURL {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
	}
}


