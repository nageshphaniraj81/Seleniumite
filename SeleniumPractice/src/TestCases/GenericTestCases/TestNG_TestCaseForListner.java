package TestCases.GenericTestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.SearchPage;

@Listeners(Utilities.SeleniumListeners.class)
public class TestNG_TestCaseForListner {
	private WebDriver driver;
	public WebDriver getDriver() {
        return driver;
	}
	private String baseURL;
	static Logger log = Logger.getLogger(ExpediaHome.class);
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.com/";
		PropertyConfigurator.configure("Log4j.properties");
		driver.get(baseURL);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void fillBasicInfo() throws InterruptedException {
		Thread.sleep(3000);
    	driver.findElement(By.id("tab-flight-tab")).click();
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
		SearchPage.fillReturnDateTextBox(driver, "02/11/2017");
	}
	
	@Test(dependsOnMethods={"fillBasicInfo"})
	public void fillAdvancedInfo() throws InterruptedException {
		Thread.sleep(3000);
		// click on one way tab
		driver.findElement(By.id("tab-flight-tab")).click();
    	driver.findElement(By.id("flight-type-one-way-label")).click();
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
