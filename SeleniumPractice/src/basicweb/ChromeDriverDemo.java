package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
public class ChromeDriverDemo {

	public static void main(String[] args) {
		String baseUrl = "http://www.google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Seleniumite\\lib\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.manage().window().fullscreen();
        driver.close();
	}

}
