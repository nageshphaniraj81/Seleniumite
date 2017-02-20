package TestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalandarSelection {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@Test
	public void test() {
		// Initialize the driver
		driver.get(baseUrl);
		
		// click on flights tab
		WebElement flightTab = driver.findElement(By.id("tab-flight-tab"));
		flightTab.click();
		
		//Click on departure element
		WebElement departureField = driver.findElement(By.id("flight-departing"));
		departureField.click();
		
		//select the date in the date picker
		WebElement datePicker = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[@data-day='26']"));
		datePicker.click();
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
