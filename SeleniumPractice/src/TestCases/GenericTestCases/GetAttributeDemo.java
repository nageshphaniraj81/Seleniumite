package TestCases.GenericTestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeDemo {

	private WebDriver driver;
	private String baseUrl1;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl1 = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@Test
	public void testDropdown() throws Exception{
		driver.get(baseUrl1);
		WebElement buttonElement = driver.findElement(By.id("name"));
		String attributeValue  = buttonElement.getAttribute("placeholder");
        System.out.println("Attribute Value is : "+attributeValue);
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
