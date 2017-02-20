package TestCases.GenericTestCases;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isElementPresentDemo {

	private WebDriver driver;
	private String baseUrl1;
	GenericMethods generic;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl1 = "https://letskodeit.teachable.com/p/practice";
		generic = new GenericMethods(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testDropdown() throws Exception {
		driver.get(baseUrl1);
		boolean result = generic.isElementPresent("name", "id");
		System.out.println("Result :" + result);

		result = generic.isElementPresent("namenopresent", "id");
		System.out.println("Result :" + result);

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
