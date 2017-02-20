package TestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.SearchPage;

public class ExpediaHome {
	private WebDriver driver;
	private String baseURL;
	static Logger log = Logger.getLogger(ExpediaHome.class);
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.com/";
		PropertyConfigurator.configure("Log4j.properties");
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
    	driver.findElement(By.id("tab-flight-tab")).click();
    	//log.info("Navigate to Flights tab");
		SearchPage.fillOriginTextBox(driver, "New York");
		//log.info("Enter Origin");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		//log.info("Enter Dstination");
		SearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
		//log.info("Fill departure date");
		SearchPage.fillReturnDateTextBox(driver, "02/11/2017");
		//log.info("Fill return date");
		//SearchPage.clickOnSearchButton(driver);
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
