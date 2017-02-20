package TestCases;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.SearchPage;

public class TestNGParametersAndDataProviders {
	private WebDriver driver;
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
	
	@DataProvider(name="fieldsInputs")
	public static Object[][] searchData(){
		return new Object[][]{{"New York","Chicago","30/10/2017","02/11/2017"},
			                  {"Chicago","New York","02/11/2017","02/12/2017"},
			                  {"Boston","Chicago","02/10/2017","02/13/2017"},
		};
	}

	@Parameters({"origin","dest","depDate","returnDate"})
	@Test(enabled=false)
	public void fillBasicInfo(String origin,String dest,
			String depDate,String returnDate) throws InterruptedException {
		
		Thread.sleep(3000);
    	driver.findElement(By.id("tab-flight-tab")).click();
		SearchPage.fillOriginTextBox(driver, origin);
		SearchPage.fillDestinationTextBox(driver,dest);
		SearchPage.fillDepartureDateTextBox(driver, depDate);
		SearchPage.fillReturnDateTextBox(driver, returnDate);
	}
	
	@Test(dataProvider="fieldsInputs")
	public void fillBasicInfoMultiData(String origin,String dest,
			String depDate,String returnDate) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("tab-flight-tab")).click();
		SearchPage.clearAllFields(driver);
		SearchPage.fillOriginTextBox(driver, origin);
		SearchPage.fillDestinationTextBox(driver,dest);
		SearchPage.fillDepartureDateTextBox(driver, depDate);
		SearchPage.fillReturnDateTextBox(driver, returnDate);
		Thread.sleep(3000);
	}
	
	
//	@Test(dependsOnMethods={"fillBasicInfo"})
//	public void fillAdvancedInfo() throws InterruptedException {
//		Thread.sleep(3000);
//		// click on one way tab
//		driver.findElement(By.id("tab-flight-tab")).click();
//    	driver.findElement(By.id("flight-type-one-way-label")).click();
//		SearchPage.fillOriginTextBox(driver, "New York");
//		SearchPage.fillDestinationTextBox(driver, "Chicago");
//		SearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
//	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
