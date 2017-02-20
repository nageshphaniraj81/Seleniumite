package TestCases.GenericTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.*;

public class IEDriverDemo {

	public static void main(String[] args) {
		String baseUrl = "http://www.google.com";
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Seleniumite\\lib\\IEDriverServer.exe");
		WebDriver driver;
		driver = new InternetExplorerDriver();
		driver.get(baseUrl);
        driver.manage().window().fullscreen();
        driver.close();

	}

}
