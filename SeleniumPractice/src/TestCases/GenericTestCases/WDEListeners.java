package TestCases.GenericTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WDEListeners {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		String baseURL = "https://www.expedia.com/";
		WebDriver driver = new FirefoxDriver();
	    EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
        HandleEvents he = new HandleEvents();
        eDriver.register(he);
        
        eDriver.get(baseURL);
        eDriver.findElement(By.id("tab-flight-tab")).click();
	}

}
