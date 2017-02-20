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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitTypes;

public class ImplicitWaitWithUtilityDemo {
	
	private WebDriver driver;
	private String baseURL;
	WaitTypes wt ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice/";
		wt = new WaitTypes(driver);
		
		// To maximize the browser
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() throws Exception {
		// To open the URL
		driver.get(baseURL);
		
		// Click on login button
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='/sign_in']"));		
		loginLink.click();
		
		//Explicit wait
		WebElement emailField = wt.waitForElement(By.xpath("//input[@id='user_email']"), 3);
				
		wt.clickWhenReady(By.name("commit"), 3);
		// Enter user name
		emailField.sendKeys("Test");
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
