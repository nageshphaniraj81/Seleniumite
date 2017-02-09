package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		String baseUrl = "http://www.google.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get(baseUrl);

	}

}
