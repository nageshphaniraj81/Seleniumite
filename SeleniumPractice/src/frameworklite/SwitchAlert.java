package frameworklite;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SwitchAlert {
	private WebDriver driver;
	private String baseURL; 
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice/";
		driver.get(baseURL);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		Thread.sleep(2000);
		
		// Scroll Down
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Nagesh");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

	}
	
	@Test
	public void test2() throws InterruptedException {
		
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		Thread.sleep(2000);
		
		// Scroll Down
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Nagesh");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

	}
	
	@After
	public void tearDown() throws Exception {
		// Wait
		Thread.sleep(3000);
		driver.quit();
	}

}
