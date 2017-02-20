package TestCases.GenericTestCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {
	
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice/";
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		// To open the URL
		driver.get(baseURL);
		
		// Click on login button
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		
		// Enter user name
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("test");
	
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
