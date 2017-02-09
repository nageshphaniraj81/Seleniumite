package basicweb;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabalitiesDemo {

	public static void main(String[] args) {
		String baseUrl = "http://www.google.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		WebDriver driver;
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN10);
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		

	}

}
