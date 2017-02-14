package frameworklite;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {
	private WebDriver driver;
	private String baseURL; 

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice/";
		driver.get(baseURL);
	}
	@Test
	public void test() throws InterruptedException {

		// Wait
		Thread.sleep(3000);
		
		// Switch frames using ID
		//driver.switchTo().frame("courses-iframe");
		
		// Switch frames using name
		driver.switchTo().frame("iframe-name");
		
		// Switch frames using number
		//driver.switchTo().frame(0);
		
		// Send text on search field
		WebElement search = driver.findElement(By.id("search-courses"));
		search.sendKeys("python");

	}
	
	@After
	public void tearDown() throws Exception {
		
		// Wait
		Thread.sleep(3000);
		
		driver.quit();
	}

}
