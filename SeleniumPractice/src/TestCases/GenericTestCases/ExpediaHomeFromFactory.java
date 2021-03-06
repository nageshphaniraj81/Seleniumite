package TestCases.GenericTestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.SearchPageFactory;

public class ExpediaHomeFromFactory {

	private WebDriver driver;
	private String baseURL;
	SearchPageFactory searchPage;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.com/";
		searchPage = new SearchPageFactory(driver);
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
    	searchPage.clickFlightsTab();
    	searchPage.setOriginCity("Bangalore");
    	searchPage.setDestinationCity("Mumbai");
    	searchPage.setDepartureDate("10/10/2017");
    	searchPage.setReturnDate("11/10/2017");
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
