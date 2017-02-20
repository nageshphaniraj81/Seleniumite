package TestCases.GenericTestCases;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderSelection2 {
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
	public void test() throws Exception{
		// Initialize the driver
		driver.get(baseUrl);
		
		// click on flights tab
		WebElement flightTab = driver.findElement(By.id("tab-flight-tab"));
		flightTab.click();
		
		//Click on departure element
		WebElement departureField = driver.findElement(By.id("flight-departing"));
		departureField.click();
		
		//select the date in the date picker
		WebElement calMonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]"));

		List<WebElement> allValidDates = calMonth.findElements(By.tagName("a"));
		
		for(WebElement dates : allValidDates){
			if(dates.getText().equals("26")){
				dates.click();
				break;
			}
		}
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(8000);
		driver.quit();
	}

}
