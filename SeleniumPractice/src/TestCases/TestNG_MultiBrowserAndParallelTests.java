package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.SearchPage;

public class TestNG_MultiBrowserAndParallelTests {
	private WebDriver driver;
	private String baseURL;
	static Logger log = Logger.getLogger(ExpediaHome.class);

	@Parameters("browserType")
	@BeforeClass
	public void beforeClass(String browser) {
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Seleniumite\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.com/";
		PropertyConfigurator.configure("Log4j.properties");
		driver.get(baseURL);
	}

	@Test
	public void fillBasicInfo() throws InterruptedException {
		Thread.sleep(3000);
    	driver.findElement(By.id("tab-flight-tab")).click();
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
		SearchPage.fillReturnDateTextBox(driver, "02/11/2017");
		//SearchPage.clearAllFields(driver);
	}
	
	@Test(dependsOnMethods={"fillBasicInfo"})
	public void fillAdvancedInfo() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("tab-flight-tab")).click();
    	driver.findElement(By.id("flight-type-one-way-label")).click();
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
