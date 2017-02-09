package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByLinkText {

	public static void main(String[] args) {
		String baseUrl = "https://demostore.x-cart.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.linkText("Contact us")).click();

	}

}
