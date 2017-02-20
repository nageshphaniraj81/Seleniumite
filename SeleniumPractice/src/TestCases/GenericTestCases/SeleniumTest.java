package TestCases.GenericTestCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Control + Shift + O to organize imports
//Control + Shift + F to format code

public class SeleniumTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://www.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSelenium() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("i90scv3glabel")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='navbar']/div/div/div/ul/li[1]/a")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
